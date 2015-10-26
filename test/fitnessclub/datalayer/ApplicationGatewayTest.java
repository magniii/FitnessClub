/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub.datalayer;

import java.sql.Date;
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
public class ApplicationGatewayTest {
    
    public ApplicationGatewayTest() {
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
     * Test of getAppByClientId method, of class ApplicationGateway.
     */
    @Test
    public void testGetAppByClientId() {
        System.out.println("getAppByClientId");
        int client_id = 0;
        ApplicationGateway instance = new ApplicationGateway();
        String result = instance.getAppByClientId(client_id);
        assertTrue(result.isEmpty());
        
        client_id = -1;
        result = instance.getAppByClientId(client_id);
        assertTrue(result.isEmpty());
        
        client_id = 12;
        result = instance.getAppByClientId(client_id);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getAppStateByClientId method, of class ApplicationGateway.
     */
    @Test
    public void testGetAppStateByClientId() {
        System.out.println("getAppStateByClientId");
        int client_id = 0;
        ApplicationGateway instance = new ApplicationGateway();
        String result = instance.getAppStateByClientId(client_id);
        assertTrue(result.isEmpty());
        
        client_id = -1;
        result = instance.getAppStateByClientId(client_id);
        assertTrue(result.isEmpty());
        
        client_id = 12;
        result = instance.getAppStateByClientId(client_id);
        assertFalse(result.isEmpty());
        
    }

    /**
     * Test of getAppTextByClient method, of class ApplicationGateway.
     */
    @Test
    public void testGetAppTextByClient() {
        System.out.println("getAppTextByClient");
        int client_id = 0;
        ApplicationGateway instance = new ApplicationGateway();
        String result = instance.getAppTextByClient(client_id);
        assertTrue(result.isEmpty());
        
        client_id = -1;
        result = instance.getAppTextByClient(client_id);
        assertTrue(result.isEmpty());
        
        client_id = 12;
        result = instance.getAppTextByClient(client_id);
        assertFalse(result.isEmpty());
    }    
}
