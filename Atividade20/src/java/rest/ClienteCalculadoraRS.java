/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:CalculadoraResource
 * [calculadora]<br>
 * USAGE:
 * <pre>
 *        ClienteCalculadoraRS client = new ClienteCalculadoraRS();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Pedro J S Neto
 */
public class ClienteCalculadoraRS {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/Atividade20/webresources";

    public ClienteCalculadoraRS() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("calculadora");
    }

    
    /**
     *
     * @param a
     * @param b
     * @return
     * @throws ClientErrorException
     */
    public String multiplicar(int a, int b) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource
                .queryParam("a",a)
                .queryParam("b",b)
                .request(javax.ws.rs.core.MediaType.TEXT_PLAIN
                ).get(String.class);
    }
    
    public String dividir(int a, int b) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource
                .queryParam("a",a)
                .queryParam("b",b)
                .request(javax.ws.rs.core.MediaType.TEXT_PLAIN
                ).get(String.class);
    }
    
    public String somar(int a, int b) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource
                .queryParam("a",a)
                .queryParam("b",b)
                .request(javax.ws.rs.core.MediaType.TEXT_PLAIN
                ).get(String.class);
    }
    
    public String subtrair(int a, int b) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource
                .queryParam("a",a)
                .queryParam("b",b)
                .request(javax.ws.rs.core.MediaType.TEXT_PLAIN
                ).get(String.class);
    }
    

        public void close() {
        client.close();
    }
    
}
