# Receipts

Receipt-related operations

```java
ReceiptsController receiptsController = client.getReceiptsController();
```

## Class Name

`ReceiptsController`

## Methods

* [List Account Receipts](../../doc/controllers/receipts.md#list-account-receipts)
* [List Prepaid Card Receipts](../../doc/controllers/receipts.md#list-prepaid-card-receipts)
* [List User Receipts](../../doc/controllers/receipts.md#list-user-receipts)


# List Account Receipts

Retrieve a list of all account(s) receipts that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<Object> listAccountReceiptsAsync(
    final String acctToken,
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
| `acctToken` | `String` | Template, Required | Auto-generated unique identifier representing a company account, prefixed with <i>acct-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

`Object`

## Example Usage

```java
String acctToken = "acct-b3f0570a-6586-4e00-8d6e-8a2bf93cfae4";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

receiptsController.listAccountReceiptsAsync(acctToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "payload": [
    {
      "amount": 5000.01,
      "currency": "USD",
      "sourceToken": "acct-04017f57-8526-4b0c-9152-5252975a86e4",
      "destinationToken": "dest-04017f57-8526-4b0c-9152-5252975a86e4",
      "createdOn": "2023-02-21T00:00:00Z"
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "20",
    "pageCount": "85",
    "recordCount": "1685",
    "timezone": "GMT"
  },
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/accounts/acct-04017f57-8526-4b0c-9152-5252975a86e4/receipts"
    }
  ]
}
```


# List Prepaid Card Receipts

Retrieve a list all prepaid-card receipts that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<ReceiptCollectionResponse> listPrepaidCardReceiptsAsync(
    final String userToken,
    final String destToken,
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
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

[`ReceiptCollectionResponse`](../../doc/models/receipt-collection-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

receiptsController.listPrepaidCardReceiptsAsync(userToken, destToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "payload": [
    {
      "amount": 5000.05,
      "currency": "USD",
      "sourceToken": "user-04017f57-8526-4b0c-9152-5252975a86e4",
      "destinationToken": "dest-04017f57-8526-4b0c-9152-5252975a86e4",
      "createdOn": "2023-02-21T00:00:00Z"
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "20",
    "pageCount": "85",
    "recordCount": "1685",
    "timezone": "GMT"
  },
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/user-04017f57-8526-4b0c-9152-5252975a86e4/prepaid-cards/dest-04017f57-8526-4b0c-9152-5252975a86e4/receipts"
    }
  ]
}
```


# List User Receipts

Retrieve a list all user receipts that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<ReceiptCollectionResponse> listUserReceiptsAsync(
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

[`ReceiptCollectionResponse`](../../doc/models/receipt-collection-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

receiptsController.listUserReceiptsAsync(userToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "payload": [
    {
      "amount": 5000.01,
      "currency": "USD",
      "sourceToken": "user-04017f57-8526-4b0c-9152-5252975a86e4",
      "destinationToken": "dest-04017f57-8526-4b0c-9152-5252975a86e4",
      "createdOn": "2023-02-21T00:00:00Z"
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "20",
    "pageCount": "85",
    "recordCount": "1685",
    "timezone": "GMT"
  },
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/user-04017f57-8526-4b0c-9152-5252975a86e4/receipts"
    }
  ]
}
```

