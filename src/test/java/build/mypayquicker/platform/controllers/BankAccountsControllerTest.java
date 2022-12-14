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
import build.mypayquicker.platform.models.BankAccountCollectionResponse;
import build.mypayquicker.platform.models.BankAccountFields;
import build.mypayquicker.platform.models.BankAccountRequirementCollectionResponse;
import build.mypayquicker.platform.models.BankAccountResponse;
import build.mypayquicker.platform.models.LanguageTypesEnum;
import build.mypayquicker.platform.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PQAPIV2Client client;
    
    /**
     * Controller instance (for all tests).
     */
    private static BankAccountsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getBankAccountsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of bank accounts that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListBankAccounts() throws Exception {
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
        BankAccountCollectionResponse result = null;
        try {
            result = controller.listBankAccounts(userToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"dest-7d8b1c83-01bb-40fb-87d7-26bd4c303f01\",\"status\":"
                + "\"DELETED\",\"createdOn\":\"2020-02-21T22:00:00Z\",\"bankAccountOwnershipType\":"
                + "\"PERSONAL\",\"type\":\"CHECKING\",\"fields\":[{\"key\":\"BANK_ACH_ABA\",\"value"
                + "\":\"333333333\"},{\"key\":\"BANK_BBAN\",\"value\":\"4444444444\"}],\"bankCurren"
                + "cy\":\"USD\",\"bankCountry\":\"US\",\"description\":\"My account\",\"links\":[{"
                + "\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]},{\"token\":\"dest-efacd12b-"
                + "a86e-4f44-bbea-927955ec1634\",\"status\":\"ACTIVE\",\"createdOn\":\"2020-02-21T2"
                + "2:00:00Z\",\"bankAccountOwnershipType\":\"PERSONAL\",\"type\":\"CHECKING\",\"fie"
                + "lds\":[{\"key\":\"BANK_ACH_ABA\",\"value\":\"012346789\"},{\"key\":\"BANK_BBAN"
                + "\",\"value\":\"987654321\"}],\"bankCurrency\":\"USD\",\"bankCountry\":\"US\",\"d"
                + "escription\":\"Personal checking account\",\"links\":[{\"params\":{\"rel\":\"sel"
                + "f\"},\"href\":\"string\"}]}],\"links\":[{\"params\":{\"rel\":\"self\"},\"href\":"
                + "\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a quote for a bank account using a user token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateBankAccount() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String xMyPayQuickerVersion = 
                "2020.02.24";
        BankAccountFields body = null;

        // Set callback and perform API call
        BankAccountResponse result = null;
        try {
            result = controller.createBankAccount(userToken, xMyPayQuickerVersion, body);
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
                "{\"token\":\"dest-efacd12b-a86e-4f44-bbea-927955ec1634\",\"status\":\"ACTIVE\",\"c"
                + "reatedOn\":\"2020-02-21T22:00:00Z\",\"bankAccountOwnershipType\":\"PERSONAL\","
                + "\"type\":\"CHECKING\",\"fields\":[{\"key\":\"BANK_ACH_ABA\",\"value\":\"01234678"
                + "9\"},{\"key\":\"BANK_BBAN\",\"value\":\"987654321\"}],\"bankCurrency\":\"USD\","
                + "\"bankCountry\":\"US\",\"description\":\"Personal checking account\",\"links\":["
                + "{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of bank accounts using a destination token that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveBankAccount() throws Exception {
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
        BankAccountResponse result = null;
        try {
            result = controller.retrieveBankAccount(userToken, destToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
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
                "{\"token\":\"dest-efacd12b-a86e-4f44-bbea-927955ec1634\",\"status\":\"ACTIVE\",\"c"
                + "reatedOn\":\"2020-02-21T22:00:00Z\",\"bankAccountOwnershipType\":\"PERSONAL\","
                + "\"type\":\"CHECKING\",\"fields\":[{\"key\":\"BANK_ACH_ABA\",\"value\":\"01234678"
                + "9\"},{\"key\":\"BANK_BBAN\",\"value\":\"987654321\"}],\"bankCurrency\":\"USD\","
                + "\"bankCountry\":\"US\",\"description\":\"Personal checking account\",\"links\":["
                + "{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Update a bank account.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateBankAccount() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String destToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        String xMyPayQuickerVersion = 
                "2020.02.24";
        BankAccountFields body = null;

        // Set callback and perform API call
        BankAccountResponse result = null;
        try {
            result = controller.updateBankAccount(userToken, destToken, xMyPayQuickerVersion, body);
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
                "{\"token\":\"dest-efacd12b-a86e-4f44-bbea-927955ec1634\",\"status\":\"ACTIVE\",\"c"
                + "reatedOn\":\"2020-02-21T22:00:00Z\",\"bankAccountOwnershipType\":\"PERSONAL\","
                + "\"type\":\"CHECKING\",\"fields\":[{\"key\":\"BANK_ACH_ABA\",\"value\":\"01234678"
                + "9\"},{\"key\":\"BANK_BBAN\",\"value\":\"987654321\"}],\"bankCurrency\":\"USD\","
                + "\"bankCountry\":\"US\",\"description\":\"Personal checking account\",\"links\":["
                + "{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Delete (cloak) a user bank account.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteBankAccount() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
        String destToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        String xMyPayQuickerVersion = 
                "2020.02.24";

        // Set callback and perform API call
        try {
            controller.deleteBankAccount(userToken, destToken, xMyPayQuickerVersion);
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

    /**
     * Retrieve requirements for adding a bank account using the parameters provided (user context,
     * given country of residence, supported EFT provider(s), destination currency, destination
     * country, required fields, with names, and regex validation expression) for easy customer
     * wire-up and validation.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetBankAccountRequirements() throws Exception {
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
        BankAccountRequirementCollectionResponse result = null;
        try {
            result = controller.getBankAccountRequirements(userToken, xMyPayQuickerVersion, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"bankCountry\":\"IT\",\"bankCurrency\":\"EUR\",\"requirements\":[{"
                + "\"requirement\":\"BANK_IBAN\",\"format\":{\"example\":\"IT43K0310412701000000820"
                + "420\",\"legend\":[{\"key\":\"IT43K0310412701000000820420\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Example IBAN\"},{\"language\":\"it-IT"
                + "\",\"translation\":\"Esempio IBAN\"}]}]},\"description\":[{\"language\":\"en-US"
                + "\",\"translation\":\"IBAN\"},{\"language\":\"it-IT\",\"translation\":\"IBAN\"}],"
                + "\"validators\":[{\"validatorType\":\"REGEX\",\"expression\":\"^IT\\\\\\\\d{2}[A-"
                + "Z]\\\\\\\\d{10}[0-9A-Z]{12}$\"}]},{\"requirement\":\"BANK_SWIFT_BIC\",\"format"
                + "\":{\"example\":\"01234567890\",\"legend\":[{\"key\":\"01234567890\",\"descripti"
                + "ons\":[{\"language\":\"en-US\",\"translation\":\"Example Swift/BIC\"},{\"languag"
                + "e\":\"it-IT\",\"translation\":\"Esempio Swift/BIC\"}]}]},\"description\":[{\"lan"
                + "guage\":\"en-US\",\"translation\":\"Swift/BIC\"},{\"language\":\"it-IT\",\"trans"
                + "lation\":\"Swift/BIC\"}],\"validators\":[{\"validatorType\":\"REGEX\",\"expressi"
                + "on\":\"^[a-z0-9A-Z]{8,11}$\"}]}],\"quote\":{\"formattedAmount\":\"$4.32 USD (USD"
                + ", en-US), 0,00 ??? EUR (EUR, fr-FR)\",\"amount\":4.32,\"currency\":\"USD\"},\"link"
                + "s\":[{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}],\"links\":[{\"params"
                + "\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
