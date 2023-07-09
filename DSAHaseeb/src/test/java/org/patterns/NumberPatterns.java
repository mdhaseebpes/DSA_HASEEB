package org.patterns;

public class NumberPatterns {

    /**
     * 0
     * 01
     * 010
     * 0101
     * 01010
     * 010101
     * @param n
     */
    public static void numPattern(int n){

        for(int i=0;i<n;i++){
            int k=1;
            if(i%2==0){
                k=1;
            }else {
                k=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(k + " ");
                 k= 1-k;
            }
            System.out.println();
        }
    }

    public static void numberReversePattern(int n){
        int space = 2*(n-1);
        for(int i=1;i<=n;i++) {
            //number
              for(int j=1;j<=i;j++){
                  System.out.print(j);
              }
            //space

            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void main(String[] args) {
        numPattern(7);
        numberReversePattern(4);
    }
}
