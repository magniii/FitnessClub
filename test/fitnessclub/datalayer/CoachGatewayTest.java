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
public class CoachGatewayTest {
    
    public CoachGatewayTest() {
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
     * Test of getCoachByPersonId method, of class CoachGateway.
     */
    @Test
    public void testGetCoachByPersonId() {
        System.out.println("getCoachByPersonId");
        int personid = 0;
        CoachGateway instance = new CoachGateway();
        String result = instance.getCoachByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = -1;
        result = instance.getCoachByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = 23;
        result = instance.getCoachByPersonId(personid);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getAllCoaches method, of class CoachGateway.
     */
    @Test
    public void testGetAllCoaches() {
        System.out.println("getAllCoaches");
        CoachGateway instance = new CoachGateway();
        String result = instance.getAllCoaches();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getCoachIdByPersonId method, of class CoachGateway.
     */
    @Test
    public void testGetCoachIdByPersonId() {
        System.out.println("getCoachIdByPersonId");
        int personid = 0;
        CoachGateway instance = new CoachGateway();
        int expResult = -1;
        int result = instance.getCoachIdByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        result = instance.getCoachIdByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = 23;
        expResult = 14;
        result = instance.getCoachIdByPersonId(personid);
        assertEquals(expResult, result);
    }
    
}
