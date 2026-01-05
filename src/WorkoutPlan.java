public class WorkoutPlan {
    private String wname;
    private int reps;

    public WorkoutPlan(String wname, int reps) {
        this.wname = wname;
        this.reps = reps;
    }

    public void setvalues(int reps, String wname) {
        this.reps = reps;
        this.wname = wname;
    }

    public int getreps() { return reps; }
    public String getwname() { return wname; }

    public void showworkout() {
        System.out.println("Workout: " + wname + ", Reps: " + reps);
    }
}
