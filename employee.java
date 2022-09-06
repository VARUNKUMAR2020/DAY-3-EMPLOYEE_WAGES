package Employee_Details;
public class employee 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO THE COMPANY" );
    	int fulltime = 1;
    	int totalHrs = 0;
		int day = 1;
    	while(day <= 20 && totalHrs<=100) {
		day++;
    	double empcheck = Math.floor(Math.random() * 10)% 2;
    	if (empcheck == fulltime)
    		System.out.println("Employee is Present");
    	else
    		System.out.println("Employee is Absent");
    	int empRatePH = 20;
    	int empHrs = 0;
    	int empWage = 0;
    	if (empcheck == fulltime) 
    	{
    		empHrs = 8;
    	}
    	else 
    	{
    		empHrs = 0;
    	    empWage = empHrs*empRatePH;	
    	    System.out.println("Employee Wage:" + empWage);
    	}
    	    int parttime = 2;
    		if (empcheck == fulltime)
        		empHrs = 4;
        	else if(empcheck == parttime)
    		empHrs = 8;
    	else
        		empHrs = 0;
        	empWage = empHrs*empRatePH;	
        	    int empCheck=0;
        		System.out.println("Employee Wage:" + empWage);
        		switch (empCheck) {
            	case 1:
            		empHrs = 4;
            		break;
            	case 2:
            		empHrs = 8;
            		break;
            	default:
            		empHrs = 0;
            	}
        		 int totalEmpWage=0;
            	empWage = empHrs*empRatePH;	
            	
            		System.out.println("Employee Wage:" + empWage);
            		empWage = empHrs*empRatePH;
                	totalEmpWage += empWage;
               
                	System.out.println("Employee Wage:" + empWage);
                    System.out.println("Toatl Employee Wage: "+ totalEmpWage);
           
    	
    }
    }
}

