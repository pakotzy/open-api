package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse404
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")


public class InlineResponse404   {
  @JsonProperty("textKey")
  private String textKey = null;

  @JsonProperty("reason")
  private String reason = null;

  public InlineResponse404 textKey(String textKey) {
    this.textKey = textKey;
    return this;
  }

  /**
   * Text key used to internationalize and present a human readable message
   * @return textKey
   **/
  @Schema(description = "Text key used to internationalize and present a human readable message")
  
    public String getTextKey() {
    return textKey;
  }

  public void setTextKey(String textKey) {
    this.textKey = textKey;
  }

  public InlineResponse404 reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Immediate root cause of the problem in developer centric format
   * @return reason
   **/
  @Schema(description = "Immediate root cause of the problem in developer centric format")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
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
