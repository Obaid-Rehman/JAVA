
# Getting Started with PQ API v2

## Introduction

desc

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.payquicker</groupId>
  <artifactId>sample-sdk-artifact-id</artifactId>
  <version>1.0.0</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/com.payquicker/sample-sdk-artifact-id/1.0.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project PQAPIV2Lib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

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

## List of APIs

* [Payments](doc/controllers/payments.md)
* [Transfers](doc/controllers/transfers.md)
* [Spend Back](doc/controllers/spend-back.md)
* [Prepaid Cards](doc/controllers/prepaid-cards.md)
* [Paper Checks](doc/controllers/paper-checks.md)
* [Bank Accounts](doc/controllers/bank-accounts.md)
* [Balances](doc/controllers/balances.md)
* [Receipts](doc/controllers/receipts.md)
* [Users](doc/controllers/users.md)
* [Documents](doc/controllers/documents.md)
* [Webhooks](doc/controllers/webhooks.md)
* [Program](doc/controllers/program.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

