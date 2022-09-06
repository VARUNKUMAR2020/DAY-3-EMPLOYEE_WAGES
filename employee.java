package Employee_Details;

/**
 * Hello world!
 *
 */
public class employee 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO THE COMPANY" );
    	int fulltime = 1;
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
        	
        		System.out.println("Employee Wage:" + empWage);
    	
    }
}
