# Webhooks

Webhook-related operations

```java
WebhooksController webhooksController = client.getWebhooksController();
```

## Class Name

`WebhooksController`

## Methods

* [List Webhook Subscriptions](../../doc/controllers/webhooks.md#list-webhook-subscriptions)
* [Create Webhook Subscription](../../doc/controllers/webhooks.md#create-webhook-subscription)
* [Retrieve Webhook Subscription](../../doc/controllers/webhooks.md#retrieve-webhook-subscription)
* [Delete Webhook Subscription](../../doc/controllers/webhooks.md#delete-webhook-subscription)


# List Webhook Subscriptions

Retrieve a list of all webhook subscriptions that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<WebhookCollectionResponse> listWebhookSubscriptionsAsync(
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

[`WebhookCollectionResponse`](../../doc/models/webhook-collection-response.md)

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";

webhooksController.listWebhookSubscriptionsAsync(xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "string"
    }
  ],
  "payload": [
    {
      "links": [
        {
          "params": {
            "rel": "self"
          },
          "href": "string"
        }
      ],
      "url": "https://www.example.com/webhooks",
      "namespace": "BANKACCOUNTS.UPDATED.STATUS.APPROVED",
      "token": "webh-2dd54a53-3814-4ce1-862f-dc06b09ead4a",
      "created": "2020-01-01",
      "lastUpdated": "2020-02-01"
    }
  ]
}
```


# Create Webhook Subscription

Create a webhook subscription for a given URL and namespace. When this event fires, the webhook receives a call from the API.

```java
CompletableFuture<WebhookSubscriptionResponse> createWebhookSubscriptionAsync(
    final String xMyPayQuickerVersion,
    final WebhookSubscription body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | [`WebhookSubscription`](../../doc/models/webhook-subscription.md) | Body, Optional | - |

## Response Type

[`WebhookSubscriptionResponse`](../../doc/models/webhook-subscription-response.md)

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";

webhooksController.createWebhookSubscriptionAsync(xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "string"
    }
  ],
  "url": "https://www.example.com/webhooks",
  "namespace": "BANKACCOUNTS.UPDATED.STATUS.APPROVED",
  "token": "webh-2dd54a53-3814-4ce1-862f-dc06b09ead4a",
  "created": "2020-01-01"
}
```


# Retrieve Webhook Subscription

Retrieve a single webhook subscription using the webhook token.

```java
CompletableFuture<WebhookSubscriptionResponse> retrieveWebhookSubscriptionAsync(
    final String webhToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `webhToken` | `String` | Template, Required | - |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

[`WebhookSubscriptionResponse`](../../doc/models/webhook-subscription-response.md)

## Example Usage

```java
String webhToken = "webh-token0";
String xMyPayQuickerVersion = "2020.02.24";

webhooksController.retrieveWebhookSubscriptionAsync(webhToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "string"
    }
  ],
  "url": "https://www.example.com/webhooks",
  "namespace": "BANKACCOUNTS.UPDATED.STATUS.APPROVED",
  "token": "webh-2dd54a53-3814-4ce1-862f-dc06b09ead4a",
  "created": "2020-01-01",
  "lastUpdated": "2020-02-01"
}
```


# Delete Webhook Subscription

Delete a webhook subscription. Deleted webhooks no longer receive notifications about events. Deleting an already deleted webhook will result in a successful 200 (OK) response code.

```java
CompletableFuture<Void> deleteWebhookSubscriptionAsync(
    final String webhToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `webhToken` | `String` | Template, Required | - |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String webhToken = "webh-token0";
String xMyPayQuickerVersion = "2020.02.24";

webhooksController.deleteWebhookSubscriptionAsync(webhToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

