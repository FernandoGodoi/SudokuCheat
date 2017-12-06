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
        System.out.println(res(0, 0,matriz));
        return this.matriz;
    }

    public boolean res(int l, int c,int[][]mat) {
        int[][] matrizA = mat.clone();
        if (matrizC[l][c] < 1) {
            for (int i = 1; i < 10; i++) {
                if (test(l, c, i,matrizA)) {
                    if (l == 8 && c == 8) {
                        return true;
                    } else {
                        if (c == 8) {
                            res(l + 1, 0,matrizA);
                        } else {
                            res(l, c + 1,matrizA);
                        }
                    }
                }
            }
        } else {

            if (l == 8 && c == 8) {
                return true;
            } else {
                if (c == 8) {
                    res(l + 1, 0,matrizA);
                } else {
                    res(l, c + 1,matrizA);
                }
            }

        }
        this.matriz = matrizA;
        return false;
    }

    public boolean test(int l, int c, int i, int[][]matriz) {
        for (int j = 0; j <9; j++) {
            if (matriz[l][j] == i) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (matriz[j][c] == i) {
                return false;
            }
        }
        if (l < 3) {
            if (c < 3) {
                //Q1
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (matriz[j][k] == i) {
                            return false;
                        }
                    }

                }
            } else {
                if (c < 6) {
                    //Q2
                    for (int j = 0; j < 3; j++) {
                        for (int k = 3; k < 6; k++) {
                            if (matriz[j][k] == i) {
                                return false;
                            }
                        }

                    }
                } else {
                    //Q3
                    for (int j = 0; j < 3; j++) {
                        for (int k = 6; k < 9; k++) {
                            if (matriz[j][k] == i) {
                                return false;
                            }
                        }

                    }
                }
            }
        } else {
            if (l < 6) {
                if (c < 3) {
                    //Q4
                    for (int j = 3; j < 6; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (matriz[j][k] == i) {
                                return false;
                            }
                        }

                    }
                } else {
                    if (c < 6) {
                        //Q5
                        for (int j = 3; j < 6; j++) {
                            for (int k = 6; k < 6; k++) {
                                if (matriz[j][k] == i) {
                                    return false;
                                }
                            }

                        }
                    } else {
                        //Q6
                        for (int j = 3; j < 6; j++) {
                            for (int k = 6; k < 9; k++) {
                                if (matriz[j][k] == i) {
                                    return false;
                                }
                            }

                        }
                    }
                }

            } else {
                if (c < 3) {
                    //Q7
                    for (int j = 6; j < 9; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (matriz[j][k] == i) {
                                return false;
                            }
                        }

                    }
                } else {
                    if (c < 6) {
                        //Q8
                        for (int j = 6; j < 9; j++) {
                            for (int k = 3; k < 6; k++) {
                                if (matriz[j][k] == i) {
                                    return false;
                                }
                            }

                        }
                    } else {
                        //Q9
                        for (int j = 6; j < 9; j++) {
                            for (int k = 6; k < 9; k++) {
                                if (matriz[j][k] == i) {
                                    return false;
                                }
                            }

                        }
                    }
                }
            }
        }
        matriz[l][c]=i;
        return true;
    }

}
