public class Orange extends Fruit {

    public Orange(double weight) {
        super(weight);
    }
    @Override
    public String toString() {
        
        return String.format("Orange : %s", String.valueOf(this.getWeight()));
    }
}
