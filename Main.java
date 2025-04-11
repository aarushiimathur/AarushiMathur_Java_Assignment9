import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    StudentOperation.insertStudent();
                    break;
                case 2:
                    StudentOperation.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN: ");
                    StudentOperation.searchByPRN(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Name: ");
                    StudentOperation.searchByName(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter Position (row number): ");
                    StudentOperation.searchByPosition(scanner.nextInt());
                    break;
                case 6:
                    System.out.print("Enter PRN to update: ");
                    StudentOperation.updateStudent(scanner.nextInt());
                    scanner.nextLine(); // clear newline
                    break;
                case 7:
                    System.out.print("Enter PRN to delete: ");
                    StudentOperation.deleteStudent(scanner.nextInt());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}
