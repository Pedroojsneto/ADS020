/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.DELETE;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Pedro J S Neto
 */
@Path("calculadora")
public class CalculadoraResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculadoraResource
     */
    public CalculadoraResource() {
    }

    /**
     * Retrieves representation of an instance of rest.CalculadoraResource
     * @param a
     * @param b
     * @return an instance of java.lang.String
     */
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int somar(@QueryParam(value="a") int a, @QueryParam(value="b") int b) {
	return a + b;
    }
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int subtrair(@QueryParam(value="a") int a, @QueryParam(value="b") int b) {
	return a - b;
    }

    /**
     * PUT method for updating or creating an instance of CalculadoraResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int multiplicar(@QueryParam(value="a") int a, @QueryParam(value="b") int b) {
	return a * b;
    }
    
    @DELETE
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int dividir(@QueryParam(value="a") int a, @QueryParam(value="b") int b) {
	return a / b;
    }
}
