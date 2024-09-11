import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDRectangle {
    public int numberOfRectangle;
    public Rectangle[] listRectangles;

    public CRUDRectangle() {
        listRectangles = new Rectangle[100];
        numberOfRectangle = 0;
    }

    public boolean addRectangleToList(Rectangle objectRectangle) {
        if (numberOfRectangle < listRectangles.length) {
            listRectangles[numberOfRectangle] = objectRectangle;
            numberOfRectangle++;
            System.out.println("da them thanh cong");
            return true;
        } else {
            System.out.println("Khong the luu doi tuong vao mang.");
        }
        return false;
    }




    public boolean addRectangleToFile(String file, Rectangle rectangle ){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(rectangle.toString());
            System.out.println("ghi thanh cong");
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getRectangleFromFile(String file){
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addArrayToFile(String file,List<Rectangle> rectangle){
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Rectangle i : rectangle){
                bufferedWriter.write(i.toString());
            }
            bufferedWriter.close();
            return true;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}