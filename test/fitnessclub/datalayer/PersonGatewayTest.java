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
public class PersonGatewayTest {
    
    public PersonGatewayTest() {
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
     * Test of getPersonById method, of class PersonGateway.
     */
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        int id = 0;
        PersonGateway instance = new PersonGateway();
        String result = instance.getPersonById(id);
        assertTrue(result.isEmpty());
        
        id = -1;
        result = instance.getPersonById(id);
        assertTrue(result.isEmpty());
        
        id = 2;
        result = instance.getPersonById(id);
        assertFalse(result.isEmpty());
        
    }

    /**
     * Test of getPersonIdByLogin method, of class PersonGateway.
     */
    @Test
    public void testGetPersonIdByLogin() {
        System.out.println("getPersonIdByLogin");
        String login = "";
        PersonGateway instance = new PersonGateway();
        int expResult = -1;
        int result = instance.getPersonIdByLogin(login);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkOnline method, of class PersonGateway.
     */
    @Test
    public void testCheckOnline() {
        System.out.println("checkOnline");
        int personid = 0;
        PersonGateway instance = new PersonGateway();
        int expResult = -1;
        int result = instance.checkOnline(personid);
        assertEquals(expResult, result);
        
        personid = -1;
        result = instance.checkOnline(personid);
        assertEquals(expResult, result);
        
        personid = 2;
        expResult = 0;
        result = instance.checkOnline(personid);
        assertEquals(expResult, result);
    }

    /**
     * Test of authPerson method, of class PersonGateway.
     */
    @Test
    public void testAuthPerson() {
        System.out.println("authPerson");
        String login = "";
        String password = "";
        PersonGateway instance = new PersonGateway();
        int expResult = -1;
        int result = instance.authPerson(login, password);
        assertEquals(expResult, result);
    }   
}
