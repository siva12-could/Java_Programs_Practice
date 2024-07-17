import java.util.*; 
import java.util.stream.*; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Expenses> expensesList = new ArrayList<>();

    
        System.out.println("Enter expense for food");
        expensesList.add(new Expenses("food", scanner.nextDouble()));
        System.out.println("Enter expense for rent");
        expensesList.add(new Expenses("rent", scanner.nextDouble()));
        System.out.println("Enter expense for shopping");
        expensesList.add(new Expenses("shopping", scanner.nextDouble()));
        System.out.println("Enter expense for groceries");
        expensesList.add(new Expenses("groceries", scanner.nextDouble()));
        System.out.println("Enter expense for electricity");
        expensesList.add(new Expenses("electricity", scanner.nextDouble()));

        
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();

        
        double totalExpenses = expensesList.stream()
                .mapToDouble(Expenses::getCost)
                .sum();

    
        if (totalExpenses <= salary) {
            double savings = salary - totalExpenses;
            System.out.println("Savings amount will be Rs." + savings);
        } else {
            System.out.println("Expenses exceeds Salary");
        }

        scanner.close();
    }
}
