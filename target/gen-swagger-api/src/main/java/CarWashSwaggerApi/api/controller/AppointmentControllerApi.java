package CarWashSwaggerApi.api.controller;

import CarWashSwaggerApi.api.invoker.ApiClient;

import CarWashSwaggerApi.api.model.AppointmentDTOReq;
import CarWashSwaggerApi.api.model.AppointmentDTORes;
import CarWashSwaggerApi.api.model.AppointmentOnTimeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T00:45:30.896522+03:00[Europe/Moscow]")@Component("CarWashSwaggerApi.api.controller.AppointmentControllerApi")
public class AppointmentControllerApi {
    private ApiClient apiClient;

    public AppointmentControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppointmentControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new appointment on a specific time
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param body appointmentOnTimeRequest (required)
     * @return AppointmentDTORes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppointmentDTORes addAppointmentOnSpecificTimeUsingPOST(AppointmentOnTimeRequest body) throws RestClientException {
        return addAppointmentOnSpecificTimeUsingPOSTWithHttpInfo(body).getBody();
    }

    /**
     * Add a new appointment on a specific time
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param body appointmentOnTimeRequest (required)
     * @return ResponseEntity&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppointmentDTORes> addAppointmentOnSpecificTimeUsingPOSTWithHttpInfo(AppointmentOnTimeRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addAppointmentOnSpecificTimeUsingPOST");
        }
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/on-time").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<AppointmentDTORes> returnType = new ParameterizedTypeReference<AppointmentDTORes>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Add a new appointment on the nearest free time
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param body appointmentDto (required)
     * @return AppointmentDTORes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppointmentDTORes addUsingPOST(AppointmentDTOReq body) throws RestClientException {
        return addUsingPOSTWithHttpInfo(body).getBody();
    }

    /**
     * Add a new appointment on the nearest free time
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param body appointmentDto (required)
     * @return ResponseEntity&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppointmentDTORes> addUsingPOSTWithHttpInfo(AppointmentDTOReq body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addUsingPOST");
        }
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<AppointmentDTORes> returnType = new ParameterizedTypeReference<AppointmentDTORes>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete any appointment by id (Admin rights)
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param id id (required)
     * @return AppointmentDTORes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppointmentDTORes deleteUsingDELETE(Integer id) throws RestClientException {
        return deleteUsingDELETEWithHttpInfo(id).getBody();
    }

    /**
     * Delete any appointment by id (Admin rights)
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param id id (required)
     * @return ResponseEntity&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppointmentDTORes> deleteUsingDELETEWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteUsingDELETE");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/admin/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<AppointmentDTORes> returnType = new ParameterizedTypeReference<AppointmentDTORes>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all appointments (Admin rights only)
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AppointmentDTORes> getAllUsingGET() throws RestClientException {
        return getAllUsingGETWithHttpInfo().getBody();
    }

    /**
     * Get all appointments (Admin rights only)
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;List&lt;AppointmentDTORes&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AppointmentDTORes>> getAllUsingGETWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/admin/all").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<List<AppointmentDTORes>> returnType = new ParameterizedTypeReference<List<AppointmentDTORes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get history of the user appointments
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AppointmentDTORes> getUserHistoryUsingGET() throws RestClientException {
        return getUserHistoryUsingGETWithHttpInfo().getBody();
    }

    /**
     * Get history of the user appointments
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;List&lt;AppointmentDTORes&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AppointmentDTORes>> getUserHistoryUsingGETWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/user/history").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<List<AppointmentDTORes>> returnType = new ParameterizedTypeReference<List<AppointmentDTORes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get appointment by Appointment_ID (Admin rights only)
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id id (required)
     * @return AppointmentDTORes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppointmentDTORes getUsingGET(Integer id) throws RestClientException {
        return getUsingGETWithHttpInfo(id).getBody();
    }

    /**
     * Get appointment by Appointment_ID (Admin rights only)
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param id id (required)
     * @return ResponseEntity&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppointmentDTORes> getUsingGETWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getUsingGET");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/admin/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<AppointmentDTORes> returnType = new ParameterizedTypeReference<AppointmentDTORes>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get appointments user is waiting
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;AppointmentDTORes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AppointmentDTORes> getWaitingAssistanceByUserUsingGET() throws RestClientException {
        return getWaitingAssistanceByUserUsingGETWithHttpInfo().getBody();
    }

    /**
     * Get appointments user is waiting
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;List&lt;AppointmentDTORes&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AppointmentDTORes>> getWaitingAssistanceByUserUsingGETWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/carwash/api/appointments/user").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "JWT" };

        ParameterizedTypeReference<List<AppointmentDTORes>> returnType = new ParameterizedTypeReference<List<AppointmentDTORes>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
