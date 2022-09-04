
# Key Value Pair Bank Field Types String

1...N required fields as determined by call to get requirements

## Structure

`KeyValuePairBankFieldTypesString`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | [`BankAccountFieldTypesEnum`](../../doc/models/bank-account-field-types-enum.md) | Required | Classifies account field types | BankAccountFieldTypesEnum getKey() | setKey(BankAccountFieldTypesEnum key) |
| `Value` | `String` | Required | - | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "BANK_NON_SWIFT_BIC",
  "value": "value2"
}
```

