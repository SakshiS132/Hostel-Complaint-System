class Student {
    int studentId;
    String name;
    String roomNumber;

    Student(int studentId, String name, String roomNumber) {
        this.studentId = studentId;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Room Number: " + roomNumber);
    }
}
