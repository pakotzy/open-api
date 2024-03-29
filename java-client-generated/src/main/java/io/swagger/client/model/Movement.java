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
 * Information about a specific movement
 */
@Schema(description = "Information about a specific movement")
@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-01-02T14:46:21.450061375Z[GMT]")

public class Movement {
  @SerializedName("id")
  private Object id = null;

  @SerializedName("name")
  private Object name = null;

  @SerializedName("instructions")
  private Object instructions = null;

  public Movement id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the movement
   * @return id
  **/
  @Schema(description = "Unique identifier of the movement")
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public Movement name(Object name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the movement
   * @return name
  **/
  @Schema(description = "The name of the movement")
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public Movement instructions(Object instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Detailed instructions on how to perform the exercise
   * @return instructions
  **/
  @Schema(description = "Detailed instructions on how to perform the exercise")
  public Object getInstructions() {
    return instructions;
  }

  public void setInstructions(Object instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movement movement = (Movement) o;
    return Objects.equals(this.id, movement.id) &&
        Objects.equals(this.name, movement.name) &&
        Objects.equals(this.instructions, movement.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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
