import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int size){
        this.items = (T[]) new Object[size];
    }

    public boolean add (T item){
        for (int i = 0; i < items.length; i++){
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public void pick() throws RuntimeException{
        for (int i = 0; i < items.length; i++){
            if (items[i] == null) {
                throw new RuntimeException("Ваша коробка полностью не заполнена, осталось заполнить: " + (items.length-i));
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length);

        System.out.println("Вы достали из коробки: " + items[randomInt]);
    }
}
