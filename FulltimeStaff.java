
import java.util.Scanner;

public class FulltimeStaff extends Staff {
    private double basicSalary;

    public FulltimeStaff(String no, String name, int age,
                         double basicSalary) {
        super(no, name, age);
        this.basicSalary = basicSalary;
    }

    @Override
    public void display() {
        double deductions = basicSalary * 0.10;
        double netPay = basicSalary - deductions;

        super.display();
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Deductions: $" + deductions);
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

        System.out.print("Enter monthly basic salary: ");
        double salary = Double.parseDouble(input.nextLine());

        if (age < 0 || salary < 0) {
            System.out.println("Age and salary cannot be negative.");
        } else {
            FulltimeStaff staff =
                new FulltimeStaff(no, name, age, salary);
            staff.display();
        }

        input.close();
    }
}
