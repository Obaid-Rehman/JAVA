
# Identity Verification Base

## Structure

`IdentityVerificationBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IdvProviderReference` | `String` | Optional | IDV provider unique ID for the IDV check performed | String getIdvProviderReference() | setIdvProviderReference(String idvProviderReference) |
| `IdvResult` | [`IdentityVerificationResultTypesEnum`](../../doc/models/identity-verification-result-types-enum.md) | Optional | In combination with the <i>Disposition</i> type, the <i>Result</i> type provides the results of an IDV check. A <i>Dispositioned</i> result of <i>FINAL PASS</i> represents a passing check, whereas a <i>TRANSIENT FAIL</i> is still being processed but has failed at least one phase of the check. Until the disposition is <i>FINAL</i>, a result has not been determined. | IdentityVerificationResultTypesEnum getIdvResult() | setIdvResult(IdentityVerificationResultTypesEnum idvResult) |
| `IdvSubResult` | [`IdentityVerificationResultSubTypesEnum`](../../doc/models/identity-verification-result-sub-types-enum.md) | Optional | If used by a provider, sub-results that give additional insight into the results, including whether they result was <i>Soft</i> or <i>Hard</i>. <i>Soft</i> results may have additional recourse that can be leveraged to validate a user’s identity. | IdentityVerificationResultSubTypesEnum getIdvSubResult() | setIdvSubResult(IdentityVerificationResultSubTypesEnum idvSubResult) |
| `IdvProvider` | [`IdentityVerificationProviderTypesEnum`](../../doc/models/identity-verification-provider-types-enum.md) | Optional | Provider types of verification that can be used for performing identity checks | IdentityVerificationProviderTypesEnum getIdvProvider() | setIdvProvider(IdentityVerificationProviderTypesEnum idvProvider) |
| `CreatedOn` | `LocalDateTime` | Optional | Time at which the object was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Raw` | `String` | Optional | Contains the raw (unprocessed) output from the IDV provider. Format of the raw output can vary widely and is not documented. *For reference/debugging only | String getRaw() | setRaw(String raw) |
| `IdvCheckType` | [`IdentityVerificationCheckTypesEnum`](../../doc/models/identity-verification-check-types-enum.md) | Optional | Types of verification used for performing identity checks (<i>documentary</i>, <i>non-documentary</i>, <i>OFAC</i>, etc.) | IdentityVerificationCheckTypesEnum getIdvCheckType() | setIdvCheckType(IdentityVerificationCheckTypesEnum idvCheckType) |
| `IdvDispostion` | [`IdentityVerificationDispositionTypesEnum`](../../doc/models/identity-verification-disposition-types-enum.md) | Optional | In combination with the <i>Disposition</i> type, the <i>Result</i> type provides the results of an IDV check. A <i>Dispositioned</i> result of <i>FINAL PASS</i> represents a passing check, whereas a <i>TRANSIENT FAIL</i> is still being processed but has failed at least one phase of the check. Until the disposition is <i>FINAL</i>, a result has not been determined. | IdentityVerificationDispositionTypesEnum getIdvDispostion() | setIdvDispostion(IdentityVerificationDispositionTypesEnum idvDispostion) |
| `Token` | `String` | Optional | Token representing the resource, prefixed with <i>user-</i>, <i>dest-</i>, <i>xfer-</i>, <i>acct-</i>, <i>pmnt-</i>, or <i>docu-</i>. | String getToken() | setToken(String token) |

## Example (as JSON)

```json
{
  "idvProviderReference": null,
  "idvResult": null,
  "idvSubResult": null,
  "idvProvider": null,
  "createdOn": null,
  "raw": null,
  "idvCheckType": null,
  "idvDispostion": null,
  "token": null
}
```

