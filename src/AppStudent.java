import java.util.ArrayList;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {
        String file = "dulieu.txt";
        Rectangle rectangle = new Rectangle(7, 9, "helos", "white");
        Rectangle rectangle1 = new Rectangle(7, 9, "helos", "white");
        Rectangle rectangle2 = new Rectangle(7, 9, "helos", "white");
        Rectangle rectangle3 = new Rectangle(7, 9, "helos", "white");
        CRUDRectangle crudRectangle = new CRUDRectangle();
        crudRectangle.addRectangleToList(rectangle);
        List<Rectangle> arr = new ArrayList<>();
        arr.add(rectangle);
        arr.add(rectangle1);
        arr.add(rectangle2);
        arr.add(rectangle3);
        System.out.println("Mang da co du lieu");
        crudRectangle.addRectangleToFile(file, rectangle);
        System.out.println("hoan tat");
        System.out.println("du lieu trong file la");
        crudRectangle.getRectangleFromFile("dulieu.txt");
        crudRectangle.addArrayToFile(file, arr);
        System.out.println("them mang thanh cong");


    }
}
