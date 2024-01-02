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
 * Set
 */

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-01-02T14:46:21.450061375Z[GMT]")

public class Set {
  @SerializedName("reps")
  private Object reps = null;

  @SerializedName("weight")
  private Object weight = null;

  public Set reps(Object reps) {
    this.reps = reps;
    return this;
  }

   /**
   * Amount of repetitions of the exercise during the set
   * @return reps
  **/
  @Schema(description = "Amount of repetitions of the exercise during the set")
  public Object getReps() {
    return reps;
  }

  public void setReps(Object reps) {
    this.reps = reps;
  }

  public Set weight(Object weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Amount of added weight to the exercise during the set
   * @return weight
  **/
  @Schema(description = "Amount of added weight to the exercise during the set")
  public Object getWeight() {
    return weight;
  }

  public void setWeight(Object weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Set set = (Set) o;
    return Objects.equals(this.reps, set.reps) &&
        Objects.equals(this.weight, set.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reps, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Set {\n");
    
    sb.append("    reps: ").append(toIndentedString(reps)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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