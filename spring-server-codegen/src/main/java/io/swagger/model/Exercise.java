package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Objects;

/**
 * Action performed to achieve athletic goals with its properties
 */
@Schema(description = "Action performed to achieve athletic goals with its properties")
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")


public class Exercise   {
  @JsonProperty("movement")
  private Movement movement = null;

  @JsonProperty("restPeriod")
  private Integer restPeriod = null;

  @JsonProperty("sets")
  private List<Set> sets = null;

  @JsonProperty("comment")
  private String comment = null;

  public Exercise movement(Movement movement) {
    this.movement = movement;
    return this;
  }

  /**
   * Get movement
   * @return movement
   **/
  @Schema(description = "")
  
    @Valid
    public Movement getMovement() {
    return movement;
  }

  public void setMovement(Movement movement) {
    this.movement = movement;
  }

  public Exercise restPeriod(Integer restPeriod) {
    this.restPeriod = restPeriod;
    return this;
  }

  /**
   * Get restPeriod
   * @return restPeriod
   **/
  @Schema(description = "")
  
    public Integer getRestPeriod() {
    return restPeriod;
  }

  public void setRestPeriod(Integer restPeriod) {
    this.restPeriod = restPeriod;
  }

  public Exercise sets(List<Set> sets) {
    this.sets = sets;
    return this;
  }

  /**
   * List of attemps performing the exercise
   * @return sets
   **/
  @Schema(description = "List of attemps performing the exercise")
  
    public List<Set> getSets() {
    return sets;
  }

  public void setSets(List<Set> sets) {
    this.sets = sets;
  }

  public Exercise comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Feelings noticed after completion of a movement
   * @return comment
   **/
  @Schema(description = "Feelings noticed after completion of a movement")
  
    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exercise exercise = (Exercise) o;
    return Objects.equals(this.movement, exercise.movement) &&
        Objects.equals(this.restPeriod, exercise.restPeriod) &&
        Objects.equals(this.sets, exercise.sets) &&
        Objects.equals(this.comment, exercise.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movement, restPeriod, sets, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exercise {\n");
    
    sb.append("    movement: ").append(toIndentedString(movement)).append("\n");
    sb.append("    restPeriod: ").append(toIndentedString(restPeriod)).append("\n");
    sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
