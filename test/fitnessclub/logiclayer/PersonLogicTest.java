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
public class PersonLogicTest {
    
    public PersonLogicTest() {
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
     * Test of authPerson method, of class PersonLogic.
     */
    @Test
    public void testAuthPerson() {
        System.out.println("authPerson");
        String login = "";
        String password = "";
        PersonLogic instance = new PersonLogic();
        int expResult = -1;
        int result = instance.authPerson(login, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersonIdByLogin method, of class PersonLogic.
     */
    @Test
    public void testGetPersonIdByLogin() {
        System.out.println("getPersonIdByLogin");
        String login = "manager";
        PersonLogic instance = new PersonLogic();
        int expResult = 2;
        int result = instance.getPersonIdByLogin(login);
        assertEquals(expResult, result);
    }
    
}
