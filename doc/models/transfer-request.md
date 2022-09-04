
# Transfer Request

Request for the transfer

## Structure

`TransferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceToken` | `String` | Optional | Unique identifier representing the source of funds. | String getSourceToken() | setSourceToken(String sourceToken) |
| `DestinationToken` | `String` | Optional | Unique identifier representing the destination of funds. | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `Notes` | `String` | Optional | Optional comments visible to the user. | String getNotes() | setNotes(String notes) |
| `Memo` | `String` | Optional | Optional internal memo not visible to the user. | String getMemo() | setMemo(String memo) |
| `ClientTransferId` | `String` | Optional | Unique value provided by the client for the transfer. | String getClientTransferId() | setClientTransferId(String clientTransferId) |
| `DestinationAmount` | `Double` | Optional | Amount transferred to the destination | Double getDestinationAmount() | setDestinationAmount(Double destinationAmount) |
| `DestinationCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getDestinationCurrency() | setDestinationCurrency(CurrencyTypesEnum destinationCurrency) |

## Example (as JSON)

```json
{
  "sourceToken": null,
  "destinationToken": null,
  "notes": null,
  "memo": null,
  "clientTransferId": null,
  "destinationAmount": null,
  "destinationCurrency": null
}
```

