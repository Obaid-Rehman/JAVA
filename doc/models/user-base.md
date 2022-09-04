
# User Base

Object for the established group of users

## Structure

`UserBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | User's first name. <i>Required</i> if the user is registered as an individual. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | User's last name. <i>Required</i> if the user is registered as an individual. | String getLastName() | setLastName(String lastName) |
| `DateOfBirth` | `LocalDate` | Optional | User's date of birth | LocalDate getDateOfBirth() | setDateOfBirth(LocalDate dateOfBirth) |
| `BusinessName` | `String` | Optional | Legal name for the business | String getBusinessName() | setBusinessName(String businessName) |
| `BusinessOperatingName` | `String` | Optional | Name under which the business operates | String getBusinessOperatingName() | setBusinessOperatingName(String businessOperatingName) |
| `BusinessRegistrationId` | `String` | Optional | Registration number or ID assigned by a government body | String getBusinessRegistrationId() | setBusinessRegistrationId(String businessRegistrationId) |
| `BusinessRegistrationRegion` | `String` | Optional | State, province, or territory where the business is registered | String getBusinessRegistrationRegion() | setBusinessRegistrationRegion(String businessRegistrationRegion) |
| `BusinessRegistrationCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getBusinessRegistrationCountry() | setBusinessRegistrationCountry(CountryTypesEnum businessRegistrationCountry) |
| `BusinessContactRole` | [`BusinessContactRoleEnum`](../../doc/models/business-contact-role-enum.md) | Optional | Role of the user within the business | BusinessContactRoleEnum getBusinessContactRole() | setBusinessContactRole(BusinessContactRoleEnum businessContactRole) |
| `BusinessAddressLine1` | `String` | Optional | First line of the business address that specifies street number, street name, and building name | String getBusinessAddressLine1() | setBusinessAddressLine1(String businessAddressLine1) |
| `BusinessAddressLine2` | `String` | Optional | Second line of the business address that specifies the apartment, suite, or space number (or any other designation not literally part of the physical address) | String getBusinessAddressLine2() | setBusinessAddressLine2(String businessAddressLine2) |
| `BusinessAddressLine3` | `String` | Optional | Third line of the business address that specifies the international or business addresses that do not fit on businessAddressLine3 | String getBusinessAddressLine3() | setBusinessAddressLine3(String businessAddressLine3) |
| `BusinessAddressLine4` | `String` | Optional | fourth line of the business address street address | String getBusinessAddressLine4() | setBusinessAddressLine4(String businessAddressLine4) |
| `BusinessAddressLine5` | `String` | Optional | Fifth line of the business address street address | String getBusinessAddressLine5() | setBusinessAddressLine5(String businessAddressLine5) |
| `BusinessCity` | `String` | Optional | City the business is registered | String getBusinessCity() | setBusinessCity(String businessCity) |
| `BusinessRegion` | `String` | Optional | State, province, or region the business is registered | String getBusinessRegion() | setBusinessRegion(String businessRegion) |
| `BusinessCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getBusinessCountry() | setBusinessCountry(CountryTypesEnum businessCountry) |
| `BusinessPostalCode` | `String` | Optional | Postal code for the business address | String getBusinessPostalCode() | setBusinessPostalCode(String businessPostalCode) |
| `BusinessPremiseNumber` | `String` | Optional | House number for the business address | String getBusinessPremiseNumber() | setBusinessPremiseNumber(String businessPremiseNumber) |
| `BusinessType` | [`BusinessTypesEnum`](../../doc/models/business-types-enum.md) | Optional | Type of business (<i>Corporation</i> or <i>Partnership</i>) | BusinessTypesEnum getBusinessType() | setBusinessType(BusinessTypesEnum businessType) |
| `DriverLicenseId` | `String` | Optional | User's driver's license number | String getDriverLicenseId() | setDriverLicenseId(String driverLicenseId) |
| `PassportId` | `String` | Optional | User's passport number | String getPassportId() | setPassportId(String passportId) |
| `GovernmentIdType` | [`GovernmentIdTypeEnum`](../../doc/models/government-id-type-enum.md) | Optional | User's government ID type | GovernmentIdTypeEnum getGovernmentIdType() | setGovernmentIdType(GovernmentIdTypeEnum governmentIdType) |
| `GovernmentId` | `String` | Optional | User's government ID number, such as a <i>SSN</i>, <i>EIN</i>, or <i>SIN</i> | String getGovernmentId() | setGovernmentId(String governmentId) |
| `PhoneNumber` | `String` | Required | The E.164 formatted primary phone number. This can be the same as the mobile number. | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `MobileNumber` | `String` | Required | The E.164 formatted mobile phone number, required by most financial institutions for account creation, verification, or PSD2 (3DS). Mobile numbers must be unique to a user within a tenant and cannot be shared. | String getMobileNumber() | setMobileNumber(String mobileNumber) |
| `PhoneNumberCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Required | Two-digit country code types | CountryTypesEnum getPhoneNumberCountry() | setPhoneNumberCountry(CountryTypesEnum phoneNumberCountry) |
| `MobileNumberCountry` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Required | Two-digit country code types | CountryTypesEnum getMobileNumberCountry() | setMobileNumberCountry(CountryTypesEnum mobileNumberCountry) |
| `AddressLine1` | `String` | Optional | First line of the address that specifies street number, street name, and building name | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | Second line of the address that specifies the apartment, suite, or space number (or any other designation not literally part of the physical address) | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | Third line of the address that specifies the international or business addresses that do not fit on addressLine2 | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `AddressLine4` | `String` | Optional | Fourth line of the address, if any | String getAddressLine4() | setAddressLine4(String addressLine4) |
| `AddressLine5` | `String` | Optional | Fifth line of the address, if any | String getAddressLine5() | setAddressLine5(String addressLine5) |
| `City` | `String` | Optional | City or town of the business address | String getCity() | setCity(String city) |
| `Region` | `String` | Optional | State, province, or territory of the business address | String getRegion() | setRegion(String region) |
| `Country` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getCountry() | setCountry(CountryTypesEnum country) |
| `PostalCode` | `String` | Optional | Series of letters, digits, or both, included in a postal address for the purpose of sorting mail | String getPostalCode() | setPostalCode(String postalCode) |
| `PremiseNumber` | `String` | Optional | House or building number of the business address | String getPremiseNumber() | setPremiseNumber(String premiseNumber) |
| `AddressType` | [`AddressTypesEnum`](../../doc/models/address-types-enum.md) | Optional | Classifies the address type (<i>Home</i>, <i>Business</i>, <i>Billing</i>, <i>Shipping</i>) | AddressTypesEnum getAddressType() | setAddressType(AddressTypesEnum addressType) |
| `Email` | `String` | Optional | Email address for the user account<br>**Constraints**: *Maximum Length*: `150` | String getEmail() | setEmail(String email) |
| `EmployerId` | `String` | Optional | User's employer identifier | String getEmployerId() | setEmployerId(String employerId) |
| `Gender` | [`GenderTypesEnum`](../../doc/models/gender-types-enum.md) | Optional | Gender as a user identifies | GenderTypesEnum getGender() | setGender(GenderTypesEnum gender) |
| `UserType` | [`UserTypesEnum`](../../doc/models/user-types-enum.md) | Optional | Account holder's profile type | UserTypesEnum getUserType() | setUserType(UserTypesEnum userType) |
| `ProgramUserId` | `String` | Optional | Program identifier for the user | String getProgramUserId() | setProgramUserId(String programUserId) |
| `Language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Optional | Language type in IETF's BCP 47 format | LanguageTypesEnum getLanguage() | setLanguage(LanguageTypesEnum language) |
| `CountryOfBirth` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getCountryOfBirth() | setCountryOfBirth(CountryTypesEnum countryOfBirth) |
| `CountryOfNationality` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Optional | Two-digit country code types | CountryTypesEnum getCountryOfNationality() | setCountryOfNationality(CountryTypesEnum countryOfNationality) |
| `Occupation` | [`OccupationTypesEnum`](../../doc/models/occupation-types-enum.md) | Optional | Type of occupation for the user | OccupationTypesEnum getOccupation() | setOccupation(OccupationTypesEnum occupation) |
| `TaxResidentStatus` | [`TaxResidentStatusTypesEnum`](../../doc/models/tax-resident-status-types-enum.md) | Optional | Tax resident status type of a country | TaxResidentStatusTypesEnum getTaxResidentStatus() | setTaxResidentStatus(TaxResidentStatusTypesEnum taxResidentStatus) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |

## Example (as JSON)

```json
{
  "firstName": null,
  "lastName": null,
  "dateOfBirth": null,
  "businessName": null,
  "businessOperatingName": null,
  "businessRegistrationId": null,
  "businessRegistrationRegion": null,
  "businessRegistrationCountry": null,
  "businessContactRole": null,
  "businessAddressLine1": null,
  "businessAddressLine2": null,
  "businessAddressLine3": null,
  "businessAddressLine4": null,
  "businessAddressLine5": null,
  "businessCity": null,
  "businessRegion": null,
  "businessCountry": null,
  "businessPostalCode": null,
  "businessPremiseNumber": null,
  "businessType": null,
  "driverLicenseId": null,
  "passportId": null,
  "governmentIdType": null,
  "governmentId": null,
  "phoneNumber": "phoneNumber0",
  "mobileNumber": "mobileNumber8",
  "phoneNumberCountry": "UM",
  "mobileNumberCountry": "TC",
  "addressLine1": null,
  "addressLine2": null,
  "addressLine3": null,
  "addressLine4": null,
  "addressLine5": null,
  "city": null,
  "region": null,
  "country": null,
  "postalCode": null,
  "premiseNumber": null,
  "addressType": null,
  "email": null,
  "employerId": null,
  "gender": null,
  "userType": null,
  "programUserId": null,
  "language": null,
  "countryOfBirth": null,
  "countryOfNationality": null,
  "occupation": null,
  "taxResidentStatus": null,
  "currency": null
}
```

