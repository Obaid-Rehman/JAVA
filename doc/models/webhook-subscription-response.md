
# Webhook Subscription Response

Webhook Subscription response

## Structure

`WebhookSubscriptionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Links` | [`List<HaetosParams>`](../../doc/models/haetos-params.md) | Optional | - | List<HaetosParams> getLinks() | setLinks(List<HaetosParams> links) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `Namespace` | [`NamespaceEnum`](../../doc/models/namespace-enum.md) | Optional | Namespace used to identify and refer to the object | NamespaceEnum getNamespace() | setNamespace(NamespaceEnum namespace) |
| `Token` | `String` | Optional | Token for the webhook subscription | String getToken() | setToken(String token) |
| `Created` | `String` | Optional | Time stamp for the date the webhook subscription was created | String getCreated() | setCreated(String created) |
| `LastUpdated` | `String` | Optional | Time stamp for the date the webhook subscription was updated | String getLastUpdated() | setLastUpdated(String lastUpdated) |

## Example (as JSON)

```json
{
  "links": null,
  "url": null,
  "namespace": null,
  "token": null,
  "created": null,
  "lastUpdated": null
}
```

