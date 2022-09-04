
# Prepaid Card Pin Token

## Structure

`PrepaidCardPinToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPinToken` | `String` | Optional | Token used as part of a two-leg card PIN reveal request sent directly from the client that generally involves a second piece of data, such as the CVV code on the back of the card. | String getCardPinToken() | setCardPinToken(String cardPinToken) |
| `Url` | `String` | Optional | Full path of the URI to perform the request action against a prepaid card that replaces the need to build the URL with query params | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "cardPinToken": null,
  "url": null
}
```

