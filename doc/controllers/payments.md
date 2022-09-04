# Payments

Payment-related operations

```java
PaymentsController paymentsController = client.getPaymentsController();
```

## Class Name

`PaymentsController`

## Methods

* [Retrieve Payment](../../doc/controllers/payments.md#retrieve-payment)
* [Accept Payment Quote](../../doc/controllers/payments.md#accept-payment-quote)
* [Cancel Payment Quote](../../doc/controllers/payments.md#cancel-payment-quote)
* [Retract Payment Full](../../doc/controllers/payments.md#retract-payment-full)
* [Retract Payment Partial](../../doc/controllers/payments.md#retract-payment-partial)
* [List Payments](../../doc/controllers/payments.md#list-payments)
* [Create Payment Quote](../../doc/controllers/payments.md#create-payment-quote)


# Retrieve Payment

Retrieve a list of all payments that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<PaymentResponse> retrievePaymentAsync(
    final String pmntToken,
    final String xMyPayQuickerVersion,
    final String filter,
    final LanguageTypesEnum language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pmntToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual payment transaction and quote, prefixed with <i>pmnt-</i>.<br>**Constraints**: *Pattern*: `^pmnt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

[`PaymentResponse`](../../doc/models/payment-response.md)

## Example Usage

```java
String pmntToken = "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";
String xMyPayQuickerVersion = "2020.02.24";
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

paymentsController.retrievePaymentAsync(pmntToken, xMyPayQuickerVersion, filter, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Accept Payment Quote

Accept an open payment quote.

```java
CompletableFuture<PaymentResponse> acceptPaymentQuoteAsync(
    final String pmntToken,
    final String xMyPayQuickerVersion,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pmntToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual payment transaction and quote, prefixed with <i>pmnt-</i>.<br>**Constraints**: *Pattern*: `^pmnt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | `Object` | Body, Optional | - |

## Response Type

[`PaymentResponse`](../../doc/models/payment-response.md)

## Example Usage

```java
String pmntToken = "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";
String xMyPayQuickerVersion = "2020.02.24";

paymentsController.acceptPaymentQuoteAsync(pmntToken, xMyPayQuickerVersion, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Cancel Payment Quote

Cancel an open payment quote.

```java
CompletableFuture<Void> cancelPaymentQuoteAsync(
    final String pmntToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pmntToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual payment transaction and quote, prefixed with <i>pmnt-</i>.<br>**Constraints**: *Pattern*: `^pmnt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String pmntToken = "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";
String xMyPayQuickerVersion = "2020.02.24";

paymentsController.cancelPaymentQuoteAsync(pmntToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retract Payment Full

Perform a payment retraction for the full payment amount.

```java
CompletableFuture<Void> retractPaymentFullAsync(
    final String pmntToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pmntToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual payment transaction and quote, prefixed with <i>pmnt-</i>.<br>**Constraints**: *Pattern*: `^pmnt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String pmntToken = "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";
String xMyPayQuickerVersion = "2020.02.24";

paymentsController.retractPaymentFullAsync(pmntToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retract Payment Partial

Perform a payment retraction for a partial payment amount.

```java
CompletableFuture<Void> retractPaymentPartialAsync(
    final String pmntToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pmntToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual payment transaction and quote, prefixed with <i>pmnt-</i>.<br>**Constraints**: *Pattern*: `^pmnt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String pmntToken = "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";
String xMyPayQuickerVersion = "2020.02.24";

paymentsController.retractPaymentPartialAsync(pmntToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# List Payments

Retrieve a list of all payments that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<PaymentsCollectionResponse> listPaymentsAsync(
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

[`PaymentsCollectionResponse`](../../doc/models/payments-collection-response.md)

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

paymentsController.listPaymentsAsync(xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Create Payment Quote

Create a payment quote.

```java
CompletableFuture<PaymentResponse> createPaymentQuoteAsync(
    final String xMyPayQuickerVersion,
    final PaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `body` | [`PaymentRequest`](../../doc/models/payment-request.md) | Body, Optional | - |

## Response Type

[`PaymentResponse`](../../doc/models/payment-response.md)

## Example Usage

```java
String xMyPayQuickerVersion = "2020.02.24";
PaymentRequest body = new PaymentRequest();
body.setAmount(78.98);
body.setCurrency(CurrencyTypesEnum.HKD);

paymentsController.createPaymentQuoteAsync(xMyPayQuickerVersion, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

