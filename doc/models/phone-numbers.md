
# Phone Numbers

## Structure

`PhoneNumbers`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PhoneNumber` | `String` | Required | The E.164 formatted primary phone number. This can be the same as the mobile number. | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `MobileNumber` | `String` | Required | The E.164 formatted mobile phone number, required by most financial institutions for account creation, verification, or PSD2 (3DS). Mobile numbers must be unique to a user within a tenant and cannot be shared. | String getMobileNumber() | setMobileNumber(String mobileNumber) |
| `PhoneNumberCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Required | Two-digit country code types | CountryTypesEnum getPhoneNumberCountry() | setPhoneNumberCountry(CountryTypesEnum phoneNumberCountry) |
| `MobileNumberCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Required | Two-digit country code types | CountryTypesEnum getMobileNumberCountry() | setMobileNumberCountry(CountryTypesEnum mobileNumberCountry) |

## Example (as JSON)

```json
{
  "phoneNumber": "phoneNumber0",
  "mobileNumber": "mobileNumber8",
  "phoneNumberCountry": "UM",
  "mobileNumberCountry": "TC"
}
```

