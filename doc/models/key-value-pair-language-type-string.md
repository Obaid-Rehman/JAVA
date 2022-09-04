
# Key Value Pair Language Type String

Localized requirement description for display purposes

## Structure

`KeyValuePairLanguageTypeString`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Optional | Language type in IETF's BCP 47 format | LanguageTypesEnum getLanguage() | setLanguage(LanguageTypesEnum language) |
| `Translation` | `String` | Optional | Translated string in the specified language | String getTranslation() | setTranslation(String translation) |

## Example (as JSON)

```json
{
  "language": null,
  "translation": null
}
```

