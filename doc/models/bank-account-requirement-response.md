
# Bank Account Requirement Response

## Structure

`BankAccountRequirementResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Required | Two-digit country code types | CountryTypesEnum getBankCountry() | setBankCountry(CountryTypesEnum bankCountry) |
| `BankCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Required | Currency code type for the object | CurrencyTypesEnum getBankCurrency() | setBankCurrency(CurrencyTypesEnum bankCurrency) |
| `SourceCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getSourceCountry() | setSourceCountry(CountryTypesEnum sourceCountry) |
| `SourceCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getSourceCurrency() | setSourceCurrency(CurrencyTypesEnum sourceCurrency) |
| `Requirements` | [`List<BankAccountRequiredFields>`](../../doc/models/bank-account-required-fields.md) | Optional | - | List<BankAccountRequiredFields> getRequirements() | setRequirements(List<BankAccountRequiredFields> requirements) |
| `Quote` | [`MonetaryFormatted`](../../doc/models/monetary-formatted.md) | Optional | Object representing monies, including currency, decimal, and formatted amounts | MonetaryFormatted getQuote() | setQuote(MonetaryFormatted quote) |
| `Links` | [`List<HaetosParams>`](../../doc/models/haetos-params.md) | Optional | - | List<HaetosParams> getLinks() | setLinks(List<HaetosParams> links) |

## Example (as JSON)

```json
{
  "bankCountry": "WS",
  "bankCurrency": "EUR",
  "sourceCountry": null,
  "sourceCurrency": null,
  "requirements": null,
  "quote": null,
  "links": null
}
```

