package org.vinoth.test3;

public class MainApp {

	public static void main(String[] args) {
		
		Stopwatch method1 = new Stopwatch();
		
		methodTest();
		
		System.out.println(method1.timeTakenToExecute());
	}

	private static void methodTest() {
		
		int i = 0;
        int z = 10;

        // Loop with two variables.
        while (i < z) {
            i++;
            z--;

            // Display the values.
            System.out.println(i + "/" + z);
        }
		
	}

}
