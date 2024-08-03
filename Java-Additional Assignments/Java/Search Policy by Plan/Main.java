import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of policy");
        int numPolicies = scanner.nextInt();
        scanner.nextLine();
        List<Policy> policylist = new ArrayList<>();
        for (int i = 0; i < numPolicies; i++) {
            System.out.println("Enter the policy " + (i + 1) + " detail");
            String[] details = scanner.nextLine().split(",");
            Policy policy = new Policy(details[0], details[1], Double.parseDouble(details[2]), details[3], Double.parseDouble(details[4]));
            policylist.add(policy);
        }
        Map<String, List<Policy>> policyMap = Policy.generatePolicyMap(policylist);

        System.out.println("Enter the policy plan to be searched");
        String searchplan = scanner.nextLine();
        List<Policy> resultpolicies = Policy.searchPolicy(policyMap, searchplan);
        if (resultpolicies.isEmpty()) {
            System.out.println("Searched policy not found");
        } else {
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Policy Id", "Customer Name", "Policy Value", "Policy plan", "Coverage Percentage");
            for (Policy policy : resultpolicies) {
                System.out.printf("%-15s %-15s %-15s %-15s %s\n", policy.getPolicyId(), policy.getCustomerName(), policy.getPolicyValue(), policy.getPolicyPlan(), policy.getCoveragePercentage());
            }
        }
    }
}
