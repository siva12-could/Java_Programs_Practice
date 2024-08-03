import java.util.*;
class Policy {
    private String policyId;
    private String customerName;
    private double policyValue;
    private String policyPlan;
    private double coveragePercentage;

    public Policy(String policyId, String customerName, double policyValue, String policyPlan, double coveragePercentage) {
        this.policyId = policyId;
        this.customerName = customerName;
        this.policyValue = policyValue;
        this.policyPlan = policyPlan;
        this.coveragePercentage = coveragePercentage;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPolicyValue() {
        return policyValue;
    }

    public String getPolicyPlan() {
        return policyPlan;
    }

    public double getCoveragePercentage() {
        return coveragePercentage;
    }

    public static Map<String, List<Policy>> generatePolicyMap(List<Policy> policyList) {
        Map<String, List<Policy>> policyMap = new HashMap<>();
        for (Policy policy : policyList) {
            policyMap.computeIfAbsent(policy.getPolicyPlan(), k -> new ArrayList<>()).add(policy);
        }
        return policyMap;
    }

    public static List<Policy> searchPolicy(Map<String, List<Policy>> policyMap, String policyPlan) {
        return policyMap.getOrDefault(policyPlan, new ArrayList<>());
    }
}
