
# Monetary Formatted

Object representing monies, including currency, decimal, and formatted amounts

## Structure

`MonetaryFormatted`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FormattedAmount` | `String` | Optional | Formatted monetary amount | String getFormattedAmount() | setFormattedAmount(String formattedAmount) |
| `Amount` | `double` | Required | Amount of the transfer in the specified currency. | double getAmount() | setAmount(double amount) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Required | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |

## Example (as JSON)

```json
{
  "amount": 5,
  "currency": null
}
```

