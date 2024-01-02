package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.validation.annotation.Validated;

/**
 * Set
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")


public class Set   {
  @JsonProperty("reps")
  private Integer reps = null;

  @JsonProperty("weight")
  private Integer weight = null;

  public Set reps(Integer reps) {
    this.reps = reps;
    return this;
  }

  /**
   * Amount of repetitions of the exercise during the set
   * @return reps
   **/
  @Schema(description = "Amount of repetitions of the exercise during the set")
  
    public Integer getReps() {
    return reps;
  }

  public void setReps(Integer reps) {
    this.reps = reps;
  }

  public Set weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Amount of added weight to the exercise during the set
   * @return weight
   **/
  @Schema(description = "Amount of added weight to the exercise during the set")
  
    public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
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
