
# User Kyc Information

## Structure

`UserKycInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DriverLicenseId` | `String` | Optional | User's driver's license number | String getDriverLicenseId() | setDriverLicenseId(String driverLicenseId) |
| `PassportId` | `String` | Optional | User's passport number | String getPassportId() | setPassportId(String passportId) |
| `GovernmentIdType` | [`GovernmentIdTypeEnum`](../../doc/models/government-id-type-enum.md) | Optional | User's government ID type | GovernmentIdTypeEnum getGovernmentIdType() | setGovernmentIdType(GovernmentIdTypeEnum governmentIdType) |
| `GovernmentId` | `String` | Optional | User's government ID number, such as a <i>SSN</i>, <i>EIN</i>, or <i>SIN</i> | String getGovernmentId() | setGovernmentId(String governmentId) |

## Example (as JSON)

```json
{
  "driverLicenseId": null,
  "passportId": null,
  "governmentIdType": null,
  "governmentId": null
}
```

