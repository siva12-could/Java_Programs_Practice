import java.util.*; 
import java.util.stream.*; 

class Main
{
    public static void main(String args[]) {
        //Fill your code here
    	List<Expenses> expenselist=new ArrayList<>();
    	Scanner input=new Scanner(System.in);
    	System.out.println("Enter expense for food");
    	Expenses obj1=new Expenses("food",input.nextDouble());
    	expenselist.add(obj1);
    	System.out.println("Enter expense for rent");
    	Expenses obj2=new Expenses("rent",input.nextDouble());
    	expenselist.add(obj2);
    	System.out.println("Enter expense for shopping");
    	Expenses obj3=new Expenses("shopping",input.nextDouble());
    	expenselist.add(obj3);
    	System.out.println("Enter expense for groceries");
    	Expenses obj4=new Expenses("groceries",input.nextDouble());
    	expenselist.add(obj4);
    	
    	System.out.println("Enter expense for electricity");
    	Expenses obj5=new Expenses("electricity",input.nextDouble());
    	expenselist.add(obj5);
    	System.out.println("Enter salary");
    	double salary=input.nextDouble();
    	double sum=0;
    	for(Expenses ex:expenselist) {
    		sum+=ex.getCost();
    	}
    	if(sum<salary) {
    		System.out.println("Savings amount will be Rs."+(salary-sum));
    	}
    	else if(sum>salary) {
    		System.out.println("Expenses exceeds Salary");
    	}
    	else if(sum==salary) {
    		System.out.println("Savings amount will be Rs."+(sum-salary));
    	}
    	
    	
    }
}
