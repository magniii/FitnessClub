/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.logiclayer;

import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Doctor;
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
public class DoctorLogicTest {
    
    public DoctorLogicTest() {
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
     * Test of authDoctorByPersonId method, of class DoctorLogic.
     */
    @Test
    public void testAuthDoctorByPersonId() {
        System.out.println("authDoctorByPersonId");
        DoctorLogic instance = new DoctorLogic();
        
        int personid = 0;
        Doctor expResult = null;
        Doctor result = instance.authDoctorByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        expResult = null;
        result = instance.authDoctorByPersonId(personid);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllDoctors method, of class DoctorLogic.
     */
    @Test
    public void testGetAllDoctors() {
        System.out.println("getAllDoctors");
        DoctorLogic instance = new DoctorLogic();
        String result = instance.getAllDoctors();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getDoctorId method, of class DoctorLogic.
     */
    @Test
    public void testGetDoctorId() {
        System.out.println("getDoctorId");
        int personid = 0;
        DoctorLogic instance = new DoctorLogic();
        int expResult = -1;
        int result = instance.getDoctorId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        expResult = -1;
        result = instance.getDoctorId(personid);
        assertEquals(expResult, result);
        
        personid = 22;
        expResult = 14;
        result = instance.getDoctorId(personid);
        assertEquals(expResult, result);
    }
    
}
