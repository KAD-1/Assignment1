import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name1 = scan.nextLine();
        System.out.println("Enter age:");
        int age1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Name:");
        String name2 = scan.nextLine();
        System.out.println("Enter age:");
        int age2 = scan.nextInt();
        scan.nextLine();

        User user1 = new User(name1, age1);
        User user2 = new User(name2, age2);
        WorkoutPlan plan1 = new WorkoutPlan("Pushups", 30);
        WorkoutPlan plan2 = new WorkoutPlan("Squats", 25);

        FitnessApp.addUser(user1);
        FitnessApp.addUser(user2);

        FitnessApp.showUsers();

        System.out.println("\nSearch by name:");
        System.out.println(FitnessApp.searchByName(name1));

        System.out.println("\nFilter by age >= 20:");
        FitnessApp.filterByAge(20);

        System.out.println("\nFilter by hashCode:");
        FitnessApp.filterByHashCode();

        System.out.println("\nSort by age:");
        FitnessApp.sortByAge();
        FitnessApp.showUsers();

        FitnessApp.displayUserInfo(user1, user2);
        FitnessApp.displayWorkoutPlans(plan1, plan2);
        FitnessApp.compareWorkoutDurations(plan1, plan2);
        FitnessApp.updateUserInfo(user1, user2);
    }
}
