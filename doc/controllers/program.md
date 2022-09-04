# Program

```java
ProgramController programController = client.getProgramController();
```

## Class Name

`ProgramController`

## Methods

* [List Programs](../../doc/controllers/program.md#list-programs)
* [Retrieve Program](../../doc/controllers/program.md#retrieve-program)
* [List Program Agreements](../../doc/controllers/program.md#list-program-agreements)
* [Retrieve Program Agreement](../../doc/controllers/program.md#retrieve-program-agreement)


# List Programs

Retrieve a list of all programs that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<Void> listProgramsAsync()
```

## Response Type

`void`

## Example Usage

```java
programController.listProgramsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve Program

Retrieve a single program configuration

```java
CompletableFuture<Void> retrieveProgramAsync(
    final String progToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `progToken` | `String` | Template, Required | Auto-generated unique identifier representing a program, prefixed with <i>prog-</i>. |

## Response Type

`void`

## Example Usage

```java
String progToken = "prog-4525ab9c-5b22-4e30-028a-45901a10aa0c";

programController.retrieveProgramAsync(progToken).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# List Program Agreements

Retrieve a list of all program agreements that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<Void> listProgramAgreementsAsync(
    final String progToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `progToken` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String progToken = "prog-token4";

programController.listProgramAgreementsAsync(progToken).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve Program Agreement

Retrieve a single program agreement

```java
CompletableFuture<Void> retrieveProgramAgreementAsync(
    final String progToken,
    final String agmtToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `progToken` | `String` | Template, Required | Auto-generated unique identifier representing a program, prefixed with <i>prog-</i>. |
| `agmtToken` | `String` | Template, Required | Auto-generated unique identifier representing a program agreement, prefixed with <i>agmt-</i>. |

## Response Type

`void`

## Example Usage

```java
String progToken = "prog-4525ab9c-5b22-4e30-028a-45901a10aa0c";
String agmtToken = "agmt-45901a10-5b22-4e30-028a-45901a10baa9";

programController.retrieveProgramAgreementAsync(progToken, agmtToken).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

