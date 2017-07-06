import java.util.ArrayList;

/**
 * Домашнее задание Java 3
 * Занятие 01 (06.07.2017)
 * Чашников Михаил
 */


public class Main {

    static Generic[] array = { new Generic<String>("A"),
                                new Generic<String>("B"),
                                new Generic<String>("C"),
                                new Generic<String>("D") };

    public static void main(String[] args){

        System.out.println("Исходный массив:");
        print();

        System.out.println("\nЗадача 1.");
        System.out.println("Элементы после замены:");
        Exercise01();

        System.out.println("\nЗадача 2.");
        System.out.println("Массив, преобразованный в ArrayList:");
        Exercise02();

        System.out.println("\nЗадача 3.");
        Exercise03();

    }

    private static void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getObj());
            if (i < array.length - 1) System.out.print(", ");
            else System.out.println("");
        }
    }

    private static void Exercise01(){
        int n0 = 1;
        int n1 = 3;
        swap(1,3);
        print();
    }

    private static void swap(int n0, int n1){
        Generic temp = array[n0];
        array[n0] = array[n1];
        array[n1] = temp;
    }

    private static void Exercise02(){
        ArrayList<Generic> arrayList = arrayToArrayList(array);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i).getObj());
            if (i < arrayList.size() - 1) System.out.print(", ");
            else System.out.println("");
        }
    }

    private static ArrayList<Generic> arrayToArrayList(Generic[] array){
        ArrayList<Generic> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        return arrayList;
    }


    private static void Exercise03(){
        System.out.println("Создаем две коробки (объекта класса 'Box').");
        Box<Apple> box0 = new Box();
        Box<Orange> box1 = new Box();

        System.out.println("\nДобавляем в первую коробку 3 объекта класса 'Apple'");
        for (int i = 0; i < 3; i++) {
            box0.addFruit(new Apple());
        }
        System.out.println("Первая коробка: " + box0.getWeight());

        System.out.println("\nДобавляем во вторую коробку 2 объекта класса 'Orange'");
        for (int i = 0; i < 2; i++) {
            box1.addFruit(new Orange());
        }
        System.out.println("Вторая коробка: " + box1.getWeight());

        System.out.println("\nСравниваем коробки. Результат сравнения:");
        System.out.println(box0.compare(box1));

        System.out.println("\nДобавляем в первую коробку 1 объект класса 'Apple'");
        box0.addFruit(new Apple());
        System.out.println("Первая коробка: " + box0.getWeight());

        System.out.println("\nСнова сравниваем коробки. Результат сравнения:");
        System.out.println(box0.compare(box1));

        System.out.println("\nСоздаем третью коробку и добавляем в нее 2 объекта класса 'Apple'.");
        Box<Apple> box2 = new Box();
        for (int i = 0; i < 2; i++) {
            box2.addFruit(new Apple());
        }
        System.out.println("Третья коробка: " + box2.getWeight());

        System.out.println("\nПеремещаем все объекты из третьей коробки в первую.");

        box2.transfer(box0);

        System.out.println("\nВсе коробки в конце работы:");
        System.out.println("Первая коробка: " + box0.getWeight());
        System.out.println("Вторая коробка: " + box1.getWeight());
        System.out.println("Третья коробка: " + box2.getWeight());
    }
}




