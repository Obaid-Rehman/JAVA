
# Receipt Base

Base for the receipt

## Structure

`ReceiptBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FormattedAmount` | `String` | Optional | Formatted monetary amount | String getFormattedAmount() | setFormattedAmount(String formattedAmount) |
| `Amount` | `double` | Required | Amount of the transfer in the specified currency. | double getAmount() | setAmount(double amount) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Required | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |
| `SourceToken` | `String` | Optional | Unique identifier representing the source of funds. | String getSourceToken() | setSourceToken(String sourceToken) |
| `DestinationToken` | `String` | Optional | Unique identifier representing the destination of funds. | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `CreatedOn` | `LocalDateTime` | Optional | Time at which the object was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |
| `Status` | [`TransferStatusTypesEnum`](../../doc/models/transfer-status-types-enum.md) | Optional | Current status of a transfer | TransferStatusTypesEnum getStatus() | setStatus(TransferStatusTypesEnum status) |

## Example (as JSON)

```json
{
  "amount": 5,
  "currency": null
}
```

