
public class Worker{
        private String name;
        private int salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        private String department;

        public Worker(String name, int salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
        public void work(){
            System.out.println("Worker is working...");
        }
        public void showInfo(){
            System.out.println("Name : "+name);
            System.out.println("Salary : "+salary);
            System.out.println("Department : "+department);
        }
        public void changeDepartment(String newDepartment){
            System.out.println("Department is changing...");
            this.department=newDepartment;
            System.out.println("New departman : "+this.department);
        }
    }

class Manager extends Worker{
        private int personIncharge;

        public Manager(String name, int salary, String department, int personIncharge) {
            super(name, salary, department);
            this.personIncharge=personIncharge;
        }

        public void makeAraise(int raise){
            System.out.println("Employee salary increased by  "+raise);
        }

        public void showInfo(){
            super.showInfo();
            System.out.println("Employes in charge : "+personIncharge);
        }
    }

class Run{
    public static void main(String[] args){
        Manager manager=new Manager("Musap Aşkın",3000,"IT",15);
        manager.showInfo();
        manager.makeAraise(200);

    }
}
