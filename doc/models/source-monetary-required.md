
# Source Monetary Required

Required details of the monetary source.

## Structure

`SourceMonetaryRequired`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceAmount` | `Double` | Optional | Amount of the transfer in the specified currency. | Double getSourceAmount() | setSourceAmount(Double sourceAmount) |
| `SourceCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getSourceCurrency() | setSourceCurrency(CurrencyTypesEnum sourceCurrency) |

## Example (as JSON)

```json
{
  "sourceAmount": null,
  "sourceCurrency": null
}
```

