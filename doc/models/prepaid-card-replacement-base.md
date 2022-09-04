
# Prepaid Card Replacement Base

## Structure

`PrepaidCardReplacementBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPackage` | `String` | Optional | Package for the card being displayed (<i>Virtual<,i>) or <i>Produced (physical)</i> | String getCardPackage() | setCardPackage(String cardPackage) |
| `ProgramToken` | `String` | Required | Token representing a program<br>**Constraints**: *Pattern*: `'^prog-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$'` | String getProgramToken() | setProgramToken(String programToken) |
| `CardReplacementReason` | [`PrepaidCardReplacementReasonTypesEnum`](../../doc/models/prepaid-card-replacement-reason-types-enum.md) | Optional | Reason for card replacement. In certain programs, the replacement reason code impacts replacement cost and responsibility. | PrepaidCardReplacementReasonTypesEnum getCardReplacementReason() | setCardReplacementReason(PrepaidCardReplacementReasonTypesEnum cardReplacementReason) |

## Example (as JSON)

```json
{
  "cardPackage": null,
  "programToken": "programToken2",
  "cardReplacementReason": null
}
```

