import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
        int n = input.nextInt();
        input.nextLine(); // consume the newline

        Stall stall;
        String details;

        switch (n) {
            case 1:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
                details = input.nextLine();
                String[] goldDetails = details.split(",");
                stall = new GoldStall(goldDetails[0], Integer.parseInt(goldDetails[1]), goldDetails[2], Integer.parseInt(goldDetails[3]));
                break;
            case 2:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
                details = input.nextLine();
                String[] premiumDetails = details.split(",");
                stall = new PremiumStall(premiumDetails[0], Integer.parseInt(premiumDetails[1]), premiumDetails[2], Integer.parseInt(premiumDetails[3]));
                break;
            case 3:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
                details = input.nextLine();
                String[] executiveDetails = details.split(",");
                stall = new ExecutiveStall(executiveDetails[0], Integer.parseInt(executiveDetails[1]), executiveDetails[2], Integer.parseInt(executiveDetails[3]));
                break;
            default:
                System.out.println("Invalid Stall Type");
                return;
        }

        stall.display();
    }
}
