import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Complaint> complaints = new ArrayList<>();

        int choice;
        int id = 1;

        do {
            System.out.println("\n1. Add Complaint");
            System.out.println("2. View Complaints");
            System.out.println("3. Update Complaint Status");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter complaint type: ");
                String type = sc.nextLine();

                System.out.print("Enter description: ");
                String desc = sc.nextLine();

                Complaint c = new Complaint(id++, type, desc);
                complaints.add(c);

                System.out.println("Complaint added successfully!");

            } else if (choice == 2) {
                if (complaints.isEmpty()) {
                    System.out.println("No complaints yet.");
                } else {
                    for (Complaint c : complaints) {
                        c.display();
                    }
                }

            } else if (choice == 3) {
                if (complaints.isEmpty()) {
                    System.out.println("No complaints available to update.");
                } else {
                    System.out.print("Enter complaint ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Complaint c : complaints) {
                        if (c.id == updateId) {
                            System.out.print("Enter new status: ");
                            c.status = sc.nextLine();
                            System.out.println("Status updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Complaint ID not found.");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Exiting...");

            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}