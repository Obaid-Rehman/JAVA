
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
PQAPIV2Client client = new PQAPIV2Client.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.PRODUCTION)
    .build();
```

## PQ API v2Client Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getPaymentsController()` | Provides access to Payments controller. | `PaymentsController` |
| `getTransfersController()` | Provides access to Transfers controller. | `TransfersController` |
| `getSpendBackController()` | Provides access to SpendBack controller. | `SpendBackController` |
| `getPrepaidCardsController()` | Provides access to PrepaidCards controller. | `PrepaidCardsController` |
| `getPaperChecksController()` | Provides access to PaperChecks controller. | `PaperChecksController` |
| `getBankAccountsController()` | Provides access to BankAccounts controller. | `BankAccountsController` |
| `getBalancesController()` | Provides access to Balances controller. | `BalancesController` |
| `getReceiptsController()` | Provides access to Receipts controller. | `ReceiptsController` |
| `getUsersController()` | Provides access to Users controller. | `UsersController` |
| `getDocumentsController()` | Provides access to Documents controller. | `DocumentsController` |
| `getWebhooksController()` | Provides access to Webhooks controller. | `WebhooksController` |
| `getProgramController()` | Provides access to Program controller. | `ProgramController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

