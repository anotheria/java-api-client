/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
 *
 * The version of the OpenAPI document: v1
 * 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A single parameter set for one object, for example face, describing the behaviour of the AI. Each object has default parameters that are set if these are empty.
 */
@ApiModel(description = "A single parameter set for one object, for example face, describing the behaviour of the AI. Each object has default parameters that are set if these are empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class INParam {
  /**
   * The classification of the object, that the element refers to. Default parameter values are defined per classification object. The following list contains the default values for &#39;min&#39;, &#39;max&#39; and &#39;drawMode&#39; in order.  * _face_ _(1, 3, 0)_ - Classification for human faces. * _child (*)_ _(0, 0, 6)_ - Recognizes children&#39;s faces. * _adult (*)_ _(0, -1, 0)_ - Recognizes faces of adults that are not considered seniors. * _senior (*)_ _(0, -1, 0)_ - Recognizes faces of seniors. * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. * _female (*)_ _(0, -1, 0)_ - Recognizes female faces.  * _male (*)_ _(0, -1, 0)_ - Recognizes male faces.  * _hand_ _(0, -1, 0)_ - Classification for recognizing hands. * _foot_ _(0, -1, 0)_ - Classification for recognizing feet. * _footwear_ _(0, -1, 0)_ - Classification for recognizing footwear. * _hair_ _(0, -1, 0)_ - Classification for recognizing hair.  * _hairless_ _(0, -1, 0)_ - Classification for recognizing no hair.  * _beard_ _(0, -1, 0)_ - Classification for recognizing beards.  * _moustache_ _(0, -1, 0)_ - Classification for recognizing moustaches.  * _headpiece_ _(0, -1, 0)_ - Classification for recognizing headpieces.  * _glasses_ _(0, -1, 0)_ - Classification for recognizing glasses.  * _sunglasses_ _(0, -1, 0)_ - Classification for recognizing sunglasses.  * _mask_ _(0, -1, 0)_ - Classification for recognizing medical masks.  * _breast_ _(0, 0, 2)_ - Object that recognizes female breasts. * _vulva_ _(0, 0, 2)_ - Object that recognizes vulvae. * _penis_ _(0, 0, 2)_ - Object that recognizes penises. * _vagina_ _(0, 0, 2)_ - Object that recognizes vaginae. * _buttocks_ _(0, 0, 2)_ - Object that recognizes buttocks. * _anus_ _(0, 0, 2)_ - Object that recognizes ani. * _toy_ _(0, -1, 0)_ - Object that recognizes sex toys. * _oral_ _(0, 0, 2)_ - Object that recognizes oral sex. * _penetration_ _(0, 0, 2)_ - Object that recognizes a sexual penetration penetration. * _illegalSymbols_ _(0, 0, 1)_ - Classification for symbols that are not permitted in Germany.  * _textRecognition_ _(0, 6, 6)_ - Classification for recognizing text occurrences.  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._
   */
  @JsonAdapter(InClassEnum.Adapter.class)
  public enum InClassEnum {
    FACE("face"),
    
    HAND("hand"),
    
    FOOT("foot"),
    
    FOOTWEAR("footwear"),
    
    BREAST("breast"),
    
    VULVA("vulva"),
    
    PENIS("penis"),
    
    VAGINA("vagina"),
    
    BUTTOCKS("buttocks"),
    
    ANUS("anus"),
    
    ORAL("oral"),
    
    PENETRATION("penetration"),
    
    TOY("toy"),
    
    CHILD("child"),
    
    ADULT("adult"),
    
    SENIOR("senior"),
    
    POSE("pose"),
    
    FEMALE("female"),
    
    MALE("male"),
    
    HAIR("hair"),
    
    HAIRLESS("hairless"),
    
    BEARD("beard"),
    
    MOUSTACHE("moustache"),
    
    HEADPIECE("headpiece"),
    
    GLASSES("glasses"),
    
    SUNGLASSES("sunglasses"),
    
    MASK("mask"),
    
    NUDITYCHECK("nudityCheck"),
    
    AGEVERIFICATION("ageVerification"),
    
    AGEESTIMATION("ageEstimation"),
    
    ILLEGALSYMBOLS("illegalSymbols"),
    
    TEXTRECOGNITION("textRecognition"),
    
    ATTRIBUTESCHECK("attributesCheck");

    private String value;

    InClassEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InClassEnum fromValue(String value) {
      for (InClassEnum b : InClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InClassEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InClassEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IN_CLASS = "inClass";
  @SerializedName(SERIALIZED_NAME_IN_CLASS)
  private InClassEnum inClass;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity = 100;

  public static final String SERIALIZED_NAME_DRAW_MODE = "drawMode";
  @SerializedName(SERIALIZED_NAME_DRAW_MODE)
  private Integer drawMode;

  public static final String SERIALIZED_NAME_GREY = "grey";
  @SerializedName(SERIALIZED_NAME_GREY)
  private Integer grey = 127;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private Float scale = 1.0f;


  public INParam inClass(InClassEnum inClass) {
    
    this.inClass = inClass;
    return this;
  }

   /**
   * The classification of the object, that the element refers to. Default parameter values are defined per classification object. The following list contains the default values for &#39;min&#39;, &#39;max&#39; and &#39;drawMode&#39; in order.  * _face_ _(1, 3, 0)_ - Classification for human faces. * _child (*)_ _(0, 0, 6)_ - Recognizes children&#39;s faces. * _adult (*)_ _(0, -1, 0)_ - Recognizes faces of adults that are not considered seniors. * _senior (*)_ _(0, -1, 0)_ - Recognizes faces of seniors. * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. * _female (*)_ _(0, -1, 0)_ - Recognizes female faces.  * _male (*)_ _(0, -1, 0)_ - Recognizes male faces.  * _hand_ _(0, -1, 0)_ - Classification for recognizing hands. * _foot_ _(0, -1, 0)_ - Classification for recognizing feet. * _footwear_ _(0, -1, 0)_ - Classification for recognizing footwear. * _hair_ _(0, -1, 0)_ - Classification for recognizing hair.  * _hairless_ _(0, -1, 0)_ - Classification for recognizing no hair.  * _beard_ _(0, -1, 0)_ - Classification for recognizing beards.  * _moustache_ _(0, -1, 0)_ - Classification for recognizing moustaches.  * _headpiece_ _(0, -1, 0)_ - Classification for recognizing headpieces.  * _glasses_ _(0, -1, 0)_ - Classification for recognizing glasses.  * _sunglasses_ _(0, -1, 0)_ - Classification for recognizing sunglasses.  * _mask_ _(0, -1, 0)_ - Classification for recognizing medical masks.  * _breast_ _(0, 0, 2)_ - Object that recognizes female breasts. * _vulva_ _(0, 0, 2)_ - Object that recognizes vulvae. * _penis_ _(0, 0, 2)_ - Object that recognizes penises. * _vagina_ _(0, 0, 2)_ - Object that recognizes vaginae. * _buttocks_ _(0, 0, 2)_ - Object that recognizes buttocks. * _anus_ _(0, 0, 2)_ - Object that recognizes ani. * _toy_ _(0, -1, 0)_ - Object that recognizes sex toys. * _oral_ _(0, 0, 2)_ - Object that recognizes oral sex. * _penetration_ _(0, 0, 2)_ - Object that recognizes a sexual penetration penetration. * _illegalSymbols_ _(0, 0, 1)_ - Classification for symbols that are not permitted in Germany.  * _textRecognition_ _(0, 6, 6)_ - Classification for recognizing text occurrences.  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._
   * @return inClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "face", value = "The classification of the object, that the element refers to. Default parameter values are defined per classification object. The following list contains the default values for 'min', 'max' and 'drawMode' in order.  * _face_ _(1, 3, 0)_ - Classification for human faces. * _child (*)_ _(0, 0, 6)_ - Recognizes children's faces. * _adult (*)_ _(0, -1, 0)_ - Recognizes faces of adults that are not considered seniors. * _senior (*)_ _(0, -1, 0)_ - Recognizes faces of seniors. * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. * _female (*)_ _(0, -1, 0)_ - Recognizes female faces.  * _male (*)_ _(0, -1, 0)_ - Recognizes male faces.  * _hand_ _(0, -1, 0)_ - Classification for recognizing hands. * _foot_ _(0, -1, 0)_ - Classification for recognizing feet. * _footwear_ _(0, -1, 0)_ - Classification for recognizing footwear. * _hair_ _(0, -1, 0)_ - Classification for recognizing hair.  * _hairless_ _(0, -1, 0)_ - Classification for recognizing no hair.  * _beard_ _(0, -1, 0)_ - Classification for recognizing beards.  * _moustache_ _(0, -1, 0)_ - Classification for recognizing moustaches.  * _headpiece_ _(0, -1, 0)_ - Classification for recognizing headpieces.  * _glasses_ _(0, -1, 0)_ - Classification for recognizing glasses.  * _sunglasses_ _(0, -1, 0)_ - Classification for recognizing sunglasses.  * _mask_ _(0, -1, 0)_ - Classification for recognizing medical masks.  * _breast_ _(0, 0, 2)_ - Object that recognizes female breasts. * _vulva_ _(0, 0, 2)_ - Object that recognizes vulvae. * _penis_ _(0, 0, 2)_ - Object that recognizes penises. * _vagina_ _(0, 0, 2)_ - Object that recognizes vaginae. * _buttocks_ _(0, 0, 2)_ - Object that recognizes buttocks. * _anus_ _(0, 0, 2)_ - Object that recognizes ani. * _toy_ _(0, -1, 0)_ - Object that recognizes sex toys. * _oral_ _(0, 0, 2)_ - Object that recognizes oral sex. * _penetration_ _(0, 0, 2)_ - Object that recognizes a sexual penetration penetration. * _illegalSymbols_ _(0, 0, 1)_ - Classification for symbols that are not permitted in Germany.  * _textRecognition_ _(0, 6, 6)_ - Classification for recognizing text occurrences.  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._")

  public InClassEnum getInClass() {
    return inClass;
  }


  public void setInClass(InClassEnum inClass) {
    this.inClass = inClass;
  }


  public INParam min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * The minimum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.")

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }


  public INParam max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * The maximum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.")

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public INParam severity(Integer severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Set a value to define the severity of a broken rule of the given classification object.
   * minimum: 0
   * maximum: 1000
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Set a value to define the severity of a broken rule of the given classification object.")

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public INParam drawMode(Integer drawMode) {
    
    this.drawMode = drawMode;
    return this;
  }

   /**
   * The draw mode that will be used for the creating the media.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur).
   * minimum: 0
   * maximum: 7
   * @return drawMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The draw mode that will be used for the creating the media.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur).")

  public Integer getDrawMode() {
    return drawMode;
  }


  public void setDrawMode(Integer drawMode) {
    this.drawMode = drawMode;
  }


  public INParam grey(Integer grey) {
    
    this.grey = grey;
    return this;
  }

   /**
   * A grey scale color to use for masking. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white.
   * minimum: 0
   * maximum: 255
   * @return grey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A grey scale color to use for masking. '0' will represent black, while the maximum '255' will be white.")

  public Integer getGrey() {
    return grey;
  }


  public void setGrey(Integer grey) {
    this.grey = grey;
  }


  public INParam scale(Float scale) {
    
    this.scale = scale;
    return this;
  }

   /**
   * Scale of the draw rectangle around the classification object. Specify a value to increase or decrease the size of the border.
   * minimum: 0.5
   * maximum: 2.0
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scale of the draw rectangle around the classification object. Specify a value to increase or decrease the size of the border.")

  public Float getScale() {
    return scale;
  }


  public void setScale(Float scale) {
    this.scale = scale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INParam inParam = (INParam) o;
    return Objects.equals(this.inClass, inParam.inClass) &&
        Objects.equals(this.min, inParam.min) &&
        Objects.equals(this.max, inParam.max) &&
        Objects.equals(this.severity, inParam.severity) &&
        Objects.equals(this.drawMode, inParam.drawMode) &&
        Objects.equals(this.grey, inParam.grey) &&
        Objects.equals(this.scale, inParam.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inClass, min, max, severity, drawMode, grey, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class INParam {\n");
    sb.append("    inClass: ").append(toIndentedString(inClass)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    drawMode: ").append(toIndentedString(drawMode)).append("\n");
    sb.append("    grey: ").append(toIndentedString(grey)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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

}

