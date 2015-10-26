/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.logiclayer;

import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Client;
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
public class ClientLogicTest {
    
    public ClientLogicTest() {
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
     * Test of authClientByPersonId method, of class ClientLogic.
     */
    @Test
    public void testAuthClientByPersonId() {
        System.out.println("authClientByPersonId");
        ClientLogic instance = new ClientLogic();
        
        int personid = 0;
        Client expResult = null;
        Client result = instance.authClientByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        expResult = null;
        result = instance.authClientByPersonId(personid);
        assertEquals(expResult, result);
    }

    /**
     * Test of sendInitialRequest method, of class ClientLogic.
     */
    @Test
    public void testSendInitialRequest() {
        System.out.println("sendInitialRequest");
        
        int client_id = -1;
        ClientLogic instance = new ClientLogic();
        instance.sendInitialRequest(client_id);

        
    }

    /**
     * Test of acceptContract method, of class ClientLogic.
     */
    @Test
    public void testAcceptContract() {
        System.out.println("acceptContract");
        int client_id = 0;
        ClientLogic instance = new ClientLogic();
        instance.acceptContract(client_id);

    }

    /**
     * Test of requestCoach method, of class ClientLogic.
     */
    @Test
    public void testRequestCoach() {
        System.out.println("requestCoach");
        int client_id = 0;
        ClientLogic instance = new ClientLogic();
        instance.requestCoach(client_id);

    }

    /**
     * Test of getAllClients method, of class ClientLogic.
     */
    @Test
    public void testGetAllClients() {
        System.out.println("getAllClients");
        ClientLogic instance = new ClientLogic();
        String result = instance.getAllClients();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getClientId method, of class ClientLogic.
     */
    @Test
    public void testGetClientId() {
        System.out.println("getClientId");
        int personid = 21;
        ClientLogic instance = new ClientLogic();
        int expResult = 12;
        int result = instance.getClientId(personid);
        assertEquals(expResult, result);

        personid = 0;
        expResult = -1;
        result = instance.getClientId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        expResult = -1;
        result = instance.getClientId(personid);
        assertEquals(expResult, result);
    }
    
}
