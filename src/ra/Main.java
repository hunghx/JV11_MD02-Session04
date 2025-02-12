package ra;

public class Main extends Employee {
    public static void main(String[] args) {
        // tạo đối tượng car từ Lớp Car
//        Car kia  = new Car();
//        kia.showCarInfo();
        // Tạo 1 instance tu ra.Employee
        Employee emp1 = new Employee(); // cấp phát bộ nhớ động
        Employee emp2 = new Employee();
        // nhập du lieu
        emp1.inputData();
        emp1.setEmployeeName("Hunghx");
        System.out.println(emp1.getEmployeeName());
        // thay doi ten nhan vien so
//        emp2.inputData();
        // hien thi thong tin
//        emp1.displayData();
//        emp2.displayData();
        // tinh luong
//        emp.calSalary();
        // hien thi lại thong tin
//        emp.displayData();


    }
}
