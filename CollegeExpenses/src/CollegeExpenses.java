import java.util.Scanner;
import static java.lang.System.in;
public class CollegeExpenses {


        public static void main(String[] args) {

            createStudent();
        }

        public static void createStudent(){

            Scanner input = new Scanner(in);
            System.out.println("Please enter the following information: ");
            System.out.println("Enter your full name: ");
            String name = input.nextLine();
            System.out.println("Enter the year your are in.");
            String year = input.nextLine();
            System.out.println("Enter cost of your school supplies: ");
            double supplycost = input.nextDouble();
            System.out.println("Enter amount of credit hours: ");
            int creditHours = input.nextInt();
            System.out.println("Enter cost of each credit hour: ");
            double CostofCreditHours = input.nextDouble();
            double CostsTotal = supplycost + (CostofCreditHours * creditHours) + extraCosts();

            Student student = new Student(name, year, supplycost, creditHours, CostofCreditHours, CostsTotal);

            System.out.println(student.toString());
        }


        public static double extraCosts(){

            double ExpenseTotal = 0;
            Scanner input = new Scanner(in);
            System.out.println("Are you going to dorm at college? (Yes/No)");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("How long are you going to stay? (In weeks)");
                int weeks = input.nextInt();
                System.out.println("How much is the weekly expense?");
                double expense = input.nextDouble();
                System.out.println("How much are dorming costs?");
                double CostofDorm = input.nextDouble();
                ExpenseTotal = CostofDorm + ( expense * (double) weeks );
            } else {
                System.out.println("Its a good thing, you're saving money.");
            }

            return ExpenseTotal;
        }
    }

