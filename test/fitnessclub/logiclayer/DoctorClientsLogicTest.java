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
public class DoctorClientsLogicTest {
    
    public DoctorClientsLogicTest() {
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
     * Test of getDoctorClients method, of class DoctorClientsLogic.
     */
    @Test
    public void testGetDoctorClients() {
        System.out.println("getDoctorClients");
        int doctor_id = 0;
        DoctorClientsLogic instance = new DoctorClientsLogic();
        String result = instance.getDoctorClients(doctor_id);
        assertTrue(result.isEmpty());
        
        doctor_id = -1;
        result = instance.getDoctorClients(doctor_id);
        assertTrue(result.isEmpty());
        
        doctor_id = 14;
        result = instance.getDoctorClients(doctor_id);
        assertFalse(result.isEmpty());
    }    
}
