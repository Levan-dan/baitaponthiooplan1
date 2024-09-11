public class Rectangle extends Shape {
    private double with;
    private double height;

    public Rectangle(double with, double height, String shapeName, String color){
        super(shapeName, color);
        this.with = with;
        this.height = height;

    }


    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


   @Override
   public double calAre(){
        return with*height;
   }

    @Override
     public String toString() {
        return "Hinh chu nhat co chieu rong la : " + with + " va chieu dai la " + height + "\n" +
                "ten la : " + getShapeName()  + " mau : " + getColor() + "\n" +
                "co dien tich la : " + calAre();
    }
}
