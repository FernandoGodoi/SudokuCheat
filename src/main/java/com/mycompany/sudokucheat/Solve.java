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
    int[][] matrizC = new int[9][9];
    int[][] matrizR;

    public Solve() {

    }

    public int[][] start(int[][] matriz) {
        this.matriz = matriz;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.matrizC[i][j] = matriz[i][j];
            }
        } 

        return res(0, 0, matriz);
    }
    public void print(int[][] mat){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("- "+mat[i][j]);
            }
            System.out.print("\n");
        } 
    }
    public int[][] populate(int[][] mat){
        int[][] matrizA = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrizA[i][j] = mat[i][j];
            }
        }
        return matrizA;
    }
    public int[][] res(int l, int c, int[][] mat) {
        //System.out.print("\n"+l + " - " + c);
        int[][] matrizA = new int[9][9];
        matrizA = populate(mat);
        for (int i = 1; i < 10; i++) {
            //System.out.print(" i:"+i);
            
            while (matrizC[l][c] >= 1) {
                if (l == 8 && c == 8) {
                    System.out.println("aquia");
                    this.matrizR = matrizA.clone();
                    return matrizA;
                } else {
                    if (c == 8) {
                        l += 1;
                        c=0;
                    } else {
                        c += 1;
                    }
                }
               // System.out.print("\n"+l + " - " + c);
            }

            if (test(l, c, i, matrizA)) {
                if (l == 8 && c == 8) {
                    System.out.println("aqui");
                    print(matrizA);
                    break;
                } else {
                    if (c == 8) {
                        res(l + 1, 0, matrizA);
                    } else {
                        res(l, c + 1, matrizA);
                    }
                }
                //System.out.print("\n"+l + " - " + c);
            }
        }

        return matrizA;
    }

    public boolean test(int l, int c, int i, int[][] matriz) {
        for (int j = 0; j < 9; j++) {
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
        matriz[l][c] = i;
        return true;
    }

}
