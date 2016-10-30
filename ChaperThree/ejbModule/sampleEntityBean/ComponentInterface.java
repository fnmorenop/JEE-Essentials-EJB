package sampleEntityBean;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

public interface ComponentInterface extends EJBObject {

	public Integer doCalculation (Integer inputs)throws RemoteException;
}
