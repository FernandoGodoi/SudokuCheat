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
public class Teste {

    public static void main(String[] args) {
        Solve solve = new Solve();
        int[][] matriz = {{0, 6, 2, 0, 1, 0, 0, 8, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 3},
        {0, 0, 1, 0, 9, 4, 0, 0, 0},
        {5, 0, 7, 4, 0, 0, 0, 0, 2},
        {9, 0, 0, 0, 8, 1, 0, 0, 0},
        {0, 0, 0, 7, 0, 0, 0, 0, 6},
        {0, 0, 0, 0, 0, 0, 0, 6, 0},
        {0, 0, 0, 0, 0, 8, 4, 0, 0},
        {0, 0, 5, 0, 2, 0, 0, 0, 0}};
        solve.start(matriz);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("- "+solve.matriz[i][j]);
            }
            System.out.print("\n");
        }
        
    }
}
