
# Prepaid Card Response

## Structure

`PrepaidCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | Current status of the prepaid card | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `CreatedOn` | `LocalDateTime` | Optional | Time at which the object was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Country` | [`CountryTypesEnum`](../../doc/models/country-types-enum.md) | Required | Two-digit country code types | CountryTypesEnum getCountry() | setCountry(CountryTypesEnum country) |
| `Currency` | [`CurrencyTypesEnum`](../../doc/models/currency-types-enum.md) | Optional | Currency code type for the object | CurrencyTypesEnum getCurrency() | setCurrency(CurrencyTypesEnum currency) |
| `CardPersonalization` | [`PrepaidCardPersonalizationTypesEnum`](../../doc/models/prepaid-card-personalization-types-enum.md) | Optional | Specifies a card is <i>Personalized</i> or <i>Non-personalized</i> (i.e., issued to Preferred Customer) | PrepaidCardPersonalizationTypesEnum getCardPersonalization() | setCardPersonalization(PrepaidCardPersonalizationTypesEnum cardPersonalization) |
| `CardPackage` | `String` | Optional | Package for the card being displayed (<i>Virtual<,i>) or <i>Produced (physical)</i> | String getCardPackage() | setCardPackage(String cardPackage) |
| `CardNetwork` | [`CardNetworkTypesEnum`](../../doc/models/card-network-types-enum.md) | Optional | Major credit card network types | CardNetworkTypesEnum getCardNetwork() | setCardNetwork(CardNetworkTypesEnum cardNetwork) |
| `Expires` | `LocalDateTime` | Optional | Quote expiration, ISO-8601 format, UTC by default unless overridden. | LocalDateTime getExpires() | setExpires(LocalDateTime expires) |
| `CardNumber` | `String` | Optional | Masked card number with only the first 6 and last 4 digits visible<br>**Constraints**: *Minimum Length*: `19`, *Maximum Length*: `19`, *Pattern*: `^\d{4} \d{2}\*{2} \*{4} \d{4}$` | String getCardNumber() | setCardNumber(String cardNumber) |
| `Cvv` | `String` | Optional | Card Verification Value (CVV) on the credit card or debit card. (3-digit number on VISA®, MasterCard® branded credit and debit cards) | String getCvv() | setCvv(String cvv) |
| `Links` | [`List<HaetosParams>`](../../doc/models/haetos-params.md) | Optional | - | List<HaetosParams> getLinks() | setLinks(List<HaetosParams> links) |

## Example (as JSON)

```json
{
  "token": null,
  "status": null,
  "createdOn": null,
  "country": "FO",
  "currency": null,
  "cardPersonalization": null,
  "cardPackage": null,
  "cardNetwork": null,
  "expires": null,
  "cardNumber": null,
  "cvv": null,
  "links": null
}
```

