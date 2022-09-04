
# Transfer Base

Base class for the transfer

## Structure

`TransferBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceToken` | `String` | Optional | Unique identifier representing the source of funds. | String getSourceToken() | setSourceToken(String sourceToken) |
| `DestinationToken` | `String` | Optional | Unique identifier representing the destination of funds. | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `Notes` | `String` | Optional | Optional comments visible to the user. | String getNotes() | setNotes(String notes) |
| `Memo` | `String` | Optional | Optional internal memo not visible to the user. | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "sourceToken": null,
  "destinationToken": null,
  "notes": null,
  "memo": null
}
```

