
# Bank Account Requirement Validator

Specifies the validator type for the required bank account information

## Structure

`BankAccountRequirementValidator`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ValidatorType` | [`ValidatorTypesEnum`](../../doc/models/validator-types-enum.md) | Optional | - | ValidatorTypesEnum getValidatorType() | setValidatorType(ValidatorTypesEnum validatorType) |
| `Expression` | `String` | Required | Validation regular expression | String getExpression() | setExpression(String expression) |

## Example (as JSON)

```json
{
  "validatorType": null,
  "expression": "expression2"
}
```

