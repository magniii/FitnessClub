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
public class DoctorGatewayTest {
    
    public DoctorGatewayTest() {
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
     * Test of getDoctorByPersonId method, of class DoctorGateway.
     */
    @Test
    public void testGetDoctorByPersonId() {
        System.out.println("getDoctorByPersonId");
        int personid = 0;
        DoctorGateway instance = new DoctorGateway();
        String result = instance.getDoctorByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = -1;
        result = instance.getDoctorByPersonId(personid);
        assertTrue(result.isEmpty());
        
        personid = 22;
        result = instance.getDoctorByPersonId(personid);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getDoctorIdByPersonId method, of class DoctorGateway.
     */
    @Test
    public void testGetDoctorIdByPersonId() {
        System.out.println("getDoctorIdByPersonId");
        int personid = 0;
        DoctorGateway instance = new DoctorGateway();
        int expResult = -1;
        int result = instance.getDoctorIdByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        result = instance.getDoctorIdByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = 22;
        expResult = 14;
        result = instance.getDoctorIdByPersonId(personid);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllDoctors method, of class DoctorGateway.
     */
    @Test
    public void testGetAllDoctors() {
        System.out.println("getAllDoctors");
        DoctorGateway instance = new DoctorGateway();
        String result = instance.getAllDoctors();
        assertFalse(result.isEmpty());
    }
}
