
# Haetos Params

Hypermedia as the Engine of Application State (HAETOS) parameters used in a query.

## Structure

`HaetosParams`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Params` | [`HaetosRelationship`](../../doc/models/haetos-relationship.md) | Required | Indicates the HATEOS relationship between the target and current resources. | HaetosRelationship getParams() | setParams(HaetosRelationship params) |
| `Href` | `String` | Required | URL for resource described by the relationship. | String getHref() | setHref(String href) |

## Example (as JSON)

```json
{
  "params": {
    "rel": "self"
  },
  "href": null
}
```

