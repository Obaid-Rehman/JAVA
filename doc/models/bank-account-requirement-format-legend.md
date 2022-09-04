
# Bank Account Requirement Format Legend

Classifies the legend format of the required information for a bank account

## Structure

`BankAccountRequirementFormatLegend`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Optional | - | String getKey() | setKey(String key) |
| `Descriptions` | [`List<KeyValuePairLanguageTypeString>`](../../doc/models/key-value-pair-language-type-string.md) | Optional | Localized requirement description for display purposes | List<KeyValuePairLanguageTypeString> getDescriptions() | setDescriptions(List<KeyValuePairLanguageTypeString> descriptions) |

## Example (as JSON)

```json
{
  "key": null,
  "descriptions": null
}
```

