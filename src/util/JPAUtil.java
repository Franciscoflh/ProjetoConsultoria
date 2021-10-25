/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author franc
 */
public class JPAUtil {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Consultoria");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    
    
}
