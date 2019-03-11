import java.util.ArrayList;
import java.util.List;

public class State {
    private String name; //state initials or name
    private List<County> counties; //list of counties

    public State(String name) {
        this.name = name;
        counties = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void addCounty(County c) {
        counties.add(c);
    }

    public void removeCounty(County c) {
        counties.remove(c);
    }

    public List<County> getCounties() {
        return this.counties;
    }

    public void setCounties(List <County> ls) {this.counties = ls;}

}
