# AuthenticationControllerApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginUsingPOST**](AuthenticationControllerApi.md#loginUsingPOST) | **POST** /carwash/api/auth/login | Login
[**signUpUsingPOST**](AuthenticationControllerApi.md#signUpUsingPOST) | **POST** /carwash/api/auth/signup | Signup

<a name="loginUsingPOST"></a>
# **loginUsingPOST**
> String loginUsingPOST(body)

Login

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AuthenticationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
AuthenticationRequest body = new AuthenticationRequest(); // AuthenticationRequest | authRequest
try {
    String result = apiInstance.loginUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#loginUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthenticationRequest**](AuthenticationRequest.md)| authRequest |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="signUpUsingPOST"></a>
# **signUpUsingPOST**
> User signUpUsingPOST(body)

Signup

### Example
```java
// Import classes:
//import CarWashSwaggerApi.api.invoker.ApiClient;
//import CarWashSwaggerApi.api.invoker.ApiException;
//import CarWashSwaggerApi.api.invoker.Configuration;
//import CarWashSwaggerApi.api.invoker.auth.*;
//import CarWashSwaggerApi.api.controller.AuthenticationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
SignUpRequest body = new SignUpRequest(); // SignUpRequest | signUpRequest
try {
    User result = apiInstance.signUpUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#signUpUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignUpRequest**](SignUpRequest.md)| signUpRequest |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

