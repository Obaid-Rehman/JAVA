
# Transfer

Description of the transfer request

## Structure

`Transfer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceToken` | `String` | Optional | Unique identifier representing the source of funds. | String getSourceToken() | setSourceToken(String sourceToken) |
| `DestinationToken` | `String` | Optional | Unique identifier representing the destination of funds. | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `Notes` | `String` | Optional | Optional comments visible to the user. | String getNotes() | setNotes(String notes) |
| `Memo` | `String` | Optional | Optional internal memo not visible to the user. | String getMemo() | setMemo(String memo) |
| `DestinationAmount` | `Double` | Optional | Amount transferred to the destination | Double getDestinationAmount() | setDestinationAmount(Double destinationAmount) |
| `DestinationCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getDestinationCurrency() | setDestinationCurrency(CurrencyTypesEnum destinationCurrency) |
| `ClientTransferId` | `String` | Optional | Unique value provided by the client for the transfer. | String getClientTransferId() | setClientTransferId(String clientTransferId) |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |
| `SourceAmount` | `Double` | Optional | Amount of the transfer in the specified currency. | Double getSourceAmount() | setSourceAmount(Double sourceAmount) |
| `SourceCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getSourceCurrency() | setSourceCurrency(CurrencyTypesEnum sourceCurrency) |
| `Status` | [`TransferStatusTypesEnum`](../../doc/models/transfer-status-types-enum.md) | Optional | Current status of a transfer | TransferStatusTypesEnum getStatus() | setStatus(TransferStatusTypesEnum status) |
| `Fx` | [`FxObject`](../../doc/models/fx-object.md) | Optional | Currency conversion object details | FxObject getFx() | setFx(FxObject fx) |

## Example (as JSON)

```json
{
  "sourceToken": null,
  "destinationToken": null,
  "notes": null,
  "memo": null,
  "destinationAmount": null,
  "destinationCurrency": null,
  "clientTransferId": null,
  "token": null,
  "sourceAmount": null,
  "sourceCurrency": null,
  "status": null,
  "fx": null
}
```

