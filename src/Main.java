import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        db database = new db();
        database.connectToDatabase();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1-Read data from table");
        System.out.println("2-Write data into table");
        System.out.println("3-Delete data from table");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                database.printData();
                break;

            case 2:
                System.out.print("Enter num of data: ");
                int n = scanner.nextInt();
                scanner.nextLine();
                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter name for person " + i + ": ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age for person " + i + ": ");
                    int age = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter gender for person " + i + ": ");
                    String gender = scanner.nextLine();

                    database.insertData(name, age, gender);
                }
                break;
            case 3:
                System.out.print("Enter id of data to be deleted: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                database.deleteDataById(id);
        }

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter Name:");
//        String name1 = scan.nextLine();
//        System.out.println("Enter age:");
//        int age1 = scan.nextInt();
//        scan.nextLine();
//
//        System.out.println("Enter Name:");
//        String name2 = scan.nextLine();
//        System.out.println("Enter age:");
//        int age2 = scan.nextInt();
//        scan.nextLine();
//
//        User user1 = new User(name1, age1);
//        User user2 = new User(name2, age2);
//        WorkoutPlan plan1 = new WorkoutPlan("Pushups", 30);
//        WorkoutPlan plan2 = new WorkoutPlan("Squats", 25);
//
//        FitnessApp.addUser(user1);
//        FitnessApp.addUser(user2);
//
//        FitnessApp.showUsers();
//
//        System.out.println("\nSearch by name:");
//        System.out.println(FitnessApp.searchByName(name1));
//
//        System.out.println("\nFilter by age >= 20:");
//        FitnessApp.filterByAge(20);
//
//        System.out.println("\nFilter by hashCode:");
//        FitnessApp.filterByHashCode();
//
//        System.out.println("\nSort by age:");
//        FitnessApp.sortByAge();
//        FitnessApp.showUsers();
//
//        FitnessApp.displayUserInfo(user1, user2);
//        FitnessApp.displayWorkoutPlans(plan1, plan2);
//        FitnessApp.compareWorkoutDurations(plan1, plan2);
//        FitnessApp.updateUserInfo(user1, user2);

    }
}
