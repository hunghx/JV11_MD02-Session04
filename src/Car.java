public class Car{
    // thuooc tính
    char c;
    String color; // màu xe
    int year; // năm sản xuất
    String brand;    // hãng

    // Constructor
    public Car(){
        // thiết lập các gia trị ban đầu cho thuộc tính đối tượng
        color = "Black";
        year = 1990;
        brand = "Toyota";
    }
    public Car(String color,int year, String brand){
        this.color = color;
        this.year = year;
        this.brand = brand;
    }
    // Các method khác
    // phương thức hiển thi thông tin xe
    public void showCarInfo(){
        System.out.printf("%d",(int)c);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Brand: " + brand);
    }
}