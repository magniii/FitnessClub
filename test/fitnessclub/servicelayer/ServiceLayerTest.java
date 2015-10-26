/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.servicelayer;

import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Client;
import fitnessclub.entity.Coach;
import fitnessclub.entity.Doctor;
import fitnessclub.entity.Manager;
import javax.swing.DefaultListModel;
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
public class ServiceLayerTest {
    
    public ServiceLayerTest() {
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
     * Test of checkAuth method, of class ServiceLayer.
     */
    @Test
    public void testCheckAuth() {
        System.out.println("checkAuth");
        String login = "";
        String password = "";
        ServiceLayer instance = new ServiceLayer();
        Object expResult = -1;
        Object result = instance.checkAuth(login, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkAppState method, of class ServiceLayer.
     */
    @Test
    public void testCheckAppState() {
        System.out.println("checkAppState");
        int person_id = 21;
        ServiceLayer instance = new ServiceLayer();
        int expResult = 11;
        int result = instance.checkAppState(person_id);
        assertEquals(expResult, result);
    }

    /**
     * Test of doctorCheckedClient method, of class ServiceLayer.
     */
    @Test
    public void testDoctorCheckedClient() {
        System.out.println("doctorCheckedClient");
        int person_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.doctorCheckedClient(person_id);
    }

    /**
     * Test of parseAllClients method, of class ServiceLayer.
     */
    @Test
    public void testParseAllClients() {
        System.out.println("parseAllClients");
        ServiceLayer instance = new ServiceLayer();
        DefaultListModel<String> expResult = null;
        DefaultListModel<String> result = instance.parseAllClients();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of assignClientToCoach method, of class ServiceLayer.
     */
    @Test
    public void testAssignClientToCoach() {
        System.out.println("assignClientToCoach");
        int client_id = 0;
        int coach_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.assignClientToCoach(client_id, coach_id);
    }

    /**
     * Test of coachAcceptsClientRequest method, of class ServiceLayer.
     */
    @Test
    public void testCoachAcceptsClientRequest() {
        System.out.println("coachAcceptsClientRequest");
        int person_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.coachAcceptsClientRequest(person_id);
    }

    /**
     * Test of coachSendsProgram method, of class ServiceLayer.
     */
    @Test
    public void testCoachSendsProgram() {
        System.out.println("coachSendsProgram");
        String text = "";
        int personid = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.coachSendsProgram(text, personid);
    }

    /**
     * Test of getClientsCoach method, of class ServiceLayer.
     */
    @Test
    public void testGetClientsCoach() {
        System.out.println("getClientsCoach");
        int client_id = 0;
        ServiceLayer instance = new ServiceLayer();
        Coach expResult = null;
        Coach result = instance.getClientsCoach(client_id);
        assertEquals(expResult, result);
    }

    /**
     * Test of clientAcceptsContract method, of class ServiceLayer.
     */
    @Test
    public void testClientAcceptsContract() {
        System.out.println("clientAcceptsContract");
        int person_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.clientAcceptsContract(person_id);
    }

    /**
     * Test of clientFillsForm method, of class ServiceLayer.
     */
    @Test
    public void testClientFillsForm() {
        System.out.println("clientFillsForm");
        String formText = "";
        ServiceLayer instance = new ServiceLayer();
        instance.clientFillsForm(formText);
    }

    /**
     * Test of offerContractToClient method, of class ServiceLayer.
     */
    @Test
    public void testOfferContractToClient() {
        System.out.println("offerContractToClient");
        int client_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.offerContractToClient(client_id);
    }

    /**
     * Test of approveClientContract method, of class ServiceLayer.
     */
    @Test
    public void testApproveClientContract() {
        System.out.println("approveClientContract");
        int client_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.approveClientContract(client_id);
    }

    /**
     * Test of addClientToDoctor method, of class ServiceLayer.
     */
    @Test
    public void testAddClientToDoctor() {
        System.out.println("addClientToDoctor");
        int doctor_id = 0;
        int client_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.addClientToDoctor(doctor_id, client_id);
    }

    /**
     * Test of getProgramText method, of class ServiceLayer.
     */
    @Test
    public void testGetProgramText() {
        System.out.println("getProgramText");
        int client_id = 0;
        ServiceLayer instance = new ServiceLayer();
        String expResult = "";
        String result = instance.getProgramText(client_id);
        assertEquals(expResult, result);
    }

    /**
     * Test of clientChangesCoach method, of class ServiceLayer.
     */
    @Test
    public void testClientChangesCoach() {
        System.out.println("clientChangesCoach");
        int client_id = 0;
        int coach_id = 0;
        ServiceLayer instance = new ServiceLayer();
        instance.clientChangesCoach(client_id, coach_id);
    }
    
}
