/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.logiclayer;

import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Coach;
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
public class CoachLogicTest {
    
    public CoachLogicTest() {
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
     * Test of authCoachByPersonId method, of class CoachLogic.
     */
    @Test
    public void testAuthCoachByPersonId() {
        System.out.println("authCoachByPersonId");
        CoachLogic instance = new CoachLogic();
        
        int personid = 0;
        Coach expResult = null;
        Coach result = instance.authCoachByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        expResult = null;
        result = instance.authCoachByPersonId(personid);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllCoaches method, of class CoachLogic.
     */
    @Test
    public void testGetAllCoaches() {
        System.out.println("getAllCoaches");
        CoachLogic instance = new CoachLogic();
        String result = instance.getAllCoaches();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getCoachId method, of class CoachLogic.
     */
    @Test
    public void testGetCoachId() {
        System.out.println("getCoachId");
        int personid = 0;
        CoachLogic instance = new CoachLogic();
        int expResult = -1;
        int result = instance.getCoachId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        result = instance.getCoachId(personid);
        assertEquals(expResult, result);
        
        personid = 23;
        expResult = 14;
        result = instance.getCoachId(personid);
        assertEquals(expResult, result);
    }
    
}
