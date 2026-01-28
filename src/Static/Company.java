package Static;

public class Company {
    static String CompanyName = "Data Mining Groups";
    private String employeeName ;

    public Company(String employeeName){
        this.employeeName=employeeName;
    }

    public static void updateCompanyName(String newName){
        CompanyName = newName;
        System.out.println("updated company name is :"+CompanyName);
    }

    public void displayInfo() {
        System.out.println("Employee: " + employeeName +
                ", Company: " + CompanyName);
    }
}
