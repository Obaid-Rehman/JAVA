# Documents

Document-related operations

```java
DocumentsController documentsController = client.getDocumentsController();
```

## Class Name

`DocumentsController`

## Methods

* [List User Documents](../../doc/controllers/documents.md#list-user-documents)
* [Create User Document](../../doc/controllers/documents.md#create-user-document)
* [Retrieve User Document](../../doc/controllers/documents.md#retrieve-user-document)
* [Replace User Document](../../doc/controllers/documents.md#replace-user-document)


# List User Documents

Retrieve a list of user documents that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<Void> listUserDocumentsAsync(
    final String userToken,
    final String xMyPayQuickerVersion,
    final Integer page,
    final Integer pageSize,
    final String filter,
    final String sort,
    final LanguageTypesEnum language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

`void`

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

documentsController.listUserDocumentsAsync(userToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Create User Document

Create a quote for a user document.

```java
CompletableFuture<Void> createUserDocumentAsync(
    final String userToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String xMyPayQuickerVersion = "2020.02.24";

documentsController.createUserDocumentAsync(userToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve User Document

Retrieve an individual user document by its document token.

```java
CompletableFuture<Void> retrieveUserDocumentAsync(
    final String userToken,
    final String docuToken,
    final String xMyPayQuickerVersion,
    final Integer page,
    final Integer pageSize,
    final String filter,
    final String sort,
    final LanguageTypesEnum language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `docuToken` | `String` | Template, Required | Auto-generated unique identifier representing an uploaded document, prefixed with <i>docu-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |
| `page` | `Integer` | Query, Optional | Page number of specific page to return<br>**Constraints**: `>= 1` |
| `pageSize` | `Integer` | Query, Optional | Number of items to be displayed per page<br>**Default**: `20`<br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`LanguageTypesEnum`](../../doc/models/language-types-enum.md) | Query, Optional | Filter results by language type. |

## Response Type

`void`

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String docuToken = "docu-6260c132-5cb1-4e30-8b08-9ce559893acb";
String xMyPayQuickerVersion = "2020.02.24";
Integer pageSize = 20;
String filter = "'name'*'Fra'||*'Ger','numericCode'>'5'";
String sort = "-name";
LanguageTypesEnum language = LanguageTypesEnum.ENUS;

documentsController.retrieveUserDocumentAsync(userToken, docuToken, xMyPayQuickerVersion, null, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Replace User Document

Replace the user document at the given document token.

```java
CompletableFuture<Void> replaceUserDocumentAsync(
    final String userToken,
    final String docuToken,
    final String xMyPayQuickerVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with <i>user-</i>. |
| `docuToken` | `String` | Template, Required | Auto-generated unique identifier representing an uploaded document, prefixed with <i>docu-</i>. |
| `xMyPayQuickerVersion` | `String` | Header, Required | Date-based API Version specified in the header <i>required</i> on all calls. |

## Response Type

`void`

## Example Usage

```java
String userToken = "user-f012bc86-4d42-415b-a8b2-be5e0b90e59a";
String docuToken = "docu-6260c132-5cb1-4e30-8b08-9ce559893acb";
String xMyPayQuickerVersion = "2020.02.24";

documentsController.replaceUserDocumentAsync(userToken, docuToken, xMyPayQuickerVersion).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

