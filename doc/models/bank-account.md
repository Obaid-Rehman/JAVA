
# Bank Account

Unique identifier for the bank account

## Structure

`BankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |
| `Status` | [`BankAccountStatusTypesEnum`](../../doc/models/bank-account-status-types-enum.md) | Optional | Current verification status type of the bank account | BankAccountStatusTypesEnum getStatus() | setStatus(BankAccountStatusTypesEnum status) |
| `CreatedOn` | `LocalDateTime` | Optional | Time at which the object was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `BankAccountOwnershipType` | [`BankAccountOwnershipTypesEnum`](../../doc/models/bank-account-ownership-types-enum.md) | Optional | Account ownership types | BankAccountOwnershipTypesEnum getBankAccountOwnershipType() | setBankAccountOwnershipType(BankAccountOwnershipTypesEnum bankAccountOwnershipType) |
| `Type` | [`BankAccountTypesEnum`](../../doc/models/bank-account-types-enum.md) | Optional | Financial purpose of the bank account (<i>Savings</i>, <i>Investment</i>) | BankAccountTypesEnum getType() | setType(BankAccountTypesEnum type) |
| `Fields` | [`List<KeyValuePairBankFieldTypesString>`](../../doc/models/key-value-pair-bank-field-types-string.md) | Optional | - | List<KeyValuePairBankFieldTypesString> getFields() | setFields(List<KeyValuePairBankFieldTypesString> fields) |
| `BankCurrency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getBankCurrency() | setBankCurrency(CurrencyTypesEnum bankCurrency) |
| `BankCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getBankCountry() | setBankCountry(CountryTypesEnum bankCountry) |
| `Description` | `String` | Optional | User-supplied description of the bank account for reference | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "token": null,
  "status": null,
  "createdOn": null,
  "bankAccountOwnershipType": null,
  "type": null,
  "fields": null,
  "bankCurrency": null,
  "bankCountry": null,
  "description": null
}
```

