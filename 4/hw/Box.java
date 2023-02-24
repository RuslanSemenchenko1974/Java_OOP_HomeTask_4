
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit>  implements Iterable <T> {

    // Нужно реализовать хранение фрукто в коробке Box
   
    private List<T> frBox = new ArrayList<T>();
    
    public void addF(T fruit) {
        // FIXME: 21.02.2023 Написать логику сохранения
        frBox.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (T item:frBox) {
            weight+=item.getWeight();
        }
        return weight;
    }

    public void moveTo (Box<? super T> anotherBox) {
    //  m12(frBox, anotherBox.frBox);
     //anotherBox.frBox.addAll(frBox);

     for (int i = 0; i < frBox.size(); i++) {
    
        anotherBox.addF(frBox.get(i));
   }
        frBox.clear();  
        
        
    }

//     static private <T> void m12(List<T> l1, List<? super T> l2) {
    
//         l2.addAll(l1);
//    }

@Override
public Iterator<T> iterator() {
    Iterator<T> it = new Iterator<T>() {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < frBox.size();
        }

        @Override
        public T next() {
            return frBox.get(index++);
        }

    };
    return it;
}
}
