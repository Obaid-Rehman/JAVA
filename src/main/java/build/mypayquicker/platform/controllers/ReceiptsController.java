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
import build.mypayquicker.platform.models.LanguageTypesEnum;
import build.mypayquicker.platform.models.ReceiptCollectionResponse;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ReceiptsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public ReceiptsController(Configuration config, HttpClient httpClient,
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
    public ReceiptsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve a list of all account(s) receipts that supports filtering, sorting, and pagination
     * through existing mechanisms.
     * @param  acctToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with &lt;i&gt;acct-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object listAccountReceipts(
            final String acctToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildListAccountReceiptsRequest(acctToken, xMyPayQuickerVersion, page,
                pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListAccountReceiptsResponse(context);
    }

    /**
     * Retrieve a list of all account(s) receipts that supports filtering, sorting, and pagination
     * through existing mechanisms.
     * @param  acctToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with &lt;i&gt;acct-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> listAccountReceiptsAsync(
            final String acctToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildListAccountReceiptsRequest(acctToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListAccountReceiptsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listAccountReceipts.
     */
    private HttpRequest buildListAccountReceiptsRequest(
            final String acctToken,
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
                + "/accounts/{acct-token}/receipts");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("acct-token",
                new SimpleEntry<Object, Boolean>(acctToken, true));
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
     * Processes the response for listAccountReceipts.
     * @return An object of type Object
     */
    private Object handleListAccountReceiptsResponse(
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
        Object result = responseBody;

        return result;
    }

    /**
     * Retrieve a list all prepaid-card receipts that supports filtering, sorting, and pagination
     * through existing mechanisms.
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
     * @return    Returns the ReceiptCollectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptCollectionResponse listPrepaidCardReceipts(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildListPrepaidCardReceiptsRequest(userToken, destToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListPrepaidCardReceiptsResponse(context);
    }

    /**
     * Retrieve a list all prepaid-card receipts that supports filtering, sorting, and pagination
     * through existing mechanisms.
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
     * @return    Returns the ReceiptCollectionResponse response from the API call
     */
    public CompletableFuture<ReceiptCollectionResponse> listPrepaidCardReceiptsAsync(
            final String userToken,
            final String destToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildListPrepaidCardReceiptsRequest(userToken, destToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListPrepaidCardReceiptsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listPrepaidCardReceipts.
     */
    private HttpRequest buildListPrepaidCardReceiptsRequest(
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
                + "/users/{user-token}/prepaid-cards/{dest-token}/receipts");

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
     * Processes the response for listPrepaidCardReceipts.
     * @return An object of type ReceiptCollectionResponse
     */
    private ReceiptCollectionResponse handleListPrepaidCardReceiptsResponse(
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
        ReceiptCollectionResponse result = ApiHelper.deserialize(responseBody,
                ReceiptCollectionResponse.class);

        return result;
    }

    /**
     * Retrieve a list all user receipts that supports filtering, sorting, and pagination through
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
     * @return    Returns the ReceiptCollectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptCollectionResponse listUserReceipts(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildListUserReceiptsRequest(userToken, xMyPayQuickerVersion, page,
                pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListUserReceiptsResponse(context);
    }

    /**
     * Retrieve a list all user receipts that supports filtering, sorting, and pagination through
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
     * @return    Returns the ReceiptCollectionResponse response from the API call
     */
    public CompletableFuture<ReceiptCollectionResponse> listUserReceiptsAsync(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildListUserReceiptsRequest(userToken, xMyPayQuickerVersion,
                page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListUserReceiptsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listUserReceipts.
     */
    private HttpRequest buildListUserReceiptsRequest(
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
                + "/users/{user-token}/receipts");

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
     * Processes the response for listUserReceipts.
     * @return An object of type ReceiptCollectionResponse
     */
    private ReceiptCollectionResponse handleListUserReceiptsResponse(
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
        ReceiptCollectionResponse result = ApiHelper.deserialize(responseBody,
                ReceiptCollectionResponse.class);

        return result;
    }

}