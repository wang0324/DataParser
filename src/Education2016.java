public class Education2016 {

    private double noHighSchool;
    private double onlyHighSchool;
    private double someCollege;
    private double bachelorsOrMore;

    public Education2016(double noHighSchool, double onlyHighSchool, double someCollege, double bachelorsOrMore) {
        this.noHighSchool = noHighSchool;
        this.onlyHighSchool = onlyHighSchool;
        this.someCollege = someCollege;
        this.bachelorsOrMore = bachelorsOrMore;
    }

    public Education2016() {
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public void setNoHighSchool(double noHighSchool) {
        this.noHighSchool = noHighSchool;
    }

    public double getOnlyHighSchool() {
        return onlyHighSchool;
    }

    public void setOnlyHighSchool(double onlyHighSchool) {
        this.onlyHighSchool = onlyHighSchool;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachelorsOrMore() {
        return bachelorsOrMore;
    }

    public void setBachelorsOrMore(double bachelorsOrMore) {
        this.bachelorsOrMore = bachelorsOrMore;
    }

    public String toString() { return ("No HighSchool " + noHighSchool + " onlyHighSchool " + onlyHighSchool + " someCollege " + someCollege + " bachelorsOrMore " + bachelorsOrMore);}
}
