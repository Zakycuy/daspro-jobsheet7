package JS7_Tgl11;
import java.util.Scanner;;

public class TheTriangleNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput;
        int i = 0;
        String s = "";

        System.out.print("Input some number: ");
        numInput = sc.nextInt();

        for (i = 1;i <= numInput; i++) {
            s += " *";
            System.out.println(s);
        }
    }
}
