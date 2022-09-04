
# Business Address

Address of the business location

## Structure

`BusinessAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
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

## Example (as JSON)

```json
{
  "businessAddressLine1": null,
  "businessAddressLine2": null,
  "businessAddressLine3": null,
  "businessAddressLine4": null,
  "businessAddressLine5": null,
  "businessCity": null,
  "businessRegion": null,
  "businessCountry": null,
  "businessPostalCode": null,
  "businessPremiseNumber": null
}
```

