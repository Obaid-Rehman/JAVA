# Prepaid Cards

Prepaid Card-related operations

```java
PrepaidCardsController prepaidCardsController = client.getPrepaidCardsController();
```

## Class Name

`PrepaidCardsController`

## Methods

* [Replace Prepaid Card](../../doc/controllers/prepaid-cards.md#replace-prepaid-card)
* [Retrieve Prepaid Card](../../doc/controllers/prepaid-cards.md#retrieve-prepaid-card)
* [Update Prepaid Card Partial](../../doc/controllers/prepaid-cards.md#update-prepaid-card-partial)
* [Generate PIN Operation Token](../../doc/controllers/prepaid-cards.md#generate-pin-operation-token)
* [Set PIN If Supported](../../doc/controllers/prepaid-cards.md#set-pin-if-supported)
* [Reveal PIN If Supported](../../doc/controllers/prepaid-cards.md#reveal-pin-if-supported)
* [List Prepaid Cards](../../doc/controllers/prepaid-cards.md#list-prepaid-cards)
* [Order Prepaid Card](../../doc/controllers/prepaid-cards.md#order-prepaid-card)
* [Generate Prepaid Card Data Token](../../doc/controllers/prepaid-cards.md#generate-prepaid-card-data-token)
* [Get Prepaid Card Data](../../doc/controllers/prepaid-cards.md#get-prepaid-card-data)


# Replace Prepaid Card

Replace an existing Prepaid Card specifying the replacement reason and the card package for the replacement card.

```java
CompletableFuture<PrepaidCardResponse> replacePrepaidCardAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | `Object` | Body, Optional | - |

## Response Type

[`PrepaidCardResponse`](../../doc/models/prepaid-card-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";

prepaidCardsController.replacePrepaidCardAsync(userToken, destToken, xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d",
  "status": "QUEUED",
  "createdOn": "2020-02-21T22:00:00Z",
  "country": "US",
  "currency": "USD",
  "cardPersonalization": "PERSONALIZED",
  "cardPackage": "blue_consumer_10k",
  "cardNetwork": "VISA",
  "expires": "2023-02-21T00:00:00Z",
  "cardNumber": "1234 56** **** 1234",
  "cvv": "123",
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/xxx/prepaid-cards/dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d"
    }
  ]
}
```


# Retrieve Prepaid Card

Retrieve Prepaid Card details by destination token.

```java
CompletableFuture<PrepaidCardResponse> retrievePrepaidCardAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

[`PrepaidCardResponse`](../../doc/models/prepaid-card-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";

prepaidCardsController.retrievePrepaidCardAsync(userToken, destToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d",
  "status": "QUEUED",
  "createdOn": "2020-02-21T22:00:00Z",
  "country": "US",
  "currency": "USD",
  "cardPersonalization": "PERSONALIZED",
  "cardPackage": "blue_consumer_10k",
  "cardNetwork": "VISA",
  "expires": "2023-02-21T00:00:00Z",
  "cardNumber": "1234 56** **** 1234",
  "cvv": "123",
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/xxx/prepaid-cards/dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d"
    }
  ]
}
```


# Update Prepaid Card Partial

Partial Prepaid Card update typically used when modifying card status. <i>*Does not require the entire object be passed in the request</i>

```java
CompletableFuture<PrepaidCardResponse> updatePrepaidCardPartialAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion,
    final PrepaidCardStatus body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | [`PrepaidCardStatus`](../../doc/models/prepaid-card-status.md) | Body, Optional | - |

## Response Type

[`PrepaidCardResponse`](../../doc/models/prepaid-card-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";

prepaidCardsController.updatePrepaidCardPartialAsync(userToken, destToken, xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d",
  "status": "LOCKED",
  "createdOn": "2020-02-21T22:00:00Z",
  "country": "US",
  "currency": "USD",
  "cardPersonalization": "PERSONALIZED",
  "cardPackage": "blue_consumer_10k",
  "cardNetwork": "VISA",
  "expires": "2023-02-21T00:00:00Z",
  "cardNumber": "1234 56** **** 1234",
  "cvv": "123",
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/xxx/prepaid-cards/dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d"
    }
  ]
}
```


# Generate PIN Operation Token

Retrieve one part of a two-part token required to reveal or set a client side PIN. <i>*Not all programs support a reveal or set PIN operation.</i>

```java
CompletableFuture<PrepaidCardPinToken> generatePINOperationTokenAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

[`PrepaidCardPinToken`](../../doc/models/prepaid-card-pin-token.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";

prepaidCardsController.generatePINOperationTokenAsync(userToken, destToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Set PIN If Supported

Allows the setting of a PIN if supported by program.

```java
CompletableFuture<UsersPrepaidCardsPinResponse> setPINIfSupportedAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion,
    final String token,
    final String cardPin)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `token` | `String` | Query, Required | Token used as part of a two-leg card PIN reveal request sent directly from the client, generally involving a second piece of data such as the CVV code on the back of a card. |
| `cardPin` | `String` | Query, Required | Prepaid card PIN for ATM and Debit usage |

## Response Type

[`UsersPrepaidCardsPinResponse`](../../doc/models/users-prepaid-cards-pin-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";
String token = "token6";
String cardPin = "cardPin4";

prepaidCardsController.setPINIfSupportedAsync(userToken, destToken, xMyPayQuickerVersion, token, cardPin).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reveal PIN If Supported

Reveals the PIN for a card where PIN reveal functionality is supported in the program and hosted by PayQuicker.

```java
CompletableFuture<PrepaidCardPin> revealPINIfSupportedAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion,
    final String token,
    final String cvc2,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `destToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with <i>dest->.<br>**Constraints**: *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `token` | `String` | Query, Required | Token used as part of a two-leg card PIN reveal request sent directly from the client, generally involving a second piece of data such as the CVV code on the back of a card. |
| `cvc2` | `String` | Query, Required | Card Verification Value (CVV) located on the back of your credit card or debit card is a 3-digit number on VISA® and MasterCard® branded credit cards, and debit cards. |
| `body` | `Object` | Body, Optional | - |

## Response Type

[`PrepaidCardPin`](../../doc/models/prepaid-card-pin.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String destToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String xMyPayQuickerVersion = "2020.02.24";
String token = "token6";
String cvc2 = "cvc20";

prepaidCardsController.revealPINIfSupportedAsync(userToken, destToken, xMyPayQuickerVersion, token, cvc2, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# List Prepaid Cards

Retrieve a list of all pre-paid cards by user token that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<PrepaidCardCollectionResponse> listPrepaidCardsAsync(
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

[`PrepaidCardCollectionResponse`](../../doc/models/prepaid-card-collection-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

prepaidCardsController.listPrepaidCardsAsync(userToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
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
      "token": "dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d",
      "status": "QUEUED",
      "createdOn": "2020-02-21T22:00:00Z",
      "country": "US",
      "currency": "USD",
      "cardPersonalization": "PERSONALIZED",
      "cardPackage": "blue_consumer_10k",
      "cardNetwork": "VISA",
      "expires": "2023-02-21T00:00:00Z",
      "cardNumber": "1234 56** **** 1234",
      "cvv": "123",
      "links": [
        {
          "params": {
            "rel": "self"
          },
          "href": "https://platform.mypayquicker.com/api/v2/users/xxx/prepaid-cards/dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d"
        }
      ]
    }
  ],
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/xxx/prepaid-cards"
    }
  ]
}
```


# Order Prepaid Card

Order a pre-paid card for the user by specifying a cardPackage. <i>*A package defines the type of card, currency, artwork utilized, and often the method of delivery.</i>

```java
CompletableFuture<PrepaidCardRequestResponse> orderPrepaidCardAsync(
    final String userToken,
    final String xMyPayQuickerVersion,
    final PrepaidCardBase body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | [`PrepaidCardBase`](../../doc/models/prepaid-card-base.md) | Body, Optional | - |

## Response Type

[`PrepaidCardRequestResponse`](../../doc/models/prepaid-card-request-response.md)

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";

prepaidCardsController.orderPrepaidCardAsync(userToken, xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d",
  "status": "QUEUED",
  "createdOn": "2020-02-21T22:00:00Z",
  "country": "US",
  "currency": "USD",
  "cardPersonalization": "PERSONALIZED",
  "cardPackage": "blue_consumer_10k",
  "cardNetwork": "VISA",
  "expires": "2023-02-21T00:00:00Z",
  "cardNumber": "1234 56** **** 1234",
  "cvv": "123",
  "links": [
    {
      "params": {
        "rel": "self"
      },
      "href": "https://platform.mypayquicker.com/api/v2/users/xxx/prepaid-cards/dest-37ba1fb7-6136-4216-bb13-f903af6b9f0d"
    }
  ]
}
```


# Generate Prepaid Card Data Token

Generate a token used to reveal prepaid card information in the form of image data (base64) or JSON.

```java
CompletableFuture<PrepaidCardDataTokenResponse> generatePrepaidCardDataTokenAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion,
    final FormatEnum format,
    final SideEnum side)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | - |
| `destToken` | `String` | Template, Required | - |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `format` | [`FormatEnum`](../../doc/models/format-enum.md) | Query, Required | Desired format for the prepaid card data. |
| `side` | [`SideEnum`](../../doc/models/side-enum.md) | Query, Optional | Side to specify when retrieving a prepaid card's image data. *Required if IMAGE format specified. |

## Response Type

[`PrepaidCardDataTokenResponse`](../../doc/models/prepaid-card-data-token-response.md)

## Example Usage

```java
String userToken = "user-token6";
String destToken = "dest-token2";
String xMyPayQuickerVersion = "2020.02.24";
FormatEnum format = FormatEnum.ENUM_TEXTIMAGE;

prepaidCardsController.generatePrepaidCardDataTokenAsync(userToken, destToken, xMyPayQuickerVersion, format, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Prepaid Card Data

Return prepaid card data in the form of image data, text, or both.

```java
CompletableFuture<PrepaidCardDataResponse> getPrepaidCardDataAsync(
    final String userToken,
    final String destToken,
    final String xMyPayQuickerVersion,
    final FormatEnum format,
    final String token,
    final SideEnum side)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | - |
| `destToken` | `String` | Template, Required | - |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `format` | [`FormatEnum`](../../doc/models/format-enum.md) | Query, Required | Desired format for the prepaid card data. |
| `token` | `String` | Query, Required | Token used as part of a two-leg card PIN reveal request sent directly from the client, generally involving a second piece of data such as the CVV code on the back of a card. |
| `side` | [`SideEnum`](../../doc/models/side-enum.md) | Query, Optional | Side to specify when retrieving a prepaid card's image data. *Required if IMAGE format specified. |

## Response Type

[`PrepaidCardDataResponse`](../../doc/models/prepaid-card-data-response.md)

## Example Usage

```java
String userToken = "user-token6";
String destToken = "dest-token2";
String xMyPayQuickerVersion = "2020.02.24";
FormatEnum format = FormatEnum.ENUM_TEXTIMAGE;
String token = "token6";

prepaidCardsController.getPrepaidCardDataAsync(userToken, destToken, xMyPayQuickerVersion, format, token, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

