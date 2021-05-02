/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses.By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.irisnet.java.client;

import de.irisnet.java.ApiCallback;
import de.irisnet.java.ApiClient;
import de.irisnet.java.ApiException;
import de.irisnet.java.ApiResponse;
import de.irisnet.java.Configuration;
import de.irisnet.java.Pair;
import de.irisnet.java.ProgressRequestBody;
import de.irisnet.java.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import de.irisnet.java.client.model.INError;
import de.irisnet.java.client.model.LicenseInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiscellaneousOperationsApi {
    private ApiClient localVarApiClient;

    public MiscellaneousOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MiscellaneousOperationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for downloadProcessed
     * @param filename  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the file AI produced file with masking or blurring, depending on given AI parameters. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Specified file was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadProcessedCall(String filename, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/download/{filename}"
            .replaceAll("\\{" + "filename" + "\\}", localVarApiClient.escapeString(filename.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadProcessedValidateBeforeCall(String filename, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling downloadProcessed(Async)");
        }
        

        okhttp3.Call localVarCall = downloadProcessedCall(filename, _callback);
        return localVarCall;

    }

    /**
     * Get the resulting media file.
     * 
     * @param filename  (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the file AI produced file with masking or blurring, depending on given AI parameters. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Specified file was not found. </td><td>  -  </td></tr>
     </table>
     */
    public File downloadProcessed(String filename) throws ApiException {
        ApiResponse<File> localVarResp = downloadProcessedWithHttpInfo(filename);
        return localVarResp.getData();
    }

    /**
     * Get the resulting media file.
     * 
     * @param filename  (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the file AI produced file with masking or blurring, depending on given AI parameters. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Specified file was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> downloadProcessedWithHttpInfo(String filename) throws ApiException {
        okhttp3.Call localVarCall = downloadProcessedValidateBeforeCall(filename, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the resulting media file. (asynchronously)
     * 
     * @param filename  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the file AI produced file with masking or blurring, depending on given AI parameters. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Specified file was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadProcessedAsync(String filename, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadProcessedValidateBeforeCall(filename, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAICost
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the cost of the AI check with the current set of parameters. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAICostCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/cost";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAICostValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAICostCall(_callback);
        return localVarCall;

    }

    /**
     * Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.
     * 
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the cost of the AI check with the current set of parameters. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. </td><td>  -  </td></tr>
     </table>
     */
    public Long getAICost() throws ApiException {
        ApiResponse<Long> localVarResp = getAICostWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.
     * 
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the cost of the AI check with the current set of parameters. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Long> getAICostWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAICostValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check. (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the cost of the AI check with the current set of parameters. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The ai could not handle the request because it is either overloaded or currently down for maintenance. This is a temporary state. A &#39;Retry-After&#39; Header is included in the response to signal the client to retry after a certain amount of seconds. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAICostAsync(final ApiCallback<Long> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAICostValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLicenseInfo
     * @param licenseKey License obtained from the https://www.irisnet.de/prices shop. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The entered license key was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLicenseInfoCall(String licenseKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/info/{licenseKey}"
            .replaceAll("\\{" + "licenseKey" + "\\}", localVarApiClient.escapeString(licenseKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLicenseInfoValidateBeforeCall(String licenseKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'licenseKey' is set
        if (licenseKey == null) {
            throw new ApiException("Missing the required parameter 'licenseKey' when calling getLicenseInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getLicenseInfoCall(licenseKey, _callback);
        return localVarCall;

    }

    /**
     * Get information from given license key.
     * 
     * @param licenseKey License obtained from the https://www.irisnet.de/prices shop. (required)
     * @return LicenseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The entered license key was not found. </td><td>  -  </td></tr>
     </table>
     */
    public LicenseInfo getLicenseInfo(String licenseKey) throws ApiException {
        ApiResponse<LicenseInfo> localVarResp = getLicenseInfoWithHttpInfo(licenseKey);
        return localVarResp.getData();
    }

    /**
     * Get information from given license key.
     * 
     * @param licenseKey License obtained from the https://www.irisnet.de/prices shop. (required)
     * @return ApiResponse&lt;LicenseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The entered license key was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LicenseInfo> getLicenseInfoWithHttpInfo(String licenseKey) throws ApiException {
        okhttp3.Call localVarCall = getLicenseInfoValidateBeforeCall(licenseKey, null);
        Type localVarReturnType = new TypeToken<LicenseInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get information from given license key. (asynchronously)
     * 
     * @param licenseKey License obtained from the https://www.irisnet.de/prices shop. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The entered license key was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLicenseInfoAsync(String licenseKey, final ApiCallback<LicenseInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLicenseInfoValidateBeforeCall(licenseKey, _callback);
        Type localVarReturnType = new TypeToken<LicenseInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
