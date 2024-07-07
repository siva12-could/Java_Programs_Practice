public class Department {
    private String departmentName;
    private Staff staff;

    public Department(String departmentName, Staff staff) {
        this.departmentName = departmentName;
        this.staff = staff;
    }

    public String getDepartName() {
        return departmentName;
    }

    public void display() {
        System.out.println("This method displays " + staff.getStaffName() + " is working in the " + departmentName + " department as " + staff.getDesignation() + ".");
    }
}
