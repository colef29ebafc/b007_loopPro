public class b007_loopPro {
    public static void main(String[] args) {

        // Part 1:
        // Prints 1-10 the prints "Lift Off!"
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off!");

        // Part 2:
        // Assign variables for while loop
        int n = 1;
        String i = "Hello";
        // While loop that prints Hello 5 times and are numbered
        while(n <= 5) {
            System.out.println(i + " " + n);
            n++;
        }

        // Part 3:
        // Prints "7 * " then the numbers 1-10 with the answer
        int total = 7;
        for(n = 1; n <= 10; n++) {
            System.out.println("7 * " + n + " = " + total);
            total += 7;
        }

        // Bonus:
        // Adds up all numbers from 1-100
        int f = 0;
        int totalThree = 0;
        while(f < 100) {
            f++;
            totalThree += f;
        }
        System.out.println(totalThree);
    }
}