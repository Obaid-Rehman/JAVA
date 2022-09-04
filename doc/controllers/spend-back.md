# Spend Back

Spendback-related operations

```java
SpendBackController spendBackController = client.getSpendBackController();
```

## Class Name

`SpendBackController`

## Methods

* [Retrieve Spendback](../../doc/controllers/spend-back.md#retrieve-spendback)
* [Accept Spendback Quote](../../doc/controllers/spend-back.md#accept-spendback-quote)
* [Cancel Spendback Quote](../../doc/controllers/spend-back.md#cancel-spendback-quote)
* [Refund Spendback Full](../../doc/controllers/spend-back.md#refund-spendback-full)
* [Refund Spendback Partial](../../doc/controllers/spend-back.md#refund-spendback-partial)
* [List Spend Backs](../../doc/controllers/spend-back.md#list-spend-backs)
* [Quote Spendback](../../doc/controllers/spend-back.md#quote-spendback)


# Retrieve Spendback

Retrieve a single spendback quote using the spendback token.

```java
CompletableFuture<Void> retrieveSpendbackAsync(
    final String spndToken,
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
| `spndToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spendback transaction and quote, prefixed with <i>spnd-</i>.<br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

`void`

## Example Usage

```java
String spndToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

spendBackController.retrieveSpendbackAsync(spndToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Accept Spendback Quote

Accept an open spendback quote.

```java
CompletableFuture<Void> acceptSpendbackQuoteAsync(
    final String spndToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spndToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spendback transaction and quote, prefixed with <i>spnd-</i>.<br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String spndToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String xMyPayQuickerVersion = "2020.02.24";

spendBackController.acceptSpendbackQuoteAsync(spndToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Cancel Spendback Quote

Cancel an open spendback quote.

```java
CompletableFuture<Void> cancelSpendbackQuoteAsync(
    final String spndToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spndToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spendback transaction and quote, prefixed with <i>spnd-</i>.<br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String spndToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String xMyPayQuickerVersion = "2020.02.24";

spendBackController.cancelSpendbackQuoteAsync(spndToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Refund Spendback Full

Perform a spendback refund for the full amount.

```java
CompletableFuture<Void> refundSpendbackFullAsync(
    final String spndToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spndToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spendback transaction and quote, prefixed with <i>spnd-</i>.<br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String spndToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String xMyPayQuickerVersion = "2020.02.24";

spendBackController.refundSpendbackFullAsync(spndToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Refund Spendback Partial

Perform a spendback refund for a partial amount.

```java
CompletableFuture<Void> refundSpendbackPartialAsync(
    final String spndToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spndToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spendback transaction and quote, prefixed with <i>spnd-</i>.<br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String spndToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String xMyPayQuickerVersion = "2020.02.24";

spendBackController.refundSpendbackPartialAsync(spndToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# List Spend Backs

Retrieve a list of all spendbacks that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<Void> listSpendBacksAsync(
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

`void`

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

spendBackController.listSpendBacksAsync(xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Quote Spendback

Create a spendback quote. <i>*Spendbacks can be automatically accepted by setting the `autoAcceptQuote` flag. If not automatically accepted, a POST is required to the spendback endpoint using the token returned in the response. Quotes can be accepted, cancelled, or allowed to expire.</i>

```java
CompletableFuture<Void> quoteSpendbackAsync(
    final String xMyPayQuickerVersion,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";

spendBackController.quoteSpendbackAsync(xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

