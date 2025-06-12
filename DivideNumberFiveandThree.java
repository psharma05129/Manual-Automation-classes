package LoopJava;

public class DivideNumberFiveandThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0 && i%3!=0) {
                continue; // Skip multiples of 5
            }
            System.out.println(i);
        }
	}

}
