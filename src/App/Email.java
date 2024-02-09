package App;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String alternateEmail;
    private int mailCapacity;

    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Your Department is: " + this.department);
    }
    private String setDepartment () {
        System.out.print("Department codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n Enter your Department: ");
        Scanner input = new Scanner(System.in);
        int depNumber = input.nextInt();
        if (depNumber == 1) {
            return "Sales";
        } else if (depNumber == 2) {
            return "Development";
        } else if (depNumber == 3) {
            return "Accounting";
        }else return "None";
    }

}
