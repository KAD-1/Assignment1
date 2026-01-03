import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name1 = scan.nextLine();
        System.out.println("Enter age:");
        int age1=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter workout:");
        String workout1 = scan.nextLine();
        System.out.println("Enter reps:");
        int reps1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Name:");
        String name2 = scan.nextLine();
        System.out.println("Enter age:");
        int age2=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter workout:");
        String workout2 = scan.nextLine();
        System.out.println("Enter reps:");
        int reps2 = scan.nextInt();

        User user1 = new User(name1, age1);
        User user2 = new User(name2, age2);
        WorkoutPlan plan1 = new WorkoutPlan(workout1, reps1);
        WorkoutPlan plan2 = new WorkoutPlan(workout2, reps2);
        FitnessApp.displayUserInfo(user1, user2);
        FitnessApp.displayWorkoutPlans(plan1, plan2);
        FitnessApp.compareWorkoutDurations(plan1, plan2);
        FitnessApp.updateUserInfo(user1, user2);
    }
}