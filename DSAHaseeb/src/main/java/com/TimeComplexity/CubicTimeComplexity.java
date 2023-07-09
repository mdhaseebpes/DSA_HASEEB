package com.TimeComplexity;



public class CubicTimeComplexity {


    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
              for(int k=0;k<=n;k++){
                  System.out.print(i + "" + j + "" + "" + k + " ");
              }
            }
            System.out.println();
        }

        //(1+n+n) (1+n+n+n)(1+n+n+n) == >  (1+2n) (1+3n) (1+3n) => n^3 + n^2 + n + 1 --> cubic equation
        //0(n^3)
        //3x+9y+8z =79
        multiNumberEquation(10);
    }

    public static void multiNumberEquation(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for(int k=0;k<=n;k++){
                    if(3*i+9*j+8*k==79) {
                        System.out.println(i + "," + j + "," + k );
                    }
                }
            }
        }
    }
}
