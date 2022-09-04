
# Bank Account Requirement Format

Classifies the format of the required information for a bank account

## Structure

`BankAccountRequirementFormat`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Example` | `String` | Optional | Example of a requirement generated from the validator(s) | String getExample() | setExample(String example) |
| `Legend` | [`List<BankAccountRequirementFormatLegend>`](../../doc/models/bank-account-requirement-format-legend.md) | Optional | - | List<BankAccountRequirementFormatLegend> getLegend() | setLegend(List<BankAccountRequirementFormatLegend> legend) |

## Example (as JSON)

```json
{
  "example": null,
  "legend": null
}
```

