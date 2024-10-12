package JS7_Tgl11;
import java.util.Scanner;;
public class DisplayTwo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numinput;
        int result;

        System.out.print("Input some number: ");
        numinput = sc.nextInt();

        for (int i = 1; i <= numinput / 2; i++){
            result = i * 2;
                System.out.print( result + " " );
        }System.out.print("%");
    }
}
