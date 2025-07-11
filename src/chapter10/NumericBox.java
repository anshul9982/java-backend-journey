package chapter10;

public class NumericBox<T extends Number> {

    private T content;
    public NumericBox(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public double doubleValue(){
        return content.doubleValue();
    }

    public boolean isGreaterThan(NumericBox<?> otherbox ){
        return this.doubleValue() > otherbox.doubleValue();
    }

    public static void main(String[] args) {
        NumericBox<Integer> intBox = new NumericBox<>(10);
        NumericBox<Double> doubleBox = new NumericBox<>(10.5);
        NumericBox<Float> floatBox = new NumericBox<>(9.9f);

        System.out.println("intBox's value: " + intBox.getContent());
        System.out.println("doubleBox's value: " + doubleBox.getContent());
        System.out.println("floatBox's value: " + floatBox.getContent());
        System.out.println("---");

        System.out.println("Is intBox > floatBox? " + intBox.isGreaterThan(floatBox)); // true
        System.out.println("Is intBox > doubleBox? " + intBox.isGreaterThan(doubleBox)); // false
    }
}
