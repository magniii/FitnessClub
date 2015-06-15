package fitnessclub.entity;

/**
 *
 * @author magni
 */
public class Order {
    private int num;
    private String text;

    public Order(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
