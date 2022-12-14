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
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DocumentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DocumentsController(Configuration config, HttpClient httpClient,
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
    public DocumentsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve a list of user documents that supports filtering, sorting, and pagination through
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
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void listUserDocuments(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildListUserDocumentsRequest(userToken, xMyPayQuickerVersion, page,
                pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleListUserDocumentsResponse(context);
    }

    /**
     * Retrieve a list of user documents that supports filtering, sorting, and pagination through
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
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> listUserDocumentsAsync(
            final String userToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildListUserDocumentsRequest(userToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListUserDocumentsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listUserDocuments.
     */
    private HttpRequest buildListUserDocumentsRequest(
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
                + "/users/{user-token}/documents");

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
     * Processes the response for listUserDocuments.
     * @return An object of type void
     */
    private Void handleListUserDocumentsResponse(
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
     * Create a quote for a user document.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void createUserDocument(
            final String userToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildCreateUserDocumentRequest(userToken, xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleCreateUserDocumentResponse(context);
    }

    /**
     * Create a quote for a user document.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> createUserDocumentAsync(
            final String userToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildCreateUserDocumentRequest(userToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCreateUserDocumentResponse(context));
    }

    /**
     * Builds the HttpRequest object for createUserDocument.
     */
    private HttpRequest buildCreateUserDocumentRequest(
            final String userToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/documents");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createUserDocument.
     * @return An object of type void
     */
    private Void handleCreateUserDocumentResponse(
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
     * Retrieve an individual user document by its document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  docuToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with &lt;i&gt;docu-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void retrieveUserDocument(
            final String userToken,
            final String docuToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildRetrieveUserDocumentRequest(userToken, docuToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleRetrieveUserDocumentResponse(context);
    }

    /**
     * Retrieve an individual user document by its document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  docuToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with &lt;i&gt;docu-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> retrieveUserDocumentAsync(
            final String userToken,
            final String docuToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildRetrieveUserDocumentRequest(userToken, docuToken,
                xMyPayQuickerVersion, page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveUserDocumentResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveUserDocument.
     */
    private HttpRequest buildRetrieveUserDocumentRequest(
            final String userToken,
            final String docuToken,
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
                + "/users/{user-token}/documents/{docu-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        templateParameters.put("docu-token",
                new SimpleEntry<Object, Boolean>(docuToken, true));
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
     * Processes the response for retrieveUserDocument.
     * @return An object of type void
     */
    private Void handleRetrieveUserDocumentResponse(
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
     * Replace the user document at the given document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  docuToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with &lt;i&gt;docu-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void replaceUserDocument(
            final String userToken,
            final String docuToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildReplaceUserDocumentRequest(userToken, docuToken,
                xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleReplaceUserDocumentResponse(context);
    }

    /**
     * Replace the user document at the given document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with &lt;i&gt;user-&lt;/i&gt;.
     * @param  docuToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with &lt;i&gt;docu-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> replaceUserDocumentAsync(
            final String userToken,
            final String docuToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildReplaceUserDocumentRequest(userToken, docuToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReplaceUserDocumentResponse(context));
    }

    /**
     * Builds the HttpRequest object for replaceUserDocument.
     */
    private HttpRequest buildReplaceUserDocumentRequest(
            final String userToken,
            final String docuToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{user-token}/documents/{docu-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("user-token",
                new SimpleEntry<Object, Boolean>(userToken, true));
        templateParameters.put("docu-token",
                new SimpleEntry<Object, Boolean>(docuToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().put(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for replaceUserDocument.
     * @return An object of type void
     */
    private Void handleReplaceUserDocumentResponse(
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

}