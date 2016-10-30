package higherLower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.util.Random;

import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HigherLower
 */
@Stateless
@LocalBean
public class HigherLower implements SessionBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5003971580204099119L;
	int number;

    /**
     * Default constructor. 
     */
    public HigherLower() {
    	Random r = new Random();
        number = r.nextInt(100);
        System.out.printf("%nSecret number: %d%n", number);
    }
    
    public int getInput() throws IOException {
        System.out.println("Enter a number 0-100:");
        BufferedReader in
        = new BufferedReader(new InputStreamReader(System.in));
        
        String line = in.readLine();

        return Integer.parseInt(line);
    }
    
    public void checkValue(int value) {
    	if(value == number) {
    		System.out.println("Winner!");
    		System.exit(1);
    	}
    	if(value < number) {
    		System.out.println("Higher");
    	} else if(value > number) {
    		System.out.println("Lower");
    	}
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

}
