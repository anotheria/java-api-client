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
import de.irisnet.java.client.model.AgeEstimationSubChecks;
import de.irisnet.java.client.model.BaseAttribute;
import de.irisnet.java.client.model.Coordinates;
import de.irisnet.java.client.model.Detection;
import de.irisnet.java.client.model.KnownFace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Contains further characteristics particular to _face_ detection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class FaceDetection extends Detection {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  @javax.annotation.Nullable
  private String classification;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @javax.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  @javax.annotation.Nullable
  private Integer probability;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  @javax.annotation.Nullable
  private Coordinates coordinates;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private List<BaseAttribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUB_DETECTIONS = "subDetections";
  @SerializedName(SERIALIZED_NAME_SUB_DETECTIONS)
  @javax.annotation.Nullable
  private List<Detection> subDetections = new ArrayList<>();

  public FaceDetection() {
    this.type = this.getClass().getSimpleName();
  }

  public FaceDetection classification(@javax.annotation.Nullable String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * The classification of the recognized object.
   * @return classification
   */
  @javax.annotation.Nullable
  public String getClassification() {
    return classification;
  }

  public void setClassification(@javax.annotation.Nullable String classification) {
    this.classification = classification;
  }


  public FaceDetection group(@javax.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * The group of the classification.
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(@javax.annotation.Nullable String group) {
    this.group = group;
  }


  public FaceDetection id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the detection object.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public FaceDetection probability(@javax.annotation.Nullable Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * The probability that the object found matches the classification.
   * @return probability
   */
  @javax.annotation.Nullable
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(@javax.annotation.Nullable Integer probability) {
    this.probability = probability;
  }


  public FaceDetection coordinates(@javax.annotation.Nullable Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   */
  @javax.annotation.Nullable
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(@javax.annotation.Nullable Coordinates coordinates) {
    this.coordinates = coordinates;
  }


  public FaceDetection attributes(@javax.annotation.Nullable List<BaseAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public FaceDetection addAttributesItem(BaseAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Attributes characterizing the _face_ detection. Mainly contains attributes that were activated with the _ageEstimation_ prototype.
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<BaseAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable List<BaseAttribute> attributes) {
    this.attributes = attributes;
  }


  public FaceDetection subDetections(@javax.annotation.Nullable List<Detection> subDetections) {
    this.subDetections = subDetections;
    return this;
  }

  public FaceDetection addSubDetectionsItem(Detection subDetectionsItem) {
    if (this.subDetections == null) {
      this.subDetections = new ArrayList<>();
    }
    this.subDetections.add(subDetectionsItem);
    return this;
  }

  /**
   * A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype.
   * @return subDetections
   */
  @javax.annotation.Nullable
  public List<Detection> getSubDetections() {
    return subDetections;
  }

  public void setSubDetections(@javax.annotation.Nullable List<Detection> subDetections) {
    this.subDetections = subDetections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceDetection faceDetection = (FaceDetection) o;
    return Objects.equals(this.classification, faceDetection.classification) &&
        Objects.equals(this.group, faceDetection.group) &&
        Objects.equals(this.id, faceDetection.id) &&
        Objects.equals(this.probability, faceDetection.probability) &&
        Objects.equals(this.coordinates, faceDetection.coordinates) &&
        Objects.equals(this.attributes, faceDetection.attributes) &&
        Objects.equals(this.subDetections, faceDetection.subDetections) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, group, id, probability, coordinates, attributes, subDetections, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceDetection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    subDetections: ").append(toIndentedString(subDetections)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("classification");
    openapiFields.add("group");
    openapiFields.add("id");
    openapiFields.add("probability");
    openapiFields.add("coordinates");
    openapiFields.add("attributes");
    openapiFields.add("subDetections");
    openapiFields.add("checkId");
    openapiFields.add("hasOfficialDocument");
    openapiFields.add("comparable");
    openapiFields.add("faceSimilarity");
    openapiFields.add("faceLivenessCheckScore");
    openapiFields.add("documentFrontLivenessScore");
    openapiFields.add("documentBackLivenessScore");
    openapiFields.add("processedChecks");
    openapiFields.add("documentHolderId");
    openapiFields.add("knownFaces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FaceDetection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FaceDetection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaceDetection is not found in the empty JSON string", FaceDetection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FaceDetection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FaceDetection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaceDetection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaceDetection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaceDetection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaceDetection.class));

       return (TypeAdapter<T>) new TypeAdapter<FaceDetection>() {
           @Override
           public void write(JsonWriter out, FaceDetection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FaceDetection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FaceDetection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FaceDetection
   * @throws IOException if the JSON string is invalid with respect to FaceDetection
   */
  public static FaceDetection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaceDetection.class);
  }

  /**
   * Convert an instance of FaceDetection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

