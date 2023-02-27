public class Main {
    public static void main(String[] args){

    MagicBox<Number> numberMagicBox = new MagicBox<>(4);
    MagicBox<String> stringMagicBox = new MagicBox<>(5);

    System.out.println(numberMagicBox.add(0));
    System.out.println(numberMagicBox.add(-5));
    System.out.println(numberMagicBox.add(55.5));
    System.out.println(numberMagicBox.add(53));
    System.out.println(numberMagicBox.add(52));
    System.out.println();
    numberMagicBox.pick();
    System.out.println();

    System.out.println(stringMagicBox.add("Набор"));
    System.out.println(stringMagicBox.add("уникальных"));
    System.out.println(stringMagicBox.add("слов"));
    System.out.println(stringMagicBox.add("Уник"));
    System.out.println(stringMagicBox.add("Картошка"));
    System.out.println(stringMagicBox.add("Петя"));
    System.out.println(stringMagicBox.add("Набор"));
    System.out.println();
    stringMagicBox.pick();
    System.out.println();

    }
}