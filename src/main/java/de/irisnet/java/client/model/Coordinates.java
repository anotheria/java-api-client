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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.irisnet.java.client.model.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * Describes the position and bounds of the classification object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Coordinates {
  public static final String SERIALIZED_NAME_RECTANGLES = "rectangles";
  @SerializedName(SERIALIZED_NAME_RECTANGLES)
  private List<Rectangle> rectangles;

  public Coordinates() {
  }

  public Coordinates rectangles(List<Rectangle> rectangles) {
    
    this.rectangles = rectangles;
    return this;
  }

  public Coordinates addRectanglesItem(Rectangle rectanglesItem) {
    if (this.rectangles == null) {
      this.rectangles = new ArrayList<>();
    }
    this.rectangles.add(rectanglesItem);
    return this;
  }

   /**
   * Get rectangles
   * @return rectangles
  **/
  @javax.annotation.Nullable
  public List<Rectangle> getRectangles() {
    return rectangles;
  }


  public void setRectangles(List<Rectangle> rectangles) {
    this.rectangles = rectangles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.rectangles, coordinates.rectangles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rectangles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    sb.append("    rectangles: ").append(toIndentedString(rectangles)).append("\n");
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
    openapiFields.add("rectangles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Coordinates
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Coordinates.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Coordinates is not found in the empty JSON string", Coordinates.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Coordinates.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Coordinates` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("rectangles") != null && !jsonObj.get("rectangles").isJsonNull()) {
        JsonArray jsonArrayrectangles = jsonObj.getAsJsonArray("rectangles");
        if (jsonArrayrectangles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rectangles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rectangles` to be an array in the JSON string but got `%s`", jsonObj.get("rectangles").toString()));
          }

          // validate the optional field `rectangles` (array)
          for (int i = 0; i < jsonArrayrectangles.size(); i++) {
            Rectangle.validateJsonObject(jsonArrayrectangles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Coordinates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Coordinates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Coordinates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Coordinates.class));

       return (TypeAdapter<T>) new TypeAdapter<Coordinates>() {
           @Override
           public void write(JsonWriter out, Coordinates value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Coordinates read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Coordinates given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Coordinates
  * @throws IOException if the JSON string is invalid with respect to Coordinates
  */
  public static Coordinates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Coordinates.class);
  }

 /**
  * Convert an instance of Coordinates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

