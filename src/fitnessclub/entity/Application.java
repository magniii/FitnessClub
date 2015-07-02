package fitnessclub.entity;

/**
 *
 * @author magni
 */
public class Application {
    private int id;
    private int state;
    private String text;

    public Application(int id) {
        this.id = id;
        this.state = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
