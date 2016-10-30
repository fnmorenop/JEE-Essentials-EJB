package sampleEntityBean;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface HomeInterface extends EJBHome{

	public SampleEntityBean create() throws CreateException, RemoteException;
}
