package Static;

public class CompanyTest {
    static void main(String[] args) {
        Company emp1 = new Company("Alice Johnson");
        Company emp2 = new Company("Bob Smith");
        Company emp3 = new Company("Carol Williams");

        System.out.println("Initially:");
        emp1.displayInfo();  // Employee: Alice Johnson, Company: Default Tech Solutions
        emp2.displayInfo();  // Employee: Bob Smith, Company: Default Tech Solutions
        emp3.displayInfo();  // Employee: Carol Williams, Company: Default Tech Solutions

        System.out.println("\nAfter updating company name:");

        // Call static method to update companyName - affects all objects
        Company.updateCompanyName("Global Innovations Inc.");

        // Now all objects reflect the updated company name
        emp1.displayInfo();  // Employee: Alice Johnson, Company: Global Innovations Inc.
        emp2.displayInfo();  // Employee: Bob Smith, Company: Global Innovations Inc.
        emp3.displayInfo();  // Employee: Carol Williams, Company: Global Innovations Inc.

        // Can also call via any instance (though not recommended style)
        emp2.updateCompanyName("NextGen Technologies");

        emp1.displayInfo();  // Employee: Alice Johnson, Company: NextGen Technologies
        emp3.displayInfo();  // Employee: Carol Williams, Company: NextGen Technologies
    }
}

