/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.logiclayer;

import fitnessclub.datalayer.DataGateway;
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
public class CoachClientsLogicTest {
    
    public CoachClientsLogicTest() {
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
     * Test of assignClientToCoach method, of class CoachClientsLogic.
     */
    @Test
    public void testAssignClientToCoach() {
        System.out.println("assignClientToCoach");
        int client_id = 0;
        int coach_id = 0;
        CoachClientsLogic instance = new CoachClientsLogic();
        instance.assignClientToCoach(client_id, coach_id);
    }

    /**
     * Test of getCoachClients method, of class CoachClientsLogic.
     */
    @Test
    public void testGetCoachClients() {
        System.out.println("getCoachClients");
        int coach_id = 0;
        CoachClientsLogic instance = new CoachClientsLogic();
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
     * Test of getClientsCoach method, of class CoachClientsLogic.
     */
    @Test
    public void testGetClientsCoach() {
        System.out.println("getClientsCoach");
        int client_id = 0;
        CoachClientsLogic instance = new CoachClientsLogic();
        String result = instance.getClientsCoach(client_id);
        assertTrue(result.isEmpty());
        
        client_id = -1;
        result = instance.getClientsCoach(client_id);
        assertTrue(result.isEmpty());
        
        client_id = 12;
        result = instance.getClientsCoach(client_id);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of deleteClientFromCoach method, of class CoachClientsLogic.
     */
    @Test
    public void testDeleteClientFromCoach() {
        System.out.println("deleteClientFromCoach");
        int client_id = 0;
        CoachClientsLogic instance = new CoachClientsLogic();
        instance.deleteClientFromCoach(client_id);
    }
    
}
