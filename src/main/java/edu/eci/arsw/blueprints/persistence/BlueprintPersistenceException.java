/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.persistence;

/**
 *
 * @author hcadavid
 */
public class BlueprintPersistenceException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BlueprintPersistenceException(String message) {
        super(message);
    }

    public BlueprintPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
