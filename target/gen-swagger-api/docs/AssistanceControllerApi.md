# AssistanceControllerApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsingPOST1**](AssistanceControllerApi.md#addUsingPOST1) | **POST** /carwash/api/assistance/admin/ | Add a new assistance (Admin rights only)
[**deleteUsingDELETE1**](AssistanceControllerApi.md#deleteUsingDELETE1) | **DELETE** /carwash/api/assistance/admin/{id} | Delete any assistance by Assistance_ID (Admin rights only)
[**getAllUsingGET1**](AssistanceControllerApi.md#getAllUsingGET1) | **GET** /carwash/api/assistance/ | Get a list of all assistances
[**getUsingGET1**](AssistanceControllerApi.md#getUsingGET1) | **GET** /carwash/api/assistance/{id} | Get assistance by Assistance_ID
[**updateUsingPUT**](AssistanceControllerApi.md#updateUsingPUT) | **PUT** /carwash/api/assistance/admin/{id} | Update any assistance by Assistance_ID (Admin rights only)

<a name="addUsingPOST1"></a>
# **addUsingPOST1**
> AssistanceDTO addUsingPOST1(body)

Add a new assistance (Admin rights only)

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AssistanceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AssistanceControllerApi apiInstance = new AssistanceControllerApi();
AssistanceDTO body = new AssistanceDTO(); // AssistanceDTO | assistanceDTO
try {
    AssistanceDTO result = apiInstance.addUsingPOST1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistanceControllerApi#addUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssistanceDTO**](AssistanceDTO.md)| assistanceDTO |

### Return type

[**AssistanceDTO**](AssistanceDTO.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> AssistanceDTO deleteUsingDELETE1(id)

Delete any assistance by Assistance_ID (Admin rights only)

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AssistanceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AssistanceControllerApi apiInstance = new AssistanceControllerApi();
Integer id = 56; // Integer | id
try {
    AssistanceDTO result = apiInstance.deleteUsingDELETE1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistanceControllerApi#deleteUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**AssistanceDTO**](AssistanceDTO.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsingGET1"></a>
# **getAllUsingGET1**
> List&lt;AssistanceDTO&gt; getAllUsingGET1()

Get a list of all assistances

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AssistanceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AssistanceControllerApi apiInstance = new AssistanceControllerApi();
try {
    List<AssistanceDTO> result = apiInstance.getAllUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistanceControllerApi#getAllUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AssistanceDTO&gt;**](AssistanceDTO.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsingGET1"></a>
# **getUsingGET1**
> AssistanceDTO getUsingGET1(id)

Get assistance by Assistance_ID

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AssistanceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AssistanceControllerApi apiInstance = new AssistanceControllerApi();
Integer id = 56; // Integer | id
try {
    AssistanceDTO result = apiInstance.getUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistanceControllerApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**AssistanceDTO**](AssistanceDTO.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> AssistanceDTO updateUsingPUT(body, id)

Update any assistance by Assistance_ID (Admin rights only)

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AssistanceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AssistanceControllerApi apiInstance = new AssistanceControllerApi();
AssistanceDTO body = new AssistanceDTO(); // AssistanceDTO | updateAssistance
Integer id = 56; // Integer | id
try {
    AssistanceDTO result = apiInstance.updateUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistanceControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssistanceDTO**](AssistanceDTO.md)| updateAssistance |
 **id** | **Integer**| id |

### Return type

[**AssistanceDTO**](AssistanceDTO.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

