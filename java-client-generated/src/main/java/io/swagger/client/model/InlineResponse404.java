/*
 * Gym
 * A set of workout centric endpoints
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.processing.Generated;
import java.io.IOException;
/**
 * InlineResponse404
 */

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-01-02T14:46:21.450061375Z[GMT]")

public class InlineResponse404 {
  @SerializedName("textKey")
  private Object textKey = null;

  @SerializedName("reason")
  private Object reason = null;

  public InlineResponse404 textKey(Object textKey) {
    this.textKey = textKey;
    return this;
  }

   /**
   * Text key used to internationalize and present a human readable message
   * @return textKey
  **/
  @Schema(description = "Text key used to internationalize and present a human readable message")
  public Object getTextKey() {
    return textKey;
  }

  public void setTextKey(Object textKey) {
    this.textKey = textKey;
  }

  public InlineResponse404 reason(Object reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Immediate root cause of the problem in developer centric format
   * @return reason
  **/
  @Schema(description = "Immediate root cause of the problem in developer centric format")
  public Object getReason() {
    return reason;
  }

  public void setReason(Object reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse404 inlineResponse404 = (InlineResponse404) o;
    return Objects.equals(this.textKey, inlineResponse404.textKey) &&
        Objects.equals(this.reason, inlineResponse404.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textKey, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse404 {\n");
    
    sb.append("    textKey: ").append(toIndentedString(textKey)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
