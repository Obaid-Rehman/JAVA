
# Expiration

Date and time the object will expire

## Structure

`Expiration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Expires` | `LocalDateTime` | Optional | Quote expiration, ISO-8601 format, UTC by default unless overridden. | LocalDateTime getExpires() | setExpires(LocalDateTime expires) |

## Example (as JSON)

```json
{
  "expires": null
}
```

