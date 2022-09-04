
# Payment Response

Response from a Payment request

## Structure

`PaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `double` | Required | Amount of the transfer in the specified currency. | double getAmount() | setAmount(double amount) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Required | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |
| `SourceToken` | `String` | Optional | Unique identifier representing the source of funds. | String getSourceToken() | setSourceToken(String sourceToken) |
| `DestinationToken` | `String` | Optional | Unique identifier representing the destination of funds. | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `Notes` | `String` | Optional | Optional comments visible to the user. | String getNotes() | setNotes(String notes) |
| `Memo` | `String` | Optional | Optional internal memo not visible to the user. | String getMemo() | setMemo(String memo) |
| `Purpose` | [`PaymentPurposeTypesEnum`](../../doc/models/payment-purpose-types-enum.md) | Optional | Used to identify the purpose of a payment and impacts reporting and calculated taxable earnings (if utilizing tax services) | PaymentPurposeTypesEnum getPurpose() | setPurpose(PaymentPurposeTypesEnum purpose) |
| `ClientPaymentId` | `String` | Optional | Unique value provided by the client for the payment. | String getClientPaymentId() | setClientPaymentId(String clientPaymentId) |
| `AutoAcceptQuote` | `Boolean` | Optional | Determines whether the quote is automatically accepted or if a POST utilizing the token for the quote is required. | Boolean getAutoAcceptQuote() | setAutoAcceptQuote(Boolean autoAcceptQuote) |
| `Expires` | `LocalDateTime` | Optional | Quote expiration, ISO-8601 format, UTC by default unless overridden. | LocalDateTime getExpires() | setExpires(LocalDateTime expires) |
| `NotBefore` | `LocalDateTime` | Optional | Transfer is scheduled and will not process before this time. | LocalDateTime getNotBefore() | setNotBefore(LocalDateTime notBefore) |
| `NotAfter` | `LocalDateTime` | Optional | Transfer expires if not completed prior to this time. | LocalDateTime getNotAfter() | setNotAfter(LocalDateTime notAfter) |
| `Status` | [`TransferStatusTypesEnum`](../../doc/models/transfer-status-types-enum.md) | Optional | Current status of a transfer | TransferStatusTypesEnum getStatus() | setStatus(TransferStatusTypesEnum status) |
| `Links` | [`List<HaetosParams>`](../../doc/models/haetos-params.md) | Optional | - | List<HaetosParams> getLinks() | setLinks(List<HaetosParams> links) |

## Example (as JSON)

```json
{
  "amount": 5,
  "currency": null
}
```

