
# Bank Account Required Fields

Classifies the required account field objects

## Structure

`BankAccountRequiredFields`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Format` | [`BankAccountRequirementFormat`](../../doc/models/bank-account-requirement-format.md) | Optional | Classifies the format of the required information for a bank account | BankAccountRequirementFormat getFormat() | setFormat(BankAccountRequirementFormat format) |
| `Requirement` | [`BankAccountFieldTypesEnum`](../../doc/models/bank-account-field-types-enum.md) | Optional | Classifies account field types | BankAccountFieldTypesEnum getRequirement() | setRequirement(BankAccountFieldTypesEnum requirement) |
| `Description` | [`List<KeyValuePairLanguageTypeString>`](../../doc/models/key-value-pair-language-type-string.md) | Optional | Localized requirement description for display purposes | List<KeyValuePairLanguageTypeString> getDescription() | setDescription(List<KeyValuePairLanguageTypeString> description) |
| `Validators` | [`List<BankAccountRequirementValidator>`](../../doc/models/bank-account-requirement-validator.md) | Optional | - | List<BankAccountRequirementValidator> getValidators() | setValidators(List<BankAccountRequirementValidator> validators) |

## Example (as JSON)

```json
{
  "format": null,
  "requirement": null,
  "description": null,
  "validators": null
}
```

