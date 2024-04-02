class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    // Override clone method to support cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        Organization originalOrg = new Organization("123", "ABC Corp", "123 Main St");

        try {
            // Clone the original organization
            Organization clonedOrg = (Organization) originalOrg.clone();

            // Print details of original and cloned organizations
            System.out.println("Original Organization:");
            originalOrg.printDetails();

            System.out.println("\nCloned Organization:");
            clonedOrg.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}



Output:

Original Organization:
Organization Code: 123
Organization Name: ABC Corp
Organization Address: 123 Main St

Cloned Organization:
Organization Code: 123
Organization Name: ABC Corp
Organization Address: 123 Main St
