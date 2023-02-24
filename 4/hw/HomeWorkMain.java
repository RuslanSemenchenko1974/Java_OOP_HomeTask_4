
public class HomeWorkMain {

    public static void main(String[] args) {
        // Fruit <- Orange, Apple <- GoldenApple

        // Нужно реализовать хранение фрукто в коробке Box:
        // По-умолчанию коробка пустая. Можно класть только фрукты какого-то вида!
        // Нужно уметь получать сумарный вес всех фруктов в коробке
        // Нужно уметь пересыпать все фрукты из одной коробки в другую

        //Box<String> stringBox = new Box<>(); // Не должно работать!

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addF(new Apple(3.2));
        appleBox1.addF(new Apple(2.5));
        appleBox1.addF(new GoldenApple(1.8));

        //appleBox1.add(new Orange(2.0)); // Не должно работать!

        System.out.println(appleBox1.getWeight()); 
        

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.addF(new GoldenApple(2.0));
        goldenAppleBox.addF(new GoldenApple(2.2));
        goldenAppleBox.addF(new GoldenApple(3.1));

        //goldenAppleBox.add(new Apple(2.0)); // Не должно работать

         System.out.println(goldenAppleBox.getWeight());
        
        System.out.println("appleBox1");
        for (var item:appleBox1){
            System.out.println(item);
        }
        

        Box<Apple> appleBox2 = new Box<Apple>();
        appleBox1.moveTo(appleBox2);
        // System.out.println("appleBox1");
        // for (var item:appleBox1){
        //     System.out.println(item);
        // }

        
        
        Box<Orange> OrangeBox = new Box<Orange>();
        OrangeBox.addF(new Orange(2));
        //appleBox2.moveTo(OrangeBox); // Не должно работать!
        
        
        
     

        //appleBox2.moveTo(goldenAppleBox); // Не должно работать!
        goldenAppleBox.moveTo(appleBox1);

   

    }

}
