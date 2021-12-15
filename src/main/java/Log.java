import java.io.Serializable;
import java.util.HashMap;

public class Log implements Serializable {
    private int seed;
    private Settings settings;
    HashMap<Integer,String> choices = new HashMap<Integer, String>();
    private int step;

    Log(int seed, Settings settings) {
        this.seed = seed;
        this.settings = settings;
    }

    private int getSeed() {
        return seed;
    }

    private Settings getSettings() {
        return settings;
    }

    private String getChoice(int step) {
        return choices.get(step);

    }

    private void add(int step, City city) {
        choices.put(step,city.getName());
    }
}
