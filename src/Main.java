public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6, "meme", "yellow");
        Shape shape = new Rectangle(2, 8, "dada", "black");
        System.out.println(rectangle.toString());
        System.out.println("_______________________________________");
        System.out.println(shape.toString());
    }
}