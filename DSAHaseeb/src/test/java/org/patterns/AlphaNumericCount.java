package org.patterns;

public class AlphaNumericCount {

    /**
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */
    public static void number(int n){
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num+=1;
            }
            System.out.println();
        }
    }


    /**
     * A
     * AB
     * ABC
     * ABCD
     * ABCDE
     * @param n
     */
    public static void Alphabets(int n){

        for(int i=n;i>=0;i--){
            char c = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }


    /**
     * A
     * BB
     * CCC
     * DDDD
     * EEEEE
     * @param n
     */
    public static void AlphaRepeat(int n){
        char c = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }

    /**
     *     A
     *    ABA
     *   ABCBA
     *  ABCDCBA
     * ABCDEDCBA
     *
     */
    public static void AlphaSpace(int n){

        for(int i=0;i<n;i++) {
            //space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            //characters
            char c = 'A';
            int breakpoint = (2*i+1)/2;
            for(int k=1;k<=(2*i)+1;k++){
                System.out.print(c);
                if(k<=breakpoint) {
                    c++;
                }else
                    c--;
            }
            //space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number(5);
        Alphabets(5);
        AlphaRepeat(5);
        AlphaSpace(5);

    }
}
