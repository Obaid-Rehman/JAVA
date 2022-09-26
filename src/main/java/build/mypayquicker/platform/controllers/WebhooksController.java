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
import build.mypayquicker.platform.models.WebhookCollectionResponse;
import build.mypayquicker.platform.models.WebhookSubscription;
import build.mypayquicker.platform.models.WebhookSubscriptionResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class WebhooksController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public WebhooksController(Configuration config, HttpClient httpClient,
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
    public WebhooksController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve a list of all webhook subscriptions that supports filtering, sorting, and pagination
     * through existing mechanisms.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the WebhookCollectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookCollectionResponse listWebhookSubscriptions(
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildListWebhookSubscriptionsRequest(xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListWebhookSubscriptionsResponse(context);
    }

    /**
     * Retrieve a list of all webhook subscriptions that supports filtering, sorting, and pagination
     * through existing mechanisms.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the WebhookCollectionResponse response from the API call
     */
    public CompletableFuture<WebhookCollectionResponse> listWebhookSubscriptionsAsync(
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildListWebhookSubscriptionsRequest(xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListWebhookSubscriptionsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listWebhookSubscriptions.
     */
    private HttpRequest buildListWebhookSubscriptionsRequest(
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/webhooks");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listWebhookSubscriptions.
     * @return An object of type WebhookCollectionResponse
     */
    private WebhookCollectionResponse handleListWebhookSubscriptionsResponse(
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
        WebhookCollectionResponse result = ApiHelper.deserialize(responseBody,
                WebhookCollectionResponse.class);

        return result;
    }

    /**
     * Create a webhook subscription for a given URL and namespace. When this event fires, the
     * webhook receives a call from the API.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Optional parameter: Example:
     * @return    Returns the WebhookSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookSubscriptionResponse createWebhookSubscription(
            final String xMyPayQuickerVersion,
            final WebhookSubscription body) throws ApiException, IOException {
        HttpRequest request = buildCreateWebhookSubscriptionRequest(xMyPayQuickerVersion, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateWebhookSubscriptionResponse(context);
    }

    /**
     * Create a webhook subscription for a given URL and namespace. When this event fires, the
     * webhook receives a call from the API.
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @param  body  Optional parameter: Example:
     * @return    Returns the WebhookSubscriptionResponse response from the API call
     */
    public CompletableFuture<WebhookSubscriptionResponse> createWebhookSubscriptionAsync(
            final String xMyPayQuickerVersion,
            final WebhookSubscription body) {
        return makeHttpCallAsync(() -> buildCreateWebhookSubscriptionRequest(xMyPayQuickerVersion,
                body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCreateWebhookSubscriptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for createWebhookSubscription.
     */
    private HttpRequest buildCreateWebhookSubscriptionRequest(
            final String xMyPayQuickerVersion,
            final WebhookSubscription body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/webhooks");

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
     * Processes the response for createWebhookSubscription.
     * @return An object of type WebhookSubscriptionResponse
     */
    private WebhookSubscriptionResponse handleCreateWebhookSubscriptionResponse(
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
        WebhookSubscriptionResponse result = ApiHelper.deserialize(responseBody,
                WebhookSubscriptionResponse.class);

        return result;
    }

    /**
     * Retrieve a single webhook subscription using the webhook token.
     * @param  webhToken  Required parameter: Example:
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the WebhookSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookSubscriptionResponse retrieveWebhookSubscription(
            final String webhToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildRetrieveWebhookSubscriptionRequest(webhToken,
                xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveWebhookSubscriptionResponse(context);
    }

    /**
     * Retrieve a single webhook subscription using the webhook token.
     * @param  webhToken  Required parameter: Example:
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the WebhookSubscriptionResponse response from the API call
     */
    public CompletableFuture<WebhookSubscriptionResponse> retrieveWebhookSubscriptionAsync(
            final String webhToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildRetrieveWebhookSubscriptionRequest(webhToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveWebhookSubscriptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveWebhookSubscription.
     */
    private HttpRequest buildRetrieveWebhookSubscriptionRequest(
            final String webhToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/webhooks/{webh-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("webh-token",
                new SimpleEntry<Object, Boolean>(webhToken, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-MyPayQuicker-Version", xMyPayQuickerVersion);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for retrieveWebhookSubscription.
     * @return An object of type WebhookSubscriptionResponse
     */
    private WebhookSubscriptionResponse handleRetrieveWebhookSubscriptionResponse(
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
        WebhookSubscriptionResponse result = ApiHelper.deserialize(responseBody,
                WebhookSubscriptionResponse.class);

        return result;
    }

    /**
     * Delete a webhook subscription. Deleted webhooks no longer receive notifications about events.
     * Deleting an already deleted webhook will result in a successful 200 (OK) response code.
     * @param  webhToken  Required parameter: Example:
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteWebhookSubscription(
            final String webhToken,
            final String xMyPayQuickerVersion) throws ApiException, IOException {
        HttpRequest request = buildDeleteWebhookSubscriptionRequest(webhToken,
                xMyPayQuickerVersion);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleDeleteWebhookSubscriptionResponse(context);
    }

    /**
     * Delete a webhook subscription. Deleted webhooks no longer receive notifications about events.
     * Deleting an already deleted webhook will result in a successful 200 (OK) response code.
     * @param  webhToken  Required parameter: Example:
     * @param  xMyPayQuickerVersion  Required parameter: Date-based API Version specified in the
     *         header &lt;i&gt;required&lt;/i&gt; on all calls.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> deleteWebhookSubscriptionAsync(
            final String webhToken,
            final String xMyPayQuickerVersion) {
        return makeHttpCallAsync(() -> buildDeleteWebhookSubscriptionRequest(webhToken,
                xMyPayQuickerVersion),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDeleteWebhookSubscriptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteWebhookSubscription.
     */
    private HttpRequest buildDeleteWebhookSubscriptionRequest(
            final String webhToken,
            final String xMyPayQuickerVersion) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/webhooks/{webh-token}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("webh-token",
                new SimpleEntry<Object, Boolean>(webhToken, true));
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
     * Processes the response for deleteWebhookSubscription.
     * @return An object of type void
     */
    private Void handleDeleteWebhookSubscriptionResponse(
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