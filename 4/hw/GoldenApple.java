
public class GoldenApple extends Apple {

    public GoldenApple(double weight) {
        super(weight);
    }
    @Override
    public String toString() {
        
        return String.format("GoldenApple: %s", String.valueOf(this.getWeight()));
    }
}
