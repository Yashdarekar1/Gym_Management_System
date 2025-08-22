import java.util.*;

public class GymManagementSystem {
    private static List<member> members = new ArrayList<>();
    private static List<trainer> trainers = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Gym Management System =====");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Add Trainer");
            System.out.println("4. View Trainers");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addMember();
                case 2 -> viewMembers();
                case 3 -> addTrainer();
                case 4 -> viewTrainers();
                case 5 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);
    }

    private static void addMember() {
        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Membership Type (Monthly/Yearly): ");
        String membershipType = sc.nextLine();

        member member = new member(id, name, age, membershipType);
        members.add(member);
        System.out.println("Member added successfully!");
    }

    private static void viewMembers() {
        System.out.println("\n--- Member List ---");
        if (members.isEmpty()) {
            System.out.println("No members available.");
        } else {
            for (member m : members) {
                System.out.println(m);
            }
        }
    }

    private static void addTrainer() {
        System.out.print("Enter Trainer ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Trainer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Specialty (e.g., Cardio, Strength, Yoga): ");
        String specialty = sc.nextLine();

        trainer trainer = new trainer(id, name, specialty);
        trainers.add(trainer);
        System.out.println("Trainer added successfully!");
    }

    private static void viewTrainers() {
        System.out.println("\n--- Trainer List ---");
        if (trainers.isEmpty()) {
            System.out.println("No trainers available.");
        } else {
            for (trainer t : trainers) {
                System.out.println(t);
            }
        }
    }
}
