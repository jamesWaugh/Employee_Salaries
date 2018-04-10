package Employee_Salaries;

public class Position {

    private String title;
    private double bonus;
    private Employee worker;

    public Position(String t, double b) {
        this.setTitle(t);
        if (b >= 0) {
            this.setBonus(b);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getBonus() {
        return this.bonus;
    }

    public Employee getWorker() {
        return this.worker;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setBonus(double b) {
        if (b >= 0) {
            this.bonus = b;
        }
    }

    public void setWorker(Employee w) {
        this.worker = w;
        if (worker != null) {
            this.worker.setYearlySalary((int) ((double) this.worker.getYearlySalary() + this.getBonus()));
        }
    }
}
