package sample;

import java.rmi.RemoteException;

import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SampleBean
 */
@Stateless
@LocalBean
@AccessTimeout(value=100)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class SampleBean implements SessionBean {

   

	/**
	 * 
	 */
	private static final long serialVersionUID = -655645725049803992L;

	/**
     * Default constructor. 
     */
    public SampleBean() {
        // TODO Auto-generated constructor stub
    }

    @Lock(LockType.READ)
    public int addition(int a, int b) {
    	return a+b;
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
}