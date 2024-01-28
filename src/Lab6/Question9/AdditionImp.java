package Lab6.Question9;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdditionImp extends UnicastRemoteObject  implements Addition,Serializable{

	public AdditionImp() throws RemoteException{};
	@Override
	public int AddValue(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

}
