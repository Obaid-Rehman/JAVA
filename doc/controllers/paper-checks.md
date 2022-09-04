# Paper Checks

Paper check-related operations

```java
PaperChecksController paperChecksController = client.getPaperChecksController();
```

## Class Name

`PaperChecksController`

## Methods

* [List Paper Checks](../../doc/controllers/paper-checks.md#list-paper-checks)
* [Order Paper Check](../../doc/controllers/paper-checks.md#order-paper-check)
* [Retrieve Paper Check](../../doc/controllers/paper-checks.md#retrieve-paper-check)
* [Update Paper Check](../../doc/controllers/paper-checks.md#update-paper-check)
* [Cancel Paper Check](../../doc/controllers/paper-checks.md#cancel-paper-check)


# List Paper Checks

Retrieve a list of paper checks that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<PaperCheckCollectionResponse> listPaperChecksAsync(
    final String userToken,
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
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

[`PaperCheckCollectionResponse`](../../doc/models/paper-check-collection-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

paperChecksController.listPaperChecksAsync(userToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Order Paper Check

Create a quote for a paper check.

```java
CompletableFuture<PaperCheckResponse> orderPaperCheckAsync(
    final String userToken,
    final String xMyPayQuickerVersion,
    final PaperCheckBase body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | [`PaperCheckBase`](../../doc/models/paper-check-base.md) | Body, Optional | - |

## Response Type

[`PaperCheckResponse`](../../doc/models/paper-check-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";
PaperCheckBase body = new PaperCheckBase();
body.setAmount(78.98);
body.setCurrency(CurrencyTypesEnum.HKD);

paperChecksController.orderPaperCheckAsync(userToken, xMyPayQuickerVersion, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve Paper Check

Retrieve a list of paper checks by destination token that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<PaperCheckResponse> retrievePaperCheckAsync(
    final String userToken,
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
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xferToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual transfer transaction, prefixed with <i>xfer-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

[`PaperCheckResponse`](../../doc/models/paper-check-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xferToken = "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

paperChecksController.retrievePaperCheckAsync(userToken, xferToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Paper Check

Create a quote for a paper check.

```java
CompletableFuture<PaperCheckResponse> updatePaperCheckAsync(
    final String userToken,
    final String xferToken,
    final String xMyPayQuickerVersion,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xferToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual transfer transaction, prefixed with <i>xfer-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | `Object` | Body, Optional | - |

## Response Type

[`PaperCheckResponse`](../../doc/models/paper-check-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xferToken = "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
String xMyPayQuickerVersion = "2020.02.24";

paperChecksController.updatePaperCheckAsync(userToken, xferToken, xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Cancel Paper Check

Delete a paper check by destination token.

```java
CompletableFuture<Void> cancelPaperCheckAsync(
    final String userToken,
    final String xferToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xferToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual transfer transaction, prefixed with <i>xfer-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xferToken = "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";
String xMyPayQuickerVersion = "2020.02.24";

paperChecksController.cancelPaperCheckAsync(userToken, xferToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

