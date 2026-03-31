class Complaint {
    int id;
    String type;
    String description;
    String status;

    Complaint(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.status = "Pending";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("-----------------------");
    }
}