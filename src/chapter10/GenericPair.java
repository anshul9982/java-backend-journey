package chapter10;

public class GenericPair<L, R> {
    private L left;
    private R right;

    public GenericPair(L left, R right){
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left){
        this.left = left;
    }

    public R getRight(){
        return right;
    }

    public void setRight(R right){
        this.right = right;
    }

    public static void main(String[] args) {
        
        GenericPair<String, Integer> person = new GenericPair<>("Anshul", 20);
        GenericPair<Double, String> book = new GenericPair<>(430.5, "Java Fundamentals");

        System.out.println(person.getLeft());
        System.out.println(book.getLeft());
    }

}
