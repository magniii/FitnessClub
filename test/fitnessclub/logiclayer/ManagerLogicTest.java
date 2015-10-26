/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.logiclayer;

import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Client;
import fitnessclub.entity.Manager;
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
public class ManagerLogicTest {
    
    public ManagerLogicTest() {
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
     * Test of authManagerByPersonId method, of class ManagerLogic.
     */
    @Test
    public void testAuthManagerByPersonId() {
        System.out.println("authManagerByPersonId");
        int personid = 0;
        ManagerLogic instance = new ManagerLogic();
        Manager expResult = null;
        Manager result = instance.authManagerByPersonId(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        expResult = null;
        result = instance.authManagerByPersonId(personid);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllManagers method, of class ManagerLogic.
     */
    @Test
    public void testGetAllManagers() {
        System.out.println("getAllManagers");
        ManagerLogic instance = new ManagerLogic();
        String result = instance.getAllManagers();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of formDoctorRequest method, of class ManagerLogic.
     */
    @Test
    public void testFormDoctorRequest() {
        System.out.println("formDoctorRequest");
        int client_id = 0;
        ManagerLogic instance = new ManagerLogic();
        instance.formDoctorRequest(client_id);
    }

    /**
     * Test of offerClientContract method, of class ManagerLogic.
     */
    @Test
    public void testOfferClientContract() {
        System.out.println("offerClientContract");
        int client_id = 0;
        ManagerLogic instance = new ManagerLogic();
        instance.offerClientContract(client_id);
    }

    /**
     * Test of addManager method, of class ManagerLogic.
     */
    @Test
    public void testAddManager() {
        System.out.println("addManager");
        int personid = 0;
        ManagerLogic instance = new ManagerLogic();
        instance.addManager(personid);
    }
    
}
