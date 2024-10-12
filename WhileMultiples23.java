package JS7_Tgl11;
import java.util.Scanner;;

public class WhileMultiples23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, counter = 0;
        int multiple;
        

        System.out.print("Input the multiple: ");
        multiple = sc.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        i++;
        }
        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all of %d in range 1 to 50 is %d.\n", multiple, sum);
    }
}
