/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author timon
 */
@WebService(serviceName = "converter")
public class converter {

    /**
     * This is a sample web service operation
     * @param txt
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "kelvinToCelcius")
    public String kelvinToCelcius(@WebParam(name = "temp") String temp){
        double foo = Double.parseDouble(temp);
        return String.valueOf(foo-273.15);
    }
    
    @WebMethod(operationName = "celciusToKelvin")
    public String celciusToKelvin(@WebParam(name = "temp") String temp){
        double foo = Double.parseDouble(temp);
        return String.valueOf(foo+273.15);
    }
}
