import java.util.List;

public class DataManager {

    private List<State> states;

    public DataManager(List<State> states) {
        this.states = states;
    }

    private void addState(State s) {
        states.add(s);
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

}
