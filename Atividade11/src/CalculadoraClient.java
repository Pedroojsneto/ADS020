
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro J S Neto
 */
public class CalculadoraClient {

    public static void main(String[] args) {
        
        try {
            CalculadoraRemota calculadora = (CalculadoraRemota) Naming.lookup("//127.0.0.1:1099/CalculadoraServer");
            System.out.println("2 + 2 é igual a " + calculadora.somar(2, 2));
            System.out.println("2 - 2 é igual a " + calculadora.subtrair(2, 2));
            System.out.println("2 x 2 é igual a " + calculadora.multiplicar(2, 2));
            System.out.println("2 / 2 é igual a " + calculadora.dividir(2, 2));
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
}

