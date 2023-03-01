package Day01;

public class Employee {
    //Employee 类有四个成员变量：name、age、designation 和 salary。该类显式声明了一个构造方法，该方法只有一个参数。
    String name;
    int age;
    String designation;
    double salary;
    String department;
    public Employee(String name,int age,String designation,double salary){
        this.name = name;
        this.age =age;
        this.designation = designation;
        this.salary = salary;
    }
    /* 设置designation的值*/
    public void empDepartment(String empDepartment){
        department = empDepartment;
    }
    public void printEmployee(){
        System.out.println("姓名： "+ name);
        System.out.println("年龄： "+ age);
        System.out.println("称号： "+ designation);
        System.out.println("工资： "+ salary);
        System.out.println("部门： "+ department);
    }
}
