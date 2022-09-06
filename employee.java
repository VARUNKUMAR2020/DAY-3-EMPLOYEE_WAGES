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
    		System.out.println("Employee is Abscent");
    }
}
