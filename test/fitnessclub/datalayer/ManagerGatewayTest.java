/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.datalayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author expert
 */
public class ManagerGatewayTest {
    
    public ManagerGatewayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        DataGateway.initdb();
        DataGateway.connect();
    }
    
    @AfterClass
    public static void tearDownClass() {
        DataGateway.close();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getManagerByPersonId method, of class ManagerGateway.
     */
    @Test
    public void testGetManagerByPersonId() {
        System.out.println("getManagerByPersonId");
        int personid = 0;
        ManagerGateway instance = new ManagerGateway();
        String result = instance.getManagerByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = -1;
        result = instance.getManagerByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = 2;
        result = instance.getManagerByPersonId(personid);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getAllManagers method, of class ManagerGateway.
     */
    @Test
    public void testGetAllManagers() {
        System.out.println("getAllManagers");
        ManagerGateway instance = new ManagerGateway();
        String result = instance.getAllManagers();
        assertFalse(result.isEmpty());
    }
}
