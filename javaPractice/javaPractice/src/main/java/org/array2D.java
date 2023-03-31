package org;

public class array2D {
    public static void main(String[] args) {
        double acumulate, interes=0.10, saldo[][]=new double[6][5];
        for(int i=0;i<6;i++){
            saldo[i][0]=10000;
            acumulate=10000;
            for(int j=1;j<5;j++){
                acumulate=acumulate*1.10;
                saldo[i][j]=acumulate;
            }
            interes=interes+0.01;
        }
        for(int z=0;z<6;z++){

            for(int h=0;h<5;h++){
                System.out.printf("%1.2f",saldo[z][h]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
