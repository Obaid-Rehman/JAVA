# Transfers

Transfer-related operations

```java
TransfersController transfersController = client.getTransfersController();
```

## Class Name

`TransfersController`

## Methods

* [Retrieve Transfer](../../doc/controllers/transfers.md#retrieve-transfer)
* [Accept Transfer Quote](../../doc/controllers/transfers.md#accept-transfer-quote)
* [Cancel Transfer Quote](../../doc/controllers/transfers.md#cancel-transfer-quote)
* [List Transfers](../../doc/controllers/transfers.md#list-transfers)
* [Quote Transfer](../../doc/controllers/transfers.md#quote-transfer)


# Retrieve Transfer

Retrieve details of a specific transfer represented by a transfer token.

```java
CompletableFuture<TransferResponse> retrieveTransferAsync(
    final String xferToken,
    final String xMyPayQuickerVersion,
    final Integer page,
    final Integer pageSize,
    final String filter,
    final String sort,
    final LanguageTypesEnum language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xferToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual transfer transaction, prefixed with <i>xfer-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

[`TransferResponse`](../../doc/models/transfer-response.md)

## Example Usage

```java
String xferToken = "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

transfersController.retrieveTransferAsync(xferToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Accept Transfer Quote

Accept a transfer quote

```java
CompletableFuture<Void> acceptTransferQuoteAsync(
    final String xferToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xferToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual transfer transaction, prefixed with <i>xfer-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String xferToken = "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
String xMyPayQuickerVersion = "2020.02.24";

transfersController.acceptTransferQuoteAsync(xferToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Cancel Transfer Quote

Optional cancellation that auto-cancels after a period organically expires or when account activity invalidates the quote.

```java
CompletableFuture<Void> cancelTransferQuoteAsync(
    final String xferToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xferToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual transfer transaction, prefixed with <i>xfer-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String xferToken = "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
String xMyPayQuickerVersion = "2020.02.24";

transfersController.cancelTransferQuoteAsync(xferToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# List Transfers

Retrieve a list of all transfers that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<TransferCollectionResponse> listTransfersAsync(
    final String xMyPayQuickerVersion,
    final Integer page,
    final Integer pageSize,
    final String filter,
    final String sort,
    final LanguageTypesEnum language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

[`TransferCollectionResponse`](../../doc/models/transfer-collection-response.md)

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

transfersController.listTransfersAsync(xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Quote Transfer

Create a new quote. <i>*This can be a non-payment card-to-card transfer, prepaid card from Flex (wallet), bank account, or user-to-user transfer.</i>

```java
CompletableFuture<TransferResponse> quoteTransferAsync(
    final String xMyPayQuickerVersion,
    final TransferRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | [`TransferRequest`](../../doc/models/transfer-request.md) | Body, Required | - |

## Response Type

[`TransferResponse`](../../doc/models/transfer-response.md)

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";
TransferRequest body = new TransferRequest();

transfersController.quoteTransferAsync(xMyPayQuickerVersion, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "sourceToken": "user-114773fd-85c1-4977-8ce5-24af71f744e9",
  "destinationToken": "dest-63947e68-5393-4d00-955d-e0020017924b",
  "notes": "string",
  "memo": "string",
  "destinationAmount": -1.79,
  "destinationCurrency": "USD",
  "clientTransferId": "DKKde3Meeiiw34",
  "token": "xfer-0c0f2727-6521-47c9-b1fa-f132306d456a",
  "sourceAmount": -1.79,
  "sourceCurrency": "USD",
  "status": "QUOTED",
  "fx": {
    "destinationAmount": -1.79,
    "destinationCurrency": "USD",
    "sourceAmount": -1.79,
    "sourceCurrency": "USD",
    "rate": 0.85
  },
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://url.to.com/xfer-0c0f2727-6521-47c9-b1fa-f132306d456a"
    }
  ]
}
```

