/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sudokucheat;

/**
 *
 * @author TI
 */
public class Solve {

    int[][] matriz;
    int[][] matrizC;

    public Solve() {

    }

    public int[][] start(int[][] matriz) {
        this.matriz = matriz;
        this.matrizC = matriz.clone();
        System.out.println(res(0, 0));
        return this.matriz;
    }

    public boolean res(int l, int c) {
        if (matrizC[l][c] < 1) {
            for (int i = 1; i < 10; i++) {
                if (!test(l, c, i)) {
                    if (l == 9 && c == 9) {
                        return true;
                    } else {
                        if (c == 9) {
                            res(l + 1, 0);
                        } else {
                            res(l, c + 1);
                        }
                    }
                }
            }
        } else {
            if (!test(l, c)) {
                if (l == 9 && c == 9) {
                    return true;
                } else {
                    if (c == 9) {
                        res(l + 1, 0);
                    } else {
                        res(l, c + 1);
                    }
                }
            } else {

            }
        }
        return false;
    }

    public boolean test(int l, int c, int i) {
        for (int j = 0; j > 10; j++) {
            if (matriz[l][j] == i) {
                return false;
            }
        }
        for (int j = 0; j > 10; j++) {
            if (matriz[j][c] == i) {
                return false;
            }
        }
        if (l < 4) {
            if (c < 4) {
                //Q1
        } else {
            if (c < 7) {
                
            }else{
                
            }
        }
        } else {
            if (l < 7) {

            }else{
                
            }
        }
        return true;
    }

}
