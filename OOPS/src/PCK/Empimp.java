package PCK;

public class Empimp {
	
//	public static void main(String[] args) {
//        // First 5 employees using parameterized constructor
//        Emp[] e = new Emp[10];
//        e[0] = new Emp(1, "Alice", "HR", 50000);
//        e[1] = new Emp(2, "Bob", "IT", 60000);
//        e[2] = new Emp(3, "Charlie", "Finance", 55000);
//        e[3] = new Emp(4, "David", "Marketing", 52000);
//        e[4] = new Emp(5, "Eva", "Sales", 51000);
//
//        // Next 5 employees using default constructor and setters
//        for (int i = 5; i < 10; i++) {
//            e[i] = new Emp(); // default constructor
//            e[i].setid(i + 1);
//            e[i].setDepartment("Dept" + (i + 1));
//            e[i].setsalary(50000 + (i * 1000));
//        }
//        
//        
//        e[5].setname("Finn");
//        e[6].setname("Gowtham");
//        e[7].setname("Harish");
//        e[8].setname("Ismail");
//        e[9].setname("Jeelan");
//        
//        // Displaying all employee details
//        System.out.println("Employee Details:");
//        for (Emp emp : e) {
//            System.out.println(emp);
//        }
//    }
	
    public static void main(String[] args) {
        // First 5 employees using parameterized constructor
        Emp emp1 = new Emp(1, "Alice", "HR", 50000);
        Emp emp2 = new Emp(2, "Bob", "IT", 60000);
        Emp emp3 = new Emp(3, "Charlie", "Finance", 55000);
        Emp emp4 = new Emp(4, "David", "Marketing", 52000);
        Emp emp5 = new Emp(5, "Eva", "Sales", 51000);

        // Next 5 employees using setters with specific names
        Emp emp6 = new Emp();
        emp6.setid(6);
        emp6.setname("Frank");
        emp6.setDepartment("IT");
        emp6.setsalary(58000);

        Emp emp7 = new Emp();
        emp7.setid(7);
        emp7.setname("Grace");
        emp7.setDepartment("HR");
        emp7.setsalary(53000);

        Emp emp8 = new Emp();
        emp8.setid(8);
        emp8.setname("Hannah");
        emp8.setDepartment("Finance");
        emp8.setsalary(62000);

        Emp emp9 = new Emp();
        emp9.setid(9);
        emp9.setname("Ian");
        emp9.setDepartment("Legal");
        emp9.setsalary(57000);

        Emp emp10 = new Emp();
        emp10.setid(10);
        emp10.setname("Julia");
        emp10.setDepartment("Admin");
        emp10.setsalary(54000);

        // Print employee details
        System.out.println("Employee Details:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
        System.out.println(emp6);
        System.out.println(emp7);
        System.out.println(emp8);
        System.out.println(emp9);
        System.out.println(emp10);
    }

}
