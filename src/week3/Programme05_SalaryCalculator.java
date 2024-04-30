package week3;
/**
 * import java.util.Scanner;
 *
 * public class SalaryCalculator {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *
 *         // Input employee details
 *         System.out.print("Enter Employee ID: ");
 *         int employeeId = scanner.nextInt();
 *         scanner.nextLine(); // Consume newline
 *         System.out.print("Enter Employee Name: ");
 *         String employeeName = scanner.nextLine();
 *         System.out.print("Enter Basic Salary: ");
 *         double basicSalary = scanner.nextDouble();
 *
 *         // Calculate HRA, TA, DA, PF, and Gross Salary
 *         double HRA = 0.10 * basicSalary;
 *         double TA = 0.09 * basicSalary;
 *         double DA = 0.08 * basicSalary;
 *         double PF = 0.20 * basicSalary;
 *         double grossSalary = basicSalary + HRA + TA + DA - PF;
 *
 *         // Print the salary slip
 *         System.out.println("_______________________________");
 *         System.out.println("| Salary Slip |");
 *         System.out.println("|______________________________|");
 *         System.out.println("| Employee Id : " + employeeId + " |");
 *         System.out.println("| Employee Name : " + employeeName + " |");
 *         System.out.println("|______________________________|");
 *         System.out.printf("| Basic Salary : %.1f |\n", basicSalary);
 *         System.out.printf("| HRA 10%% : %.1f |\n", HRA);
 *         System.out.printf("| TA 8%% : %.1f |\n", TA);
 *         System.out.printf("| DA 9%% : %.1f |\n", DA);
 *         System.out.printf("| PF - 20%% : %.1f |\n", PF);
 *         System.out.println("|______________________________|");
 *         System.out.printf("| Gross Salary : %.1f |\n", grossSalary);
 *         System.out.println("|===========================");
 *     }
 * }
 */

import java.util.Scanner;

public class Programme05_SalaryCalculator {
    static double basicSalary;
    static double HRA;
    static double TA;
    static double DA;
    static double PF;
    static double grossSalary;

    // Calculate HRA, TA, DA, PF, and Gross Salary
    public static void calculation(double salary){
        basicSalary = salary;
        HRA = 0.10 * salary;
        TA = 0.09 * salary;
        DA = 0.08 * salary;
        PF = 0.20 * salary;
        grossSalary = salary + HRA + TA + DA - PF;
    }

    // Print the salary slip
    public static void print(int empId, String empName){
        System.out.println("_____________________________");
        System.out.println("|\t\t Salary Slip\t\t |");
        System.out.println("|____________________________|");
        System.out.println("| Employee Id : " + empId + "\t\t |");
        System.out.println("| Employee Name : " + empName + "\t |");
        System.out.println("|____________________________|");
        System.out.printf("| Basic Salary \t: %.1f \t|\n", basicSalary);
        System.out.printf("| HRA 10%% \t\t: %.1f \t|\n", HRA);
        System.out.printf("| TA 8%% \t\t: %.1f \t|\n", TA);
        System.out.printf("| DA 9%% \t\t: %.1f \t|\n", DA);
        System.out.printf("| PF - 20%% \t\t: %.1f \t|\n", PF);
        System.out.println("|____________________________|");
        System.out.printf("| Gross Salary \t: %.1f \t|\n", grossSalary);
        System.out.println("|============================");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input employee details
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basSalary = scanner.nextDouble();
        calculation(basSalary);
        print(employeeId,employeeName);
        scanner.close();
    }
}