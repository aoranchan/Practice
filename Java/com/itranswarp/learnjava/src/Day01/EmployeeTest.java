package Day01;

public class EmployeeTest {
    public static void test() {
        Employee empOne = new Employee("RUNOOB1",26,"高级程序员",1000);
        empOne.empDepartment("研发部");
        Employee empTwo = new Employee("RUNOOB2",24,"菜鸟程序员",500);
        empTwo.empDepartment("运维");
        empOne.printEmployee();
        System.out.println("-----------------------------");
        empTwo.printEmployee();
//        Employee empTwo = new Employee("RUNOOB2",24,"菜鸟程序员",600);
        empTwo.empDepartment("测试");
        System.out.println("-----------------------------");
        empTwo.printEmployee();
    }
}
