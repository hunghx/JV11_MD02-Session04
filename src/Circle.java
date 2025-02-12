import java.util.Scanner;

public class Circle {
    // khai bao thuoojc tinh
    private double radius;
    private String color;
    // ham tao
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    // getter setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // tinh chu vi , dien tich, nhap xuat du lieu
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap mau hinh tron: ");
        this.color = scanner.nextLine();
    }
    public void displayData(){
        System.out.printf("Ban kinh = %.2f, color = %s, dien tich = %.2f, chu vi = %.2f \n",radius,color,getArea(),getCircumference());
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
