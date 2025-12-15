public class WorkoutPlan {
    private String wname;
    private int reps;
    public WorkoutPlan(String wname, int reps) {
        this.wname = wname;
        this.reps = reps;
    }
    public String getwname() {return wname;}
    public int getreps() {return reps;}
    public void setreps(int reps) {this.reps = reps;}
    public void showworkout() {System.out.println("Workout: " + wname + ", Reps: " + reps + " reps");
    }
}
