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
import build.mypayquicker.platform.models.ReceiptCollectionResponse;
import build.mypayquicker.platform.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReceiptsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PQAPIV2Client client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ReceiptsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getReceiptsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of all account(s) receipts that supports filtering, sorting, and pagination
     * through existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAccountReceipts() throws Exception {
        // Parameters for the API call
        String acctToken = 
                "acct-b3f0570a-6586-4e00-8d6e-8a2bf93cfae4";
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
        Object result = null;
        try {
            result = controller.listAccountReceipts(acctToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
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

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"payload\":[{\"amount\":5000.01,\"currency\":\"USD\",\"sourceToken\":\"acct-0401"
                + "7f57-8526-4b0c-9152-5252975a86e4\",\"destinationToken\":\"dest-04017f57-8526-4b0"
                + "c-9152-5252975a86e4\",\"createdOn\":\"2023-02-21T00:00:00Z\"}],\"meta\":{\"pageN"
                + "o\":\"1\",\"pageSize\":\"20\",\"pageCount\":\"85\",\"recordCount\":\"1685\",\"ti"
                + "mezone\":\"GMT\"},\"links\":[{\"params\":{\"rel\":\"self\"},\"href\":\"https://p"
                + "latform.mypayquicker.com/api/v2/accounts/acct-04017f57-8526-4b0c-9152-5252975a86"
                + "e4/receipts\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list all prepaid-card receipts that supports filtering, sorting, and pagination
     * through existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPrepaidCardReceipts() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String destToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
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
        ReceiptCollectionResponse result = null;
        try {
            result = controller.listPrepaidCardReceipts(userToken, destToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
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
        headers.put("X-TimeZone", TestHelper.nullString);
        headers.put("X-Paging-PageNo", TestHelper.nullString);
        headers.put("X-Paging-PageCount", TestHelper.nullString);
        headers.put("X-Paging-PageSize", TestHelper.nullString);
        headers.put("X-Paging-TotalRecordCount", TestHelper.nullString);
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"payload\":[{\"amount\":5000.05,\"currency\":\"USD\",\"sourceToken\":\"user-0401"
                + "7f57-8526-4b0c-9152-5252975a86e4\",\"destinationToken\":\"dest-04017f57-8526-4b0"
                + "c-9152-5252975a86e4\",\"createdOn\":\"2023-02-21T00:00:00Z\"}],\"meta\":{\"pageN"
                + "o\":\"1\",\"pageSize\":\"20\",\"pageCount\":\"85\",\"recordCount\":\"1685\",\"ti"
                + "mezone\":\"GMT\"},\"links\":[{\"params\":{\"rel\":\"self\"},\"href\":\"https://p"
                + "latform.mypayquicker.com/api/v2/users/user-04017f57-8526-4b0c-9152-5252975a86e4/"
                + "prepaid-cards/dest-04017f57-8526-4b0c-9152-5252975a86e4/receipts\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list all user receipts that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListUserReceipts() throws Exception {
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
        ReceiptCollectionResponse result = null;
        try {
            result = controller.listUserReceipts(userToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
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
        headers.put("X-TimeZone", TestHelper.nullString);
        headers.put("X-Paging-PageNo", TestHelper.nullString);
        headers.put("X-Paging-PageCount", TestHelper.nullString);
        headers.put("X-Paging-PageSize", TestHelper.nullString);
        headers.put("X-Paging-TotalRecordCount", TestHelper.nullString);
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"payload\":[{\"amount\":5000.01,\"currency\":\"USD\",\"sourceToken\":\"user-0401"
                + "7f57-8526-4b0c-9152-5252975a86e4\",\"destinationToken\":\"dest-04017f57-8526-4b0"
                + "c-9152-5252975a86e4\",\"createdOn\":\"2023-02-21T00:00:00Z\"}],\"meta\":{\"pageN"
                + "o\":\"1\",\"pageSize\":\"20\",\"pageCount\":\"85\",\"recordCount\":\"1685\",\"ti"
                + "mezone\":\"GMT\"},\"links\":[{\"params\":{\"rel\":\"self\"},\"href\":\"https://p"
                + "latform.mypayquicker.com/api/v2/users/user-04017f57-8526-4b0c-9152-5252975a86e4/"
                + "receipts\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}