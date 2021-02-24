public class  EmpWageOops{
     
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int WAGE_RATE=20;
    public static final int MAX_WORKING_DAYS=20;
    public static final int MAX_WORKING_HRS=100;
    
    public int empHr=0;
    public int totalWorkingHr=0;
    public int salary=0;
    
    public void  getEmpHr(){
        
        int empCheck= (int) Math.floor(Math.random()*10)%3;
        
        switch(empCheck){

        case IS_FULL_TIME:
            this.empHr=8;
            break;

        case IS_PART_TIME:
            this.empHr=4;
            break;

        default:
            this.empHr=0;
        }
    }
    
    public  void printSalary(){
        int day=1;
        while( (day<=MAX_WORKING_DAYS) && (this.totalWorkingHr<=MAX_WORKING_HRS) ){
        
            this.getEmpHr();
            this.totalWorkingHr+=this.empHr;
            day++;
        }
        this.salary=(WAGE_RATE*this.totalWorkingHr);   
    }
    
    public static void main(String []args){
        
        EmpWageOops emp1 = new EmpWageOops();
        EmpWageOops emp2 = new EmpWageOops();

        emp1.printSalary();
        System.out.print("employee1\ntotal working hours:"+emp1.totalWorkingHr);
        System.out.println("\nsalary:"+emp1.salary);
        
        emp2.printSalary();
        System.out.print("\nemployee2\ntotal working hours:"+emp2.totalWorkingHr);
        System.out.print("\nsalary:"+emp2.salary);
        
    }
}

