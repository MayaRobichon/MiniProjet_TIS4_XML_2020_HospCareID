/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.polytechgrenoble.depistage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author guill
 */
@WebService(serviceName = "DepistageCluster")
public class DepistageCluster {


    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "nbAdresses")
    public int nbAdresses() {
        //TODO write your implementation code here:
        return 0;
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "localisationId")
    public String localisationId(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "afficherId")
    public String afficherId(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "afficherCluster")
    public String afficherCluster(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return null;
    }
}
