import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private ArrayList<State> states;

    public DataManager(ArrayList<State> states) {
        this.states = states;
    }

    private void addState(State s) {
        states.add(s);
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public void displayAllData() {
        for (State state:states) {
            System.out.print(state.getName() + " ");
            for (County C:state.getCounties()) {
                System.out.println(C.getName() + " " + C.getEduc2016().toString()

            }
        }
    }

}
