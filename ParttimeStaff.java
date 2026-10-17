
import java.util.Scanner;

public class ParttimeStaff extends Staff {
    private int hoursWorked;
    private final double ratePerHour = 10.0;

    public ParttimeStaff(String no, String name, int age,
                         int hoursWorked) {
        super(no, name, age);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void display() {
        double totalPay = hoursWorked * ratePerHour;
        double tax = totalPay * 0.30;
        double netPay = totalPay - tax;

        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Rate Per Hour: $" + ratePerHour);
        System.out.println("Total Pay: $" + totalPay);
        System.out.println("Tax (30%): $" + tax);
        System.out.println("Net Monthly Pay: $" + netPay);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter staff number: ");
        String no = input.nextLine();

        System.out.print("Enter staff name: ");
        String name = input.nextLine();

        System.out.print("Enter staff age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Enter hours worked this month: ");
        int hours = Integer.parseInt(input.nextLine());

        if (age < 0 || hours < 0) {
            System.out.println("Age and hours cannot be negative.");
        } else {
            ParttimeStaff staff =
                new ParttimeStaff(no, name, age, hours);
            staff.display();
        }

        input.close();
    }
}
