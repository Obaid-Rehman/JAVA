
# Payment Purpose

Purpose for the payment being made.

## Structure

`PaymentPurpose`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Purpose` | [`PaymentPurposeTypesEnum`](../../doc/models/payment-purpose-types-enum.md) | Optional | Used to identify the purpose of a payment and impacts reporting and calculated taxable earnings (if utilizing tax services) | PaymentPurposeTypesEnum getPurpose() | setPurpose(PaymentPurposeTypesEnum purpose) |

## Example (as JSON)

```json
{
  "purpose": null
}
```

