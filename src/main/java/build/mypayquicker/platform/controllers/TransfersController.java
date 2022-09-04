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
import build.mypayquicker.platform.models.TransferCollectionResponse;
import build.mypayquicker.platform.models.TransferRequest;
import build.mypayquicker.platform.models.TransferResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class TransfersController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public TransfersController(Configuration config, HttpClient httpClient,
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
    public TransfersController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve details of a specific transfer represented by a transfer token.
     * @param  xferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with &lt;i&gt;xfer-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResponse retrieveTransfer(
            final String xferToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildRetrieveTransferRequest(xferToken, xMyPayQuickerVersion, page,
                pageSize, filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveTransferResponse(context);
    }

    /**
     * Retrieve details of a specific transfer represented by a transfer token.
     * @param  xferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with &lt;i&gt;xfer-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferResponse response from the API call
     */
    public CompletableFuture<TransferResponse> retrieveTransferAsync(
            final String xferToken,
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildRetrieveTransferRequest(xferToken, xMyPayQuickerVersion,
                page, pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveTransferResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveTransfer.
     */
    private HttpRequest buildRetrieveTransferRequest(
            final String xferToken,
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
                + "/transfers/{xfer-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("xfer-token",
                new SimpleEntry<Object, Boolean>(xferToken, true));
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
     * Processes the response for retrieveTransfer.
     * @return An object of type TransferResponse
     */
    private TransferResponse handleRetrieveTransferResponse(
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
        TransferResponse result = ApiHelper.deserialize(responseBody,
                TransferResponse.class);

        return result;
    }

    /**
     * Accept a transfer quote.
     * @param  xferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with &lt;i&gt;xfer-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void acceptTransferQuote(
            final String xferToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildAcceptTransferQuoteRequest(xferToken, xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleAcceptTransferQuoteResponse(context);
    }

    /**
     * Accept a transfer quote.
     * @param  xferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with &lt;i&gt;xfer-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> acceptTransferQuoteAsync(
            final String xferToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildAcceptTransferQuoteRequest(xferToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleAcceptTransferQuoteResponse(context));
    }

    /**
     * Builds the HttpRequest object for acceptTransferQuote.
     */
    private HttpRequest buildAcceptTransferQuoteRequest(
            final String xferToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/transfers/{xfer-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("xfer-token",
                new SimpleEntry<Object, Boolean>(xferToken, true));
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
     * Processes the response for acceptTransferQuote.
     * @return An object of type void
     */
    private Void handleAcceptTransferQuoteResponse(
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
     * Optional cancellation that auto-cancels after a period organically expires or when account
     * activity invalidates the quote.
     * @param  xferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with &lt;i&gt;xfer-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void cancelTransferQuote(
            final String xferToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildCancelTransferQuoteRequest(xferToken, xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleCancelTransferQuoteResponse(context);
    }

    /**
     * Optional cancellation that auto-cancels after a period organically expires or when account
     * activity invalidates the quote.
     * @param  xferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with &lt;i&gt;xfer-&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> cancelTransferQuoteAsync(
            final String xferToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildCancelTransferQuoteRequest(xferToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCancelTransferQuoteResponse(context));
    }

    /**
     * Builds the HttpRequest object for cancelTransferQuote.
     */
    private HttpRequest buildCancelTransferQuoteRequest(
            final String xferToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/transfers/{xfer-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("xfer-token",
                new SimpleEntry<Object, Boolean>(xferToken, true));
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
     * Processes the response for cancelTransferQuote.
     * @return An object of type void
     */
    private Void handleCancelTransferQuoteResponse(
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
     * Retrieve a list of all transfers that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferCollectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferCollectionResponse listTransfers(
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) throws ApiException, IOException {
        HttpRequest request = buildListTransfersRequest(xMyPayQuickerVersion, page, pageSize,
                filter, sort, language);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListTransfersResponse(context);
    }

    /**
     * Retrieve a list of all transfers that supports filtering, sorting, and pagination through
     * existing mechanisms.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  page  Optional parameter: Page number of specific page to return
     * @param  pageSize  Optional parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferCollectionResponse response from the API call
     */
    public CompletableFuture<TransferCollectionResponse> listTransfersAsync(
            final String xMyPayQuickerVersion,
            final Integer page,
            final Integer pageSize,
            final String filter,
            final String sort,
            final LanguageTypesEnum language) {
        return makeHttpCallAsync(() -> buildListTransfersRequest(xMyPayQuickerVersion, page,
                pageSize, filter, sort, language),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListTransfersResponse(context));
    }

    /**
     * Builds the HttpRequest object for listTransfers.
     */
    private HttpRequest buildListTransfersRequest(
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
                + "/transfers");

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
     * Processes the response for listTransfers.
     * @return An object of type TransferCollectionResponse
     */
    private TransferCollectionResponse handleListTransfersResponse(
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
        TransferCollectionResponse result = ApiHelper.deserialize(responseBody,
                TransferCollectionResponse.class);

        return result;
    }

    /**
     * Create a new quote. &lt;i&gt;*This can be a non-payment card-to-card transfer, prepaid card from
     * Flex (wallet), bank account, or user-to-user transfer.&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Required parameter: Example:
     * @return    Returns the TransferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResponse quoteTransfer(
            final String xMyPayQuickerVersion,
            final TransferRequest body) throws ApiException, IOException {
        HttpRequest request = buildQuoteTransferRequest(xMyPayQuickerVersion, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleQuoteTransferResponse(context);
    }

    /**
     * Create a new quote. &lt;i&gt;*This can be a non-payment card-to-card transfer, prepaid card from
     * Flex (wallet), bank account, or user-to-user transfer.&lt;/i&gt;.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Required parameter: Example:
     * @return    Returns the TransferResponse response from the API call
     */
    public CompletableFuture<TransferResponse> quoteTransferAsync(
            final String xMyPayQuickerVersion,
            final TransferRequest body) {
        return makeHttpCallAsync(() -> buildQuoteTransferRequest(xMyPayQuickerVersion, body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleQuoteTransferResponse(context));
    }

    /**
     * Builds the HttpRequest object for quoteTransfer.
     */
    private HttpRequest buildQuoteTransferRequest(
            final String xMyPayQuickerVersion,
            final TransferRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/transfers");

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
     * Processes the response for quoteTransfer.
     * @return An object of type TransferResponse
     */
    private TransferResponse handleQuoteTransferResponse(
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
        TransferResponse result = ApiHelper.deserialize(responseBody,
                TransferResponse.class);

        return result;
    }

}