
# Paper Check

Details of the paper check

## Structure

`PaperCheck`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |
| `CreatedOn` | `LocalDateTime` | Optional | Time at which the object was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Type` | [`TransferTypesEnum`](../../doc/models/transfer-types-enum.md) | Optional | Transfer type | TransferTypesEnum getType() | setType(TransferTypesEnum type) |
| `Amount` | `double` | Required | Amount of the transfer in the specified currency. | double getAmount() | setAmount(double amount) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Required | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |
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
| `BankAccountOwnershipType` | [`BankAccountOwnershipTypesEnum`](../../doc/models/bank-account-ownership-types-enum.md) | Optional | Account ownership types | BankAccountOwnershipTypesEnum getBankAccountOwnershipType() | setBankAccountOwnershipType(BankAccountOwnershipTypesEnum bankAccountOwnershipType) |
| `ShippingMethod` | [`ShippingMethodTypesEnum`](../../doc/models/shipping-method-types-enum.md) | Optional | Shipping method type for a pre-paid card or paper check | ShippingMethodTypesEnum getShippingMethod() | setShippingMethod(ShippingMethodTypesEnum shippingMethod) |

## Example (as JSON)

```json
{
  "amount": 5,
  "currency": null
}
```

