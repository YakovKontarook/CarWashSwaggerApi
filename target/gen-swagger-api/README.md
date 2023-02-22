# api

Carwash service
- API version: 1.0.0
  - Build date: 2023-02-22T00:45:30.896522+03:00[Europe/Moscow]

Carwash service. Make appointments on free time slots or the next free time

  For more information, please visit [https://github.com/YakovKontarook](https://github.com/YakovKontarook)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>ru</groupId>
  <artifactId>api</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ru:api:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
import CarWashSwaggerApi.api.invoker.*;
import CarWashSwaggerApi.api.invoker.auth.*;
import CarWashSwaggerApi.api.model.*;
import CarWashSwaggerApi.api.controller.AppointmentControllerApi;

import java.io.File;
import java.util.*;

public class AppointmentControllerApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *//localhost:8080/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppointmentControllerApi* | [**addAppointmentOnSpecificTimeUsingPOST**](docs/AppointmentControllerApi.md#addAppointmentOnSpecificTimeUsingPOST) | **POST** /carwash/api/appointments/on-time | Add a new appointment on a specific time
*AppointmentControllerApi* | [**addUsingPOST**](docs/AppointmentControllerApi.md#addUsingPOST) | **POST** /carwash/api/appointments/ | Add a new appointment on the nearest free time
*AppointmentControllerApi* | [**deleteUsingDELETE**](docs/AppointmentControllerApi.md#deleteUsingDELETE) | **DELETE** /carwash/api/appointments/admin/{id} | Delete any appointment by id (Admin rights)
*AppointmentControllerApi* | [**getAllUsingGET**](docs/AppointmentControllerApi.md#getAllUsingGET) | **GET** /carwash/api/appointments/admin/all | Get all appointments (Admin rights only)
*AppointmentControllerApi* | [**getUserHistoryUsingGET**](docs/AppointmentControllerApi.md#getUserHistoryUsingGET) | **GET** /carwash/api/appointments/user/history | Get history of the user appointments
*AppointmentControllerApi* | [**getUsingGET**](docs/AppointmentControllerApi.md#getUsingGET) | **GET** /carwash/api/appointments/admin/{id} | Get appointment by Appointment_ID (Admin rights only)
*AppointmentControllerApi* | [**getWaitingAssistanceByUserUsingGET**](docs/AppointmentControllerApi.md#getWaitingAssistanceByUserUsingGET) | **GET** /carwash/api/appointments/user | Get appointments user is waiting
*AssistanceControllerApi* | [**addUsingPOST1**](docs/AssistanceControllerApi.md#addUsingPOST1) | **POST** /carwash/api/assistance/admin/ | Add a new assistance (Admin rights only)
*AssistanceControllerApi* | [**deleteUsingDELETE1**](docs/AssistanceControllerApi.md#deleteUsingDELETE1) | **DELETE** /carwash/api/assistance/admin/{id} | Delete any assistance by Assistance_ID (Admin rights only)
*AssistanceControllerApi* | [**getAllUsingGET1**](docs/AssistanceControllerApi.md#getAllUsingGET1) | **GET** /carwash/api/assistance/ | Get a list of all assistances
*AssistanceControllerApi* | [**getUsingGET1**](docs/AssistanceControllerApi.md#getUsingGET1) | **GET** /carwash/api/assistance/{id} | Get assistance by Assistance_ID
*AssistanceControllerApi* | [**updateUsingPUT**](docs/AssistanceControllerApi.md#updateUsingPUT) | **PUT** /carwash/api/assistance/admin/{id} | Update any assistance by Assistance_ID (Admin rights only)
*AuthenticationControllerApi* | [**loginUsingPOST**](docs/AuthenticationControllerApi.md#loginUsingPOST) | **POST** /carwash/api/auth/login | Login
*AuthenticationControllerApi* | [**signUpUsingPOST**](docs/AuthenticationControllerApi.md#signUpUsingPOST) | **POST** /carwash/api/auth/signup | Signup

## Documentation for Models

 - [Appointment](docs/Appointment.md)
 - [AppointmentDTOReq](docs/AppointmentDTOReq.md)
 - [AppointmentDTORes](docs/AppointmentDTORes.md)
 - [AppointmentOnTimeRequest](docs/AppointmentOnTimeRequest.md)
 - [Assistance](docs/Assistance.md)
 - [AssistanceDTO](docs/AssistanceDTO.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [SignUpRequest](docs/SignUpRequest.md)
 - [User](docs/User.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### JWT

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

kontarook@gmail.com