
# Not Before or After

## Structure

`NotBeforeOrAfter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NotBefore` | `LocalDateTime` | Optional | Transfer is scheduled and will not process before this time. | LocalDateTime getNotBefore() | setNotBefore(LocalDateTime notBefore) |
| `NotAfter` | `LocalDateTime` | Optional | Transfer expires if not completed prior to this time. | LocalDateTime getNotAfter() | setNotAfter(LocalDateTime notAfter) |

## Example (as JSON)

```json
{
  "notBefore": null,
  "notAfter": null
}
```

