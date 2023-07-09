package com.arrays;

 class Main {

	protected final String s1 = "null";
	protected static final String s2 = "s2";

	protected class demo{

	}

	protected static void m1(){
		System.out.println("Static method private ");
	}

	protected  void m2(){
		System.out.println("non method private  ");
	}

    public static void main(String[] args) {
	    int[] intArray = new int[7];

	    intArray[0] = 20;
	    intArray[1] = 35;
	    intArray[2] = -15;
	    intArray[3] = 7;
	    intArray[4] =55;
	    intArray[5] = 1;
	    intArray[6] = -22;

	    int index = -1;
	    for (int i = 0; i < intArray.length; i++) {
	        if (intArray[i] == 7) {
	            index = i;
	            break;
            }
        }

        System.out.println("index = " + index);


		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");

		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false

		System.out.println("equals method");

		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));



	}
}


