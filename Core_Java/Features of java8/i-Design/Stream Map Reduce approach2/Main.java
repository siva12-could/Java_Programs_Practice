import java.util.*; 
import java.util.stream.*; 

class Main
{
    public static void main(String args[]) {
        //Fill your code here
        List<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter expense for food");
        Integer food=input.nextInt();
        list.add(food);
        System.out.println("Enter expense for rent");
        Integer rent=input.nextInt();
        list.add(rent);
        System.out.println("Enter expense for shopping");
        Integer shopping=input.nextInt();
        list.add(shopping);
        System.out.println("Enter expense for groceries");
        Integer groceries=input.nextInt();
        list.add(groceries);
        System.out.println("Enter expense for electricity");
        Integer electricity=input.nextInt();
        list.add(electricity);
        System.out.println("Enter salary");
        Integer salary=input.nextInt();
        Integer s1=0;
        
        for(Integer s:list){
            s1+=s;
        }
        Integer result=(salary-s1);
        double finalre=result;
        if(salary<s1){
            System.out.println("Expenses exceeds Salary");
        }
        else{
            System.out.println("Savings amount will be Rs."+finalre);
        }
        

    }
}
