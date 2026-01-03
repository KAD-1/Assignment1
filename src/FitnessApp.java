public class FitnessApp {
    public static void displayUserInfo(User user1, User user2) {
        System.out.println("User information: ");
        user1.showinfo();
        user2.showinfo();
    }
    public static void displayWorkoutPlans(WorkoutPlan plan1, WorkoutPlan plan2) {
        System.out.println("Workout Plans:");
        plan1.showworkout();
        plan2.showworkout();
    }
    public static void compareWorkoutDurations(WorkoutPlan plan1, WorkoutPlan plan2) {
        System.out.println("\nComparison of workout repeats:");
        if (plan1.getreps() > plan2.getreps()) {System.out.println("Plan 1 is harder");}
        else if (plan1.getreps() < plan2.getreps()) {System.out.println("Plan 2 is harder");}
        else {System.out.println("Both plans are of the same");}
    }
    public static void updateUserInfo(User user1, User user2) {
        user1.setAge(26);
        user2.setName("Mike");
        System.out.println("\nUpdated User Information:");
        user1.showinfo();
        user2.showinfo();
    }
}