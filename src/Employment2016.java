public class Employment2016 {

    private int totalLaborForce;
    private int employedLaborForce;
    private int unemployedLaborForce;
    private double unemployedPercent;

    public Employment2016() {

    }

    public Employment2016(int totalLaborForce, int employedLaborForce, int unemployedLaborForce, double unemployedPercent) {
        this.totalLaborForce = totalLaborForce;
        this.employedLaborForce = employedLaborForce;
        this.unemployedLaborForce = unemployedLaborForce;
        this.unemployedPercent = unemployedPercent;
    }

    public int getTotalLaborForce() {
        return totalLaborForce;
    }

    public void setTotalLaborForce(int totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public int getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(int employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public int getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(int unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }

    public String toString() { return ("totalLaborForce " + totalLaborForce + " employedLaborForce " + employedLaborForce + " unemployedLaborForce " + unemployedLaborForce + " unemployedPercent " + unemployedPercent);}
}
