public class  EmpWageBuilder{

    public static void main(String []args){

	final int IS_FULL_TIME=1;
        final int WAGE_RATE=20;

        int empHr=0;
        int salary=0;

	double empCheck= Math.floor(Math.random()*10)%2;

	if (empCheck==IS_FULL_TIME){
            System.out.print("Employee is present");
            empHr=8;
	}
        
	 else{
             System.out.print("Employee is absent");
             empHr=0;
            }

        salary=(WAGE_RATE*empHr);
        System.out.print("\nsalary:"+salary);
	}
}

