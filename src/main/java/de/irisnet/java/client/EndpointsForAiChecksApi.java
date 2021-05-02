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
import de.irisnet.java.client.model.IrisNet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointsForAiChecksApi {
    private ApiClient localVarApiClient;

    public EndpointsForAiChecksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EndpointsForAiChecksApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for checkImage
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @param file  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkImageCall(String licenseKey, Integer detail, File file, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/check-image/{licenseKey}"
            .replaceAll("\\{" + "licenseKey" + "\\}", localVarApiClient.escapeString(licenseKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (detail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("detail", detail));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkImageValidateBeforeCall(String licenseKey, Integer detail, File file, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'licenseKey' is set
        if (licenseKey == null) {
            throw new ApiException("Missing the required parameter 'licenseKey' when calling checkImage(Async)");
        }
        

        okhttp3.Call localVarCall = checkImageCall(licenseKey, detail, file, _callback);
        return localVarCall;

    }

    /**
     * Upload and check image against previously chosen configuration.
     * 
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @param file  (optional)
     * @return IrisNet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public IrisNet checkImage(String licenseKey, Integer detail, File file) throws ApiException {
        ApiResponse<IrisNet> localVarResp = checkImageWithHttpInfo(licenseKey, detail, file);
        return localVarResp.getData();
    }

    /**
     * Upload and check image against previously chosen configuration.
     * 
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @param file  (optional)
     * @return ApiResponse&lt;IrisNet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IrisNet> checkImageWithHttpInfo(String licenseKey, Integer detail, File file) throws ApiException {
        okhttp3.Call localVarCall = checkImageValidateBeforeCall(licenseKey, detail, file, null);
        Type localVarReturnType = new TypeToken<IrisNet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload and check image against previously chosen configuration. (asynchronously)
     * 
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @param file  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkImageAsync(String licenseKey, Integer detail, File file, final ApiCallback<IrisNet> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkImageValidateBeforeCall(licenseKey, detail, file, _callback);
        Type localVarReturnType = new TypeToken<IrisNet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for checkImageUrl
     * @param url  (required)
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkImageUrlCall(String url, String licenseKey, Integer detail, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/check-url/{licenseKey}"
            .replaceAll("\\{" + "licenseKey" + "\\}", localVarApiClient.escapeString(licenseKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (url != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("url", url));
        }

        if (detail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("detail", detail));
        }

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkImageUrlValidateBeforeCall(String url, String licenseKey, Integer detail, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling checkImageUrl(Async)");
        }
        
        // verify the required parameter 'licenseKey' is set
        if (licenseKey == null) {
            throw new ApiException("Missing the required parameter 'licenseKey' when calling checkImageUrl(Async)");
        }
        

        okhttp3.Call localVarCall = checkImageUrlCall(url, licenseKey, detail, _callback);
        return localVarCall;

    }

    /**
     * Check image url against previously chosen configuration.
     * 
     * @param url  (required)
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @return IrisNet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public IrisNet checkImageUrl(String url, String licenseKey, Integer detail) throws ApiException {
        ApiResponse<IrisNet> localVarResp = checkImageUrlWithHttpInfo(url, licenseKey, detail);
        return localVarResp.getData();
    }

    /**
     * Check image url against previously chosen configuration.
     * 
     * @param url  (required)
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @return ApiResponse&lt;IrisNet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IrisNet> checkImageUrlWithHttpInfo(String url, String licenseKey, Integer detail) throws ApiException {
        okhttp3.Call localVarCall = checkImageUrlValidateBeforeCall(url, licenseKey, detail, null);
        Type localVarReturnType = new TypeToken<IrisNet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check image url against previously chosen configuration. (asynchronously)
     * 
     * @param url  (required)
     * @param licenseKey License obtained from irisnet.de shop. (required)
     * @param detail Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 402 </td><td> Not enough credits </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkImageUrlAsync(String url, String licenseKey, Integer detail, final ApiCallback<IrisNet> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkImageUrlValidateBeforeCall(url, licenseKey, detail, _callback);
        Type localVarReturnType = new TypeToken<IrisNet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
