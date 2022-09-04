/*
 * PQAPIV2Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package build.mypayquicker.platform.controllers;

import build.mypayquicker.platform.ApiHelper;
import build.mypayquicker.platform.AuthManager;
import build.mypayquicker.platform.Configuration;
import build.mypayquicker.platform.exceptions.ApiException;
import build.mypayquicker.platform.http.Headers;
import build.mypayquicker.platform.http.client.HttpCallback;
import build.mypayquicker.platform.http.client.HttpClient;
import build.mypayquicker.platform.http.client.HttpContext;
import build.mypayquicker.platform.http.request.HttpRequest;
import build.mypayquicker.platform.http.response.HttpResponse;
import build.mypayquicker.platform.http.response.HttpStringResponse;
import build.mypayquicker.platform.models.BankAccountCollectionResponse;
import build.mypayquicker.platform.models.BankAccountFields;
import build.mypayquicker.platform.models.BankAccountRequirementCollectionResponse;
import build.mypayquicker.platform.models.BankAccountResponse;
import build.mypayquicker.platform.models.LanguageTypesEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class BankAccountsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public BankAccountsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public BankAccountsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve a list of bank accounts that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountCollectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountCollectionResponse listBankAccounts(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildListBankAccountsRequest(userToken, xMyPayQuickerVersion, page,
                pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListBankAccountsResponse(context);
    }

    /**
     * Retrieve a list of bank accounts that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountCollectionResponse response from the API call
     */
    public CompletableFuture<BankAccountCollectionResponse> listBankAccountsAsync(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildListBankAccountsRequest(userToken, xMyPayQuickerVersion,
                page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListBankAccountsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listBankAccounts.
     */
    private HttpRequest buildListBankAccountsRequest(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/bank-accounts");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("page", page);
        queryParameters.put("pageSize",
                (pageSize != null) ? pageSize : 20);
        queryParameters.put("filter", filter);
        queryParameters.put("sort", sort);
        queryParameters.put("language",
                (language != null) ? language.value() : null);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listBankAccounts.
     * @return An object of type BankAccountCollectionResponse
     */
    private BankAccountCollectionResponse handleListBankAccountsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BankAccountCollectionResponse result = ApiHelper.deserialize(responseBody,
                BankAccountCollectionResponse.class);

        return result;
    }

    /**
     * Create a quote for a bank account using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Optional parameter: Example:
     * @return    Returns the BankAccountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResponse createBankAccount(
            final String userToken,
            final String xMyPayQuickerVersion,
            final BankAccountFields body) throws ApiException, IOException {
        HttpRequest request = buildCreateBankAccountRequest(userToken, xMyPayQuickerVersion, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateBankAccountResponse(context);
    }

    /**
     * Create a quote for a bank account using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Optional parameter: Example:
     * @return    Returns the BankAccountResponse response from the API call
     */
    public CompletableFuture<BankAccountResponse> createBankAccountAsync(
            final String userToken,
            final String xMyPayQuickerVersion,
            final BankAccountFields body) {
        return makeHttpCallAsync(() -> buildCreateBankAccountRequest(userToken,
                xMyPayQuickerVersion, body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCreateBankAccountResponse(context));
    }

    /**
     * Builds the HttpRequest object for createBankAccount.
     */
    private HttpRequest buildCreateBankAccountRequest(
            final String userToken,
            final String xMyPayQuickerVersion,
            final BankAccountFields body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/bank-accounts");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createBankAccount.
     * @return An object of type BankAccountResponse
     */
    private BankAccountResponse handleCreateBankAccountResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BankAccountResponse result = ApiHelper.deserialize(responseBody,
                BankAccountResponse.class);

        return result;
    }

    /**
     * Retrieve a list of bank accounts using a destination token that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  destToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with &lt;i&gt;dest-&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResponse retrieveBankAccount(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildRetrieveBankAccountRequest(userToken, destToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveBankAccountResponse(context);
    }

    /**
     * Retrieve a list of bank accounts using a destination token that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  destToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with &lt;i&gt;dest-&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountResponse response from the API call
     */
    public CompletableFuture<BankAccountResponse> retrieveBankAccountAsync(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildRetrieveBankAccountRequest(userToken, destToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveBankAccountResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveBankAccount.
     */
    private HttpRequest buildRetrieveBankAccountRequest(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/bank-accounts/{dest-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        templateParameters.put("dest-token",
                new SimpleEntry<Object, Boolean>(destToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("page", page);
        queryParameters.put("pageSize",
                (pageSize != null) ? pageSize : 20);
        queryParameters.put("filter", filter);
        queryParameters.put("sort", sort);
        queryParameters.put("language",
                (language != null) ? language.value() : null);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for retrieveBankAccount.
     * @return An object of type BankAccountResponse
     */
    private BankAccountResponse handleRetrieveBankAccountResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BankAccountResponse result = ApiHelper.deserialize(responseBody,
                BankAccountResponse.class);

        return result;
    }

    /**
     * Update a bank account.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  destToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with &lt;i&gt;dest-&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Optional parameter: Example:
     * @return    Returns the BankAccountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResponse updateBankAccount(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final BankAccountFields body) throws ApiException, IOException {
        HttpRequest request = buildUpdateBankAccountRequest(userToken, destToken,
                xMyPayQuickerVersion, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateBankAccountResponse(context);
    }

    /**
     * Update a bank account.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  destToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with &lt;i&gt;dest-&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Optional parameter: Example:
     * @return    Returns the BankAccountResponse response from the API call
     */
    public CompletableFuture<BankAccountResponse> updateBankAccountAsync(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final BankAccountFields body) {
        return makeHttpCallAsync(() -> buildUpdateBankAccountRequest(userToken, destToken,
                xMyPayQuickerVersion, body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateBankAccountResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateBankAccount.
     */
    private HttpRequest buildUpdateBankAccountRequest(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final BankAccountFields body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/bank-accounts/{dest-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        templateParameters.put("dest-token",
                new SimpleEntry<Object, Boolean>(destToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateBankAccount.
     * @return An object of type BankAccountResponse
     */
    private BankAccountResponse handleUpdateBankAccountResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BankAccountResponse result = ApiHelper.deserialize(responseBody,
                BankAccountResponse.class);

        return result;
    }

    /**
     * Delete (cloak) a user bank account.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  destToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with &lt;i&gt;dest-&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteBankAccount(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildDeleteBankAccountRequest(userToken, destToken,
                xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleDeleteBankAccountResponse(context);
    }

    /**
     * Delete (cloak) a user bank account.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  destToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with &lt;i&gt;dest-&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> deleteBankAccountAsync(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildDeleteBankAccountRequest(userToken, destToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDeleteBankAccountResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteBankAccount.
     */
    private HttpRequest buildDeleteBankAccountRequest(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/bank-accounts/{dest-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        templateParameters.put("dest-token",
                new SimpleEntry<Object, Boolean>(destToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for deleteBankAccount.
     * @return An object of type void
     */
    private Void handleDeleteBankAccountResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        return null;
    }

    /**
     * Retrieve requirements for adding a bank account using the parameters provided (user context,
     * given country of residence, supported EFT provider(s), destination currency, destination
     * country, required fields, with names, and regex validation expression) for easy customer
     * wire-up and validation.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountRequirementCollectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountRequirementCollectionResponse getBankAccountRequirements(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildGetBankAccountRequirementsRequest(userToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetBankAccountRequirementsResponse(context);
    }

    /**
     * Retrieve requirements for adding a bank account using the parameters provided (user context,
     * given country of residence, supported EFT provider(s), destination currency, destination
     * country, required fields, with names, and regex validation expression) for easy customer
     * wire-up and validation.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountRequirementCollectionResponse response from the API call
     */
    public CompletableFuture<BankAccountRequirementCollectionResponse> getBankAccountRequirementsAsync(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildGetBankAccountRequirementsRequest(userToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetBankAccountRequirementsResponse(context));
    }

    /**
     * Builds the HttpRequest object for getBankAccountRequirements.
     */
    private HttpRequest buildGetBankAccountRequirementsRequest(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/bank-accounts/requirements");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("page", page);
        queryParameters.put("pageSize",
                (pageSize != null) ? pageSize : 20);
        queryParameters.put("filter", filter);
        queryParameters.put("sort", sort);
        queryParameters.put("language",
                (language != null) ? language.value() : null);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getBankAccountRequirements.
     * @return An object of type BankAccountRequirementCollectionResponse
     */
    private BankAccountRequirementCollectionResponse handleGetBankAccountRequirementsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BankAccountRequirementCollectionResponse result = ApiHelper.deserialize(responseBody,
                BankAccountRequirementCollectionResponse.class);

        return result;
    }

}