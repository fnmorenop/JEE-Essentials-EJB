package converter;

import java.rmi.RemoteException;

import javax.ejb.EJBLocalObject;

public interface ComponentInterface extends EJBLocalObject {

	public double conversion(double Celsius) throws RemoteException;
}
