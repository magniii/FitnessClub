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
public class CoachClientsGatewayTest {
    
    public CoachClientsGatewayTest() {
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
     * Test of addClientToCoach method, of class CoachClientsGateway.
     */
    @Test
    public void testAddClientToCoach() {
        System.out.println("addClientToCoach");
        int client_id = 0;
        int coach_id = 0;
        CoachClientsGateway instance = new CoachClientsGateway();
        instance.addClientToCoach(client_id, coach_id);
    }

    /**
     * Test of deleteClientFromCoach method, of class CoachClientsGateway.
     */
    @Test
    public void testDeleteClientFromCoach() {
        System.out.println("deleteClientFromCoach");
        int client_id = 0;
        CoachClientsGateway instance = new CoachClientsGateway();
        instance.deleteClientFromCoach(client_id);
    }

    /**
     * Test of getCoachClients method, of class CoachClientsGateway.
     */
    @Test
    public void testGetCoachClients() {
        System.out.println("getCoachClients");
        int coach_id = 0;
        CoachClientsGateway instance = new CoachClientsGateway();
        String result = instance.getCoachClients(coach_id);
        assertTrue(result.isEmpty());
        
        coach_id = -1;
        result = instance.getCoachClients(coach_id);
        assertTrue(result.isEmpty());
        
        coach_id = 14;
        result = instance.getCoachClients(coach_id);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getClientsCoach method, of class CoachClientsGateway.
     */
    @Test
    public void testGetClientsCoach() {
        System.out.println("getClientsCoach");
        int client_id = 0;
        CoachClientsGateway instance = new CoachClientsGateway();
        String result = instance.getClientsCoach(client_id);
        assertTrue(result.isEmpty());
        
        client_id = -1;
        result = instance.getClientsCoach(client_id);
        assertTrue(result.isEmpty());
        
        client_id = 12;
        result = instance.getClientsCoach(client_id);
        assertFalse(result.isEmpty());
    }
    
}
