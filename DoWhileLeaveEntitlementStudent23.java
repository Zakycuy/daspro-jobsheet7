package JS7_Tgl11;

import java.util.Scanner;

public class DoWhileLeaveEntitlementStudent23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        do {
            System.out.print("Input The Number of Leave Entitlement: ");
            leaveEntitlement = sc.nextInt();
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = sc.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You can only take as many leave days as: " + leaveEntitlement + " days");
                    break;
                }
            }else {
                break;
            }
        } while (leaveEntitlement > 0);
    }
}
