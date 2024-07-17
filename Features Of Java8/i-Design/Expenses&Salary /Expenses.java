class Expenses {
    private String expenseType;
    private Double cost;

    public Expenses(String expenseType, Double cost) {
        this.expenseType = expenseType;
        this.cost = cost;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public Double getCost() {
        return cost;
    }
}
