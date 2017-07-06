import java.util.ArrayList;

/**
 * Домашнее задание Java 3
 * Занятие 01 (06.07.2017)
 * Чашников Михаил
 */

public class Box<N extends Fruit>{
    ArrayList<N> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public void addFruit(N fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        float weight = 0;
        for (N fruit: fruits) {
            weight += fruit.weight;
        }
        return weight;
    }

    public void transfer(Box<N> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public boolean compare(Box anotherBox){
        return this.getWeight() == anotherBox.getWeight();
    }
}
