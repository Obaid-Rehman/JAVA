
# Fx Object

Currency conversion object details

## Structure

`FxObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DestinationAmount` | `Double` | Optional | Amount transferred to the destination | Double getDestinationAmount() | setDestinationAmount(Double destinationAmount) |
| `DestinationCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getDestinationCurrency() | setDestinationCurrency(CurrencyTypesEnum destinationCurrency) |
| `SourceAmount` | `Double` | Optional | Amount of the transfer in the specified currency. | Double getSourceAmount() | setSourceAmount(Double sourceAmount) |
| `SourceCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getSourceCurrency() | setSourceCurrency(CurrencyTypesEnum sourceCurrency) |
| `Rate` | `Double` | Optional | Exchange rate<br>**Constraints**: `>= 0`, `<= 1` | Double getRate() | setRate(Double rate) |

## Example (as JSON)

```json
{
  "destinationAmount": null,
  "destinationCurrency": null,
  "sourceAmount": null,
  "sourceCurrency": null,
  "rate": null
}
```

