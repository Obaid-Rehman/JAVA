
# Prepaid Card Base

Base class applied to the prepaid card

## Structure

`PrepaidCardBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPackage` | `String` | Optional | Package for the card being displayed (<i>Virtual<,i>) or <i>Produced (physical)</i> | String getCardPackage() | setCardPackage(String cardPackage) |
| `ProgramToken` | `String` | Required | Token representing a program<br>**Constraints**: *Pattern*: `'^prog-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$'` | String getProgramToken() | setProgramToken(String programToken) |

## Example (as JSON)

```json
{
  "cardPackage": null,
  "programToken": "programToken2"
}
```

