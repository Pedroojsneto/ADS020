import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro J S Neto
 */
public class CalculadoraServer extends UnicastRemoteObject implements CalculadoraRemota {

    public CalculadoraServer() throws RemoteException {
    }

    @Override
    public int somar(int a, int b) throws RemoteException {
        int result = a + b;

        return result;
    }

    @Override
    public int subtrair(int a, int b) throws RemoteException {
        int result = a - b;

        return result;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        int result = a * b;

        return result;
    }

    @Override
    public int dividir(int a, int b) throws RemoteException {
        int result = a / b;

        return result;
    }

    public static void main(String[] args) throws RemoteException {

        CalculadoraServer calculadora = new CalculadoraServer();

        
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("CalculadoraServer", calculadora);
            System.out.println("Calculadora ligada");
        } catch (MalformedURLException | RemoteException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }

}