package org.patterns;

public class Star {

    /**
     * 1
     * 12
     * 123
     * 1234
     * @param n
     */
    public static void starPattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    /**
     * 1
     * 22
     * 333
     * 4444
     * @param n
     */
    public static void numberPattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    /**
     * 12345
     * 1234
     * 123
     * 12
     * 1
     * @param n
     */
    public static void numberReversePattern(int n){
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * *
     *      ***
     *     *****
     *    *******
     *   *********
     *  ***********
     * *************
     * @param n
     */
    public static void starSpacePattern(int n){
        for(int i=0;i<n;i++)
        {
            for(int k=n-i-1;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        starPattern(5);
        System.out.println();
        numberPattern(5);
        System.out.println();
        numberReversePattern(5);
        System.out.println();
        starSpacePattern(7);

    }
}
