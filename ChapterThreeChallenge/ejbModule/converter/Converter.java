package converter;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Converter
 */
@Stateless
@LocalBean
public class Converter implements SessionBean {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7046801137996699599L;

	/**
     * Default constructor. 
     */
    public Converter() {
        // TODO Auto-generated constructor stub
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
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}
    
    public double conversion(double Celsius) {
    	return Celsius*1.8 + 32;
    }
    
    public void setMessage(double celcius) {
    	double farenheit = conversion(celcius);
    	System.out.printf("%nEl equivalente de %+1.1f grados celcius son %1.0f grados farenheit%n", celcius, farenheit);
    }

}
