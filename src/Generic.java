/**
 * Домашнее задание Java 3
 * Занятие 01 (06.07.2017)
 * Чашников Михаил
 */

public class Generic<T>{
    T obj;
    public Generic(T оbj) {
        this.obj = оbj;
    }
    public T getObj() {
        return obj;
    }
    public void showType() {
        System.out.println("Тип T: " + obj.getClass().getName());
    }

}