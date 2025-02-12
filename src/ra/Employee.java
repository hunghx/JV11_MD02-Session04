package ra;

import java.util.Scanner;

public class Employee {
    // thuộc tính : nên để là private và phải các phương thức getter và setter để truy câp
    private String employeeId;
    private String employeeName;
    private int age;
    protected boolean gen;
    private float rate;
    private double salary;
    // constructor
    public Employee(){

    }
    public Employee(String employeeId, String employeeName, int age, boolean gen, float rate, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }


    // setter : thay doi thuoc tinh
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    // getter : trả về gia tri thuoc tinh
    public String getEmployeeName(){
        return employeeName;
    }

    // phương thức
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID ");
        employeeId = scanner.nextLine();
        System.out.println("Nhập Name ");
        employeeName = scanner.nextLine();
        System.out.println("Nhập age ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính (1 : Nam, 0 : Nữ) ");
        gen = scanner.nextLine().equals("1");
        System.out.println("Nhập rate ");
        rate = Float.parseFloat(scanner.nextLine());
        calSalary();
    }

    // phương thuc hien thi
    public void displayData(){
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gen? "Nam" : "Nữ"));
        System.out.println("Rate: " + rate);
        System.out.println("Base Salary: " + salary);
    }
    public void calSalary(){
        salary = rate * 1300000;
    }
}
