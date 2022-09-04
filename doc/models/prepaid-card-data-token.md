
# Prepaid Card Data Token

Token assigned to the prepaid card

## Structure

`PrepaidCardDataToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getToken() | setToken(String token) |
| `Url` | `String` | Optional | Full path of the URI to perform the request action against a prepaid card that replaces the need to build the URL with query params | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "token": "token6",
  "url": null
}
```

