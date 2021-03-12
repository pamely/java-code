public class Test {
    
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] =  new Employee("Demi"); 
        employees[1] =  new Contract("Alex", 45, 200, 0.3, 40); 
        employees[2] =  new FullTime("Louise", 300000, 0.01, 4000); 
        employees[2].setPay(200);

        FullTime full1 = new FullTime("Louise", 300000, 0.01, 4000);
        full1.setSalaryInfo(400.0, 4000.0);
        for (int i = 0; i < employees.length; ++i){
            System.out.println(employees[i].toString());

        }

    }
}