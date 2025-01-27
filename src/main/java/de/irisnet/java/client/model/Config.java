/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in real-time. This is an interactive documentation where you can quickly look up the endpoints and their schemas, while having the opportunity to try things out for yourself.  In the list below, you can see the available endpoints of the API, which can be expanded by clicking on them. Each expanded endpoint lists the request parameters (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail.  Additionally you'll find a 'Try it out' button that allows you to enter your custom parameters and custom body and execute that against the API. <b>Be sure to enter your license key to authorize the requests before using this documentation interactively.</b>  The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. If you click on the right arrow, you can expand the model and get a description of the model and the model parameters. For nested models, you can keep clicking the right arrow for further details.  Clicking the link below the title at the top of this page opens the [OpenAPI specification](https://swagger.io/specification/) (OAS3) in JSON format. The OAS3 Spec allows the generation of clients in many programming languages. There are several free client generators available that can be used to get started easily.
 *
 * The version of the OpenAPI document: v2
 * Contact: info@irisnet.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.irisnet.java.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * Can be used to set a multitude of pre-defined commonly used rules without the need of specifying each parameter set.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Config {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  /**
   * Names of kyc related parameters, that can be used to configure check behaviour. * _identityDocumentCheck_ - Checks for validity and integrity of an official document. * _automatedDocumentRecognition_ - Additional parameter for the identityDocumentCheck to enable automated document recognition. * _biometricCheck_ - Checks if the provided selfie matches the provided document. If used stand-alone the document holder has to be previously identified by an identityDocumentCheck * _considerKnownFaces_ - If this parameter is present, the identityDocumentChecks, the biometricChecks and the liveIdentification would take already known selfies from documentHolders into consideration. * _formAutoFill_ - Performs an autofill for a given document image without performing a validity or integrity check. * _ageVerificationCheck_ - Performs an age verification check for a provided selfie. * _liveIdentification_ - Performs a guided live identification via an UI. * _liveSelfie_ - Additional parameter for the liveIdentification to take a selfie video instead of a selfie image. * _proofOfAddress_ - Additional parameter for the liveIdentification to also take a proof of address document into consideration. * _liveAgeVerificationCheck_ - Performs a guided live age verification check via an UI. * _videoUploadIdentification_ - Use a video to perform an identityDocumentCheck and biometricCheck via an UI. * _iFrameFlow_ - Flag to signal that the iFrame flow should be used for the UI driven identification. Either iFrameFlow or redirectFlow must be present if liveIdentification, liveAgeVerificationCheck or videoUploadIdentification is configured. * _redirectFlow_ - Flag to signal that the redirect flow should be used for the UI driven identification. Either iFrameFlow or redirectFlow must be present if liveIdentification, liveAgeVerificationCheck or videoUploadIdentification is configured. * _addEncodingsToResult_ - Flag to signal that document and selfie images of the check should be attached to the CheckResult. 
   */
  @JsonAdapter(KycCheckParametersEnum.Adapter.class)
  public enum KycCheckParametersEnum {
    IDENTITY_DOCUMENT_CHECK("identityDocumentCheck"),
    
    AUTOMATED_DOCUMENT_RECOGNITION("automatedDocumentRecognition"),
    
    BIOMETRIC_CHECK("biometricCheck"),
    
    CONSIDER_KNOWN_FACES("considerKnownFaces"),
    
    FORM_AUTOFILL("formAutofill"),
    
    LIVE_IDENTIFICATION("liveIdentification"),
    
    AGE_VERIFICATION_CHECK("ageVerificationCheck"),
    
    LIVE_AGE_VERIFICATION_CHECK("liveAgeVerificationCheck"),
    
    LIVE_SELFIE("liveSelfie"),
    
    PROOF_OF_ADDRESS("proofOfAddress"),
    
    VIDEO_UPLOAD_IDENTIFICATION("videoUploadIdentification"),
    
    I_FRAME_FLOW("iFrameFlow"),
    
    REDIRECT_FLOW("redirectFlow"),
    
    ADD_ENCODINGS_TO_RESULT("addEncodingsToResult");

    private String value;

    KycCheckParametersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KycCheckParametersEnum fromValue(String value) {
      for (KycCheckParametersEnum b : KycCheckParametersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KycCheckParametersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KycCheckParametersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KycCheckParametersEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KycCheckParametersEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KycCheckParametersEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KYC_CHECK_PARAMETERS = "kycCheckParameters";
  @SerializedName(SERIALIZED_NAME_KYC_CHECK_PARAMETERS)
  @javax.annotation.Nullable
  private Set<KycCheckParametersEnum> kycCheckParameters = new LinkedHashSet<>();

  /**
   * Name of commonly used rule sets (prototypes). That can be used to speed up the setup process.  * _nudityCheck_ - Commonly used prototype to check for nudity. * _ageEstimation_ - Checks if there are children, adults or seniors recognizable. This is intended to be a suggestion to help you implement further steps. * _illegalSymbols_ - Checks for symbols that are not permitted in Germany. * _textRecognition_ - Checks for text occurrences. * _attributesCheck_ - Checks for attributes of a person (e.g. female, male, glasses, hair, etc). * _bodyAttributes_ - Checks for attributes of the persons body. * _nippleCheck_ - Check for determining if the object recognized as breast has a nipple. * _unwantedSubstances_ - Check for undesired or unwanted substances. * _violenceCheck_ - Checks for recognizing weapons, camouflage, etc. * _selfieCheck_ - Checks for pre-defined gestures in a selfie.   
   */
  @JsonAdapter(PrototypesEnum.Adapter.class)
  public enum PrototypesEnum {
    NUDITY_CHECK("nudityCheck"),
    
    AGE_ESTIMATION("ageEstimation"),
    
    ILLEGAL_SYMBOLS("illegalSymbols"),
    
    TEXT_RECOGNITION("textRecognition"),
    
    ATTRIBUTES_CHECK("attributesCheck"),
    
    BODY_ATTRIBUTES("bodyAttributes"),
    
    NIPPLE_CHECK("nippleCheck"),
    
    UNWANTED_SUBSTANCES("unwantedSubstances"),
    
    VIOLENCE_CHECK("violenceCheck"),
    
    SELFIE_CHECK("selfieCheck");

    private String value;

    PrototypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrototypesEnum fromValue(String value) {
      for (PrototypesEnum b : PrototypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrototypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrototypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrototypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrototypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PrototypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROTOTYPES = "prototypes";
  @SerializedName(SERIALIZED_NAME_PROTOTYPES)
  @javax.annotation.Nullable
  private Set<PrototypesEnum> prototypes = new LinkedHashSet<>();

  public Config() {
  }

  public Config id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the AI configuration. Use this for any check operation to tell the AI how to behave.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public Config kycCheckParameters(@javax.annotation.Nullable Set<KycCheckParametersEnum> kycCheckParameters) {
    this.kycCheckParameters = kycCheckParameters;
    return this;
  }

  public Config addKycCheckParametersItem(KycCheckParametersEnum kycCheckParametersItem) {
    if (this.kycCheckParameters == null) {
      this.kycCheckParameters = new LinkedHashSet<>();
    }
    this.kycCheckParameters.add(kycCheckParametersItem);
    return this;
  }

  /**
   * Configures your kyc checks. You can combine certain parameters to customize a single check operation.
   * @return kycCheckParameters
   */
  @javax.annotation.Nullable
  public Set<KycCheckParametersEnum> getKycCheckParameters() {
    return kycCheckParameters;
  }

  public void setKycCheckParameters(@javax.annotation.Nullable Set<KycCheckParametersEnum> kycCheckParameters) {
    this.kycCheckParameters = kycCheckParameters;
  }


  public Config prototypes(@javax.annotation.Nullable Set<PrototypesEnum> prototypes) {
    this.prototypes = prototypes;
    return this;
  }

  public Config addPrototypesItem(PrototypesEnum prototypesItem) {
    if (this.prototypes == null) {
      this.prototypes = new LinkedHashSet<>();
    }
    this.prototypes.add(prototypesItem);
    return this;
  }

  /**
   * Configures your detection. As there are literally hundreds of parameters, prototypes can be used to get useful behaviour. This includes a default setting for parameters and rules that should be applied to the check operations. You can use multiple prototypes for a single check operation.
   * @return prototypes
   */
  @javax.annotation.Nullable
  public Set<PrototypesEnum> getPrototypes() {
    return prototypes;
  }

  public void setPrototypes(@javax.annotation.Nullable Set<PrototypesEnum> prototypes) {
    this.prototypes = prototypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.id, config.id) &&
        Objects.equals(this.kycCheckParameters, config.kycCheckParameters) &&
        Objects.equals(this.prototypes, config.prototypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kycCheckParameters, prototypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kycCheckParameters: ").append(toIndentedString(kycCheckParameters)).append("\n");
    sb.append("    prototypes: ").append(toIndentedString(prototypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("kycCheckParameters");
    openapiFields.add("prototypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Config
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Config.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Config is not found in the empty JSON string", Config.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Config.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Config` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("kycCheckParameters") != null && !jsonObj.get("kycCheckParameters").isJsonNull() && !jsonObj.get("kycCheckParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `kycCheckParameters` to be an array in the JSON string but got `%s`", jsonObj.get("kycCheckParameters").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("prototypes") != null && !jsonObj.get("prototypes").isJsonNull() && !jsonObj.get("prototypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prototypes` to be an array in the JSON string but got `%s`", jsonObj.get("prototypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Config.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Config' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Config> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Config.class));

       return (TypeAdapter<T>) new TypeAdapter<Config>() {
           @Override
           public void write(JsonWriter out, Config value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Config read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Config given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Config
   * @throws IOException if the JSON string is invalid with respect to Config
   */
  public static Config fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Config.class);
  }

  /**
   * Convert an instance of Config to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

