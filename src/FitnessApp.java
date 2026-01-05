import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FitnessApp {

    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static void showUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }

    public static User searchByName(String name) {
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name)) {
                return u;
            }
        }
        return null;
    }

    public static void filterByAge(int minAge) {
        for (User u : users) {
            if (u.getAge() >= minAge) {
                System.out.println(u);
            }
        }
    }

    public static void filterByHashCode() {
        for (User u : users) {
            if (u.hashCode() % 10 == 0) {
                System.out.println(u);
            }
        }
    }

    public static void sortByAge() {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }

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
        if (plan1.getreps() > plan2.getreps()) {
            System.out.println("Plan 1 is harder");
        } else if (plan1.getreps() < plan2.getreps()) {
            System.out.println("Plan 2 is harder");
        } else {
            System.out.println("Both plans are of the same");
        }
    }

    public static void updateUserInfo(User user1, User user2) {
        user1.setValue("Mike", 26);
        System.out.println("\nUpdated User Information:");
        user1.showinfo();
        user2.showinfo();
    }
}
