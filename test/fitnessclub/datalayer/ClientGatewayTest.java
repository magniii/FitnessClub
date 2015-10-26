/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.datalayer;

import java.sql.Date;
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
public class ClientGatewayTest {
    
    public ClientGatewayTest() {
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
     * Test of getClientByPersonId method, of class ClientGateway.
     */
    @Test
    public void testGetClientByPersonId() {
        System.out.println("getClientByPersonId");
        int personid = 0;
        ClientGateway instance = new ClientGateway();
        String result = instance.getClientByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = -1;
        result = instance.getClientByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = 21;
        result = instance.getClientByPersonId(personid);
        assertFalse(result.isEmpty());
    }   

    /**
     * Test of getAllClients method, of class ClientGateway.
     */
    @Test
    public void testGetAllClients() {
        System.out.println("getAllClients");
        ClientGateway instance = new ClientGateway();
        String result = instance.getAllClients();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getClientIdByPersonId method, of class ClientGateway.
     */
    @Test
    public void testGetClientIdByPersonId() {
        System.out.println("getClientIdByPersonId");
        int personid = 0;
        ClientGateway instance = new ClientGateway();
        int expResult = -1;
        int result = instance.getClientIdByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        result = instance.getClientIdByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = 21;
        expResult = 12;
        result = instance.getClientIdByPersonId(personid);
        assertEquals(expResult, result);
    }    
}
