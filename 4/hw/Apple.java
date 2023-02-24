public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }
    @Override
    public String toString() {
        
        return String.format("Яблоко : %s", String.valueOf(this.getWeight()));
    }

}
