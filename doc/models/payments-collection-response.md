
# Payments Collection Response

Response from a Payment collection request

## Structure

`PaymentsCollectionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payload` | [`List<PaymentResponse>`](../../doc/models/payment-response.md) | Optional | - | List<PaymentResponse> getPayload() | setPayload(List<PaymentResponse> payload) |
| `Links` | [`List<HaetosParams>`](../../doc/models/haetos-params.md) | Optional | - | List<HaetosParams> getLinks() | setLinks(List<HaetosParams> links) |

## Example (as JSON)

```json
{
  "payload": null,
  "links": null
}
```

