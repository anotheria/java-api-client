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
 * Summarizing the result of the AI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Summary {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_BROKEN_RULES_COUNT = "brokenRulesCount";
  @SerializedName(SERIALIZED_NAME_BROKEN_RULES_COUNT)
  @javax.annotation.Nullable
  private Integer brokenRulesCount;

  public static final String SERIALIZED_NAME_HELP_SUGGESTED = "helpSuggested";
  @SerializedName(SERIALIZED_NAME_HELP_SUGGESTED)
  @javax.annotation.Nullable
  private Integer helpSuggested;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  @javax.annotation.Nullable
  private Integer severity;

  public static final String SERIALIZED_NAME_CREDITS_CONSUMED = "creditsConsumed";
  @SerializedName(SERIALIZED_NAME_CREDITS_CONSUMED)
  @javax.annotation.Nullable
  private Integer creditsConsumed;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private Set<String> tags = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_REJECT_TAGS = "rejectTags";
  @SerializedName(SERIALIZED_NAME_REJECT_TAGS)
  @javax.annotation.Nullable
  private Set<String> rejectTags = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_REJECT_REASONS = "rejectReasons";
  @SerializedName(SERIALIZED_NAME_REJECT_REASONS)
  @javax.annotation.Nullable
  private Set<String> rejectReasons = new LinkedHashSet<>();

  public Summary() {
  }

  public Summary status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * A simple status string that can be either _accept_ or _reject_.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public Summary brokenRulesCount(@javax.annotation.Nullable Integer brokenRulesCount) {
    this.brokenRulesCount = brokenRulesCount;
    return this;
  }

  /**
   * The amount of broken rules that are contained in the source media.
   * @return brokenRulesCount
   */
  @javax.annotation.Nullable
  public Integer getBrokenRulesCount() {
    return brokenRulesCount;
  }

  public void setBrokenRulesCount(@javax.annotation.Nullable Integer brokenRulesCount) {
    this.brokenRulesCount = brokenRulesCount;
  }


  public Summary helpSuggested(@javax.annotation.Nullable Integer helpSuggested) {
    this.helpSuggested = helpSuggested;
    return this;
  }

  /**
   * In cases where the AI is uncertain, this attribute is set (1), indication that it could be useful to double check the source media by a human.
   * @return helpSuggested
   */
  @javax.annotation.Nullable
  public Integer getHelpSuggested() {
    return helpSuggested;
  }

  public void setHelpSuggested(@javax.annotation.Nullable Integer helpSuggested) {
    this.helpSuggested = helpSuggested;
  }


  public Summary severity(@javax.annotation.Nullable Integer severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The highest severity value found amongst the broken rules.
   * @return severity
   */
  @javax.annotation.Nullable
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(@javax.annotation.Nullable Integer severity) {
    this.severity = severity;
  }


  public Summary creditsConsumed(@javax.annotation.Nullable Integer creditsConsumed) {
    this.creditsConsumed = creditsConsumed;
    return this;
  }

  /**
   * The amount of credits that was consumed for the check.
   * @return creditsConsumed
   */
  @javax.annotation.Nullable
  public Integer getCreditsConsumed() {
    return creditsConsumed;
  }

  public void setCreditsConsumed(@javax.annotation.Nullable Integer creditsConsumed) {
    this.creditsConsumed = creditsConsumed;
  }


  public Summary tags(@javax.annotation.Nullable Set<String> tags) {
    this.tags = tags;
    return this;
  }

  public Summary addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of classification names that were found.
   * @return tags
   */
  @javax.annotation.Nullable
  public Set<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable Set<String> tags) {
    this.tags = tags;
  }


  public Summary rejectTags(@javax.annotation.Nullable Set<String> rejectTags) {
    this.rejectTags = rejectTags;
    return this;
  }

  public Summary addRejectTagsItem(String rejectTagsItem) {
    if (this.rejectTags == null) {
      this.rejectTags = new LinkedHashSet<>();
    }
    this.rejectTags.add(rejectTagsItem);
    return this;
  }

  /**
   * A list of classification names that caused a rule to be broken.
   * @return rejectTags
   */
  @javax.annotation.Nullable
  public Set<String> getRejectTags() {
    return rejectTags;
  }

  public void setRejectTags(@javax.annotation.Nullable Set<String> rejectTags) {
    this.rejectTags = rejectTags;
  }


  public Summary rejectReasons(@javax.annotation.Nullable Set<String> rejectReasons) {
    this.rejectReasons = rejectReasons;
    return this;
  }

  public Summary addRejectReasonsItem(String rejectReasonsItem) {
    if (this.rejectReasons == null) {
      this.rejectReasons = new LinkedHashSet<>();
    }
    this.rejectReasons.add(rejectReasonsItem);
    return this;
  }

  /**
   * The names of the classification groups that caused a rule to be broken.
   * @return rejectReasons
   */
  @javax.annotation.Nullable
  public Set<String> getRejectReasons() {
    return rejectReasons;
  }

  public void setRejectReasons(@javax.annotation.Nullable Set<String> rejectReasons) {
    this.rejectReasons = rejectReasons;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.status, summary.status) &&
        Objects.equals(this.brokenRulesCount, summary.brokenRulesCount) &&
        Objects.equals(this.helpSuggested, summary.helpSuggested) &&
        Objects.equals(this.severity, summary.severity) &&
        Objects.equals(this.creditsConsumed, summary.creditsConsumed) &&
        Objects.equals(this.tags, summary.tags) &&
        Objects.equals(this.rejectTags, summary.rejectTags) &&
        Objects.equals(this.rejectReasons, summary.rejectReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, brokenRulesCount, helpSuggested, severity, creditsConsumed, tags, rejectTags, rejectReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brokenRulesCount: ").append(toIndentedString(brokenRulesCount)).append("\n");
    sb.append("    helpSuggested: ").append(toIndentedString(helpSuggested)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    creditsConsumed: ").append(toIndentedString(creditsConsumed)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    rejectTags: ").append(toIndentedString(rejectTags)).append("\n");
    sb.append("    rejectReasons: ").append(toIndentedString(rejectReasons)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("brokenRulesCount");
    openapiFields.add("helpSuggested");
    openapiFields.add("severity");
    openapiFields.add("creditsConsumed");
    openapiFields.add("tags");
    openapiFields.add("rejectTags");
    openapiFields.add("rejectReasons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Summary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Summary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Summary is not found in the empty JSON string", Summary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Summary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Summary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rejectTags") != null && !jsonObj.get("rejectTags").isJsonNull() && !jsonObj.get("rejectTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectTags` to be an array in the JSON string but got `%s`", jsonObj.get("rejectTags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rejectReasons") != null && !jsonObj.get("rejectReasons").isJsonNull() && !jsonObj.get("rejectReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectReasons` to be an array in the JSON string but got `%s`", jsonObj.get("rejectReasons").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Summary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Summary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Summary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Summary.class));

       return (TypeAdapter<T>) new TypeAdapter<Summary>() {
           @Override
           public void write(JsonWriter out, Summary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Summary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Summary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Summary
   * @throws IOException if the JSON string is invalid with respect to Summary
   */
  public static Summary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Summary.class);
  }

  /**
   * Convert an instance of Summary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

