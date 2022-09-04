
# Prepaid Card Base Ext

Base extension for the prepaid card

## Structure

`PrepaidCardBaseExt`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | Current status of the prepaid card | StatusEnum getStatus() | setStatus(StatusEnum status) |

## Example (as JSON)

```json
{
  "token": null,
  "status": null
}
```

