package JS7_Tgl11;

import java.util.Scanner;

public class ForMultiples23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, counter = 0;
        int multiple;
        double avarage;

        System.out.print("Input the multiple: ");
        multiple = sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }
        avarage = sum / counter;

        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all of %d in range 1 to 50 is %d.\n", multiple, sum);
        System.out.println("The Avarage of all is " + avarage);

        sc.close();
    }
}
