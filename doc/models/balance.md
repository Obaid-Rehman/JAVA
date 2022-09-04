
# Balance

Account monetary balance

## Structure

`Balance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FormattedAmount` | `String` | Optional | Formatted monetary amount | String getFormattedAmount() | setFormattedAmount(String formattedAmount) |
| `Amount` | `double` | Required | Amount of the transfer in the specified currency. | double getAmount() | setAmount(double amount) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Required | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |

## Example (as JSON)

```json
{
  "amount": 5,
  "currency": null
}
```

