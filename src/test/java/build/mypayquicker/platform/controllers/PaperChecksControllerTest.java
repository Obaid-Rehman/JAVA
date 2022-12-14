/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import build.mypayquicker.platform.ApiHelper;
import build.mypayquicker.platform.PQAPIV2Client;
import build.mypayquicker.platform.exceptions.ApiException;
import build.mypayquicker.platform.models.LanguageTypesEnum;
import build.mypayquicker.platform.models.PaperCheckBase;
import build.mypayquicker.platform.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaperChecksControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PQAPIV2Client client;
    
    /**
     * Controller instance (for all tests).
     */
    private static PaperChecksController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getPaperChecksController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of paper checks that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPaperChecks() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String xMyPayQuickerVersion = 
                "2020.02.24";
        Integer page = null;
        Integer pageSize = 20;
        String filter = 
                "'name'*'Fra'||*'Ger','numericCode'>'5'";
        String sort = 
                "-name";
        LanguageTypesEnum language = LanguageTypesEnum.fromString(
                "en-US");

        // Set callback and perform API call
        try {
            controller.listPaperChecks(userToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Create a quote for a paper check.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestOrderPaperCheck() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String xMyPayQuickerVersion = 
                "2020.02.24";
        PaperCheckBase body = null;

        // Set callback and perform API call
        try {
            controller.orderPaperCheck(userToken, xMyPayQuickerVersion, body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Retrieve a list of paper checks by destination token that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrievePaperCheck() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String xferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
        String xMyPayQuickerVersion = 
                "2020.02.24";
        Integer page = null;
        Integer pageSize = 20;
        String filter = 
                "'name'*'Fra'||*'Ger','numericCode'>'5'";
        String sort = 
                "-name";
        LanguageTypesEnum language = LanguageTypesEnum.fromString(
                "en-US");

        // Set callback and perform API call
        try {
            controller.retrievePaperCheck(userToken, xferToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Create a quote for a paper check.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdatePaperCheck() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String xferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
        String xMyPayQuickerVersion = 
                "2020.02.24";
        Object body = null;

        // Set callback and perform API call
        try {
            controller.updatePaperCheck(userToken, xferToken, xMyPayQuickerVersion, body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Delete a paper check by destination token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelPaperCheck() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String xferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
        String xMyPayQuickerVersion = 
                "2020.02.24";

        // Set callback and perform API call
        try {
            controller.cancelPaperCheck(userToken, xferToken, xMyPayQuickerVersion);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
