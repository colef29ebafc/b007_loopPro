public class b007_loopPro {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off!");
        int n = 1;
        String i = "Hello";
        while(n <= 5) {
            System.out.println(i + " " + n);
            n++;
        }
        int total = 7;
        for(n = 1; n <= 10; n++) {
            System.out.println("7 * " + n + " = " + total);
            total += 7;
        }
        int f = 0;
        int totalThree = 0;
        while(f < 100) {
            f++;
            totalThree += f;
        }
        System.out.println(totalThree);
    }
}