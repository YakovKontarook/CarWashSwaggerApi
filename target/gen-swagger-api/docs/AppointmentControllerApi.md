# AppointmentControllerApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAppointmentOnSpecificTimeUsingPOST**](AppointmentControllerApi.md#addAppointmentOnSpecificTimeUsingPOST) | **POST** /carwash/api/appointments/on-time | Add a new appointment on a specific time
[**addUsingPOST**](AppointmentControllerApi.md#addUsingPOST) | **POST** /carwash/api/appointments/ | Add a new appointment on the nearest free time
[**deleteUsingDELETE**](AppointmentControllerApi.md#deleteUsingDELETE) | **DELETE** /carwash/api/appointments/admin/{id} | Delete any appointment by id (Admin rights)
[**getAllUsingGET**](AppointmentControllerApi.md#getAllUsingGET) | **GET** /carwash/api/appointments/admin/all | Get all appointments (Admin rights only)
[**getUserHistoryUsingGET**](AppointmentControllerApi.md#getUserHistoryUsingGET) | **GET** /carwash/api/appointments/user/history | Get history of the user appointments
[**getUsingGET**](AppointmentControllerApi.md#getUsingGET) | **GET** /carwash/api/appointments/admin/{id} | Get appointment by Appointment_ID (Admin rights only)
[**getWaitingAssistanceByUserUsingGET**](AppointmentControllerApi.md#getWaitingAssistanceByUserUsingGET) | **GET** /carwash/api/appointments/user | Get appointments user is waiting

<a name="addAppointmentOnSpecificTimeUsingPOST"></a>
# **addAppointmentOnSpecificTimeUsingPOST**
> AppointmentDTORes addAppointmentOnSpecificTimeUsingPOST(body)

Add a new appointment on a specific time

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
AppointmentOnTimeRequest body = new AppointmentOnTimeRequest(); // AppointmentOnTimeRequest | appointmentOnTimeRequest
try {
    AppointmentDTORes result = apiInstance.addAppointmentOnSpecificTimeUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#addAppointmentOnSpecificTimeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentOnTimeRequest**](AppointmentOnTimeRequest.md)| appointmentOnTimeRequest |

### Return type

[**AppointmentDTORes**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addUsingPOST"></a>
# **addUsingPOST**
> AppointmentDTORes addUsingPOST(body)

Add a new appointment on the nearest free time

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
AppointmentDTOReq body = new AppointmentDTOReq(); // AppointmentDTOReq | appointmentDto
try {
    AppointmentDTORes result = apiInstance.addUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#addUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentDTOReq**](AppointmentDTOReq.md)| appointmentDto |

### Return type

[**AppointmentDTORes**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> AppointmentDTORes deleteUsingDELETE(id)

Delete any appointment by id (Admin rights)

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
Integer id = 56; // Integer | id
try {
    AppointmentDTORes result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**AppointmentDTORes**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsingGET"></a>
# **getAllUsingGET**
> List&lt;AppointmentDTORes&gt; getAllUsingGET()

Get all appointments (Admin rights only)

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
try {
    List<AppointmentDTORes> result = apiInstance.getAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#getAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AppointmentDTORes&gt;**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserHistoryUsingGET"></a>
# **getUserHistoryUsingGET**
> List&lt;AppointmentDTORes&gt; getUserHistoryUsingGET()

Get history of the user appointments

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
try {
    List<AppointmentDTORes> result = apiInstance.getUserHistoryUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#getUserHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AppointmentDTORes&gt;**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> AppointmentDTORes getUsingGET(id)

Get appointment by Appointment_ID (Admin rights only)

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
Integer id = 56; // Integer | id
try {
    AppointmentDTORes result = apiInstance.getUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**AppointmentDTORes**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWaitingAssistanceByUserUsingGET"></a>
# **getWaitingAssistanceByUserUsingGET**
> List&lt;AppointmentDTORes&gt; getWaitingAssistanceByUserUsingGET()

Get appointments user is waiting

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AppointmentControllerApi apiInstance = new AppointmentControllerApi();
try {
    List<AppointmentDTORes> result = apiInstance.getWaitingAssistanceByUserUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentControllerApi#getWaitingAssistanceByUserUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AppointmentDTORes&gt;**](AppointmentDTORes.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

