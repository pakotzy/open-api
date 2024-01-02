package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Information about completed workout
 */
@Schema(description = "Information about completed workout")
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")


public class Workout   {
  @JsonProperty("startedAt")
  private LocalDateTime startedAt = null;

  @JsonProperty("finishedAt")
  private LocalDateTime finishedAt = null;

  @JsonProperty("restPeriod")
  private Integer restPeriod = null;

  @JsonProperty("exercises")
  private List<Exercise> exercises = null;

  public Workout startedAt(LocalDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Date and time when the workout has been started
   * @return startedAt
   **/
  @Schema(description = "Date and time when the workout has been started", examples = {"2024-01-02T11:40:59.930Z"})
  
    public LocalDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(LocalDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public Workout finishedAt(LocalDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Date and time when the workout has been completed
   * @return finishedAt
   **/
  @Schema(description = "Date and time when the workout has been completed")
  
    public LocalDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(LocalDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public Workout restPeriod(Integer restPeriod) {
    this.restPeriod = restPeriod;
    return this;
  }

  /**
   * Amount of seconds for rest between the exercises
   * @return restPeriod
   **/
  @Schema(description = "Amount of seconds for rest between the exercises")
  
    public Integer getRestPeriod() {
    return restPeriod;
  }

  public void setRestPeriod(Integer restPeriod) {
    this.restPeriod = restPeriod;
  }

  public Workout exercises(List<Exercise> exercises) {
    this.exercises = exercises;
    return this;
  }

  /**
   * A set of actions performed to achieve athletic goals during this specific workout
   * @return exercises
   **/
  @Schema(description = "A set of actions performed to achieve athletic goals during this specific workout")
  
    public List<Exercise> getExercises() {
    return exercises;
  }

  public void setExercises(List<Exercise> exercises) {
    this.exercises = exercises;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workout workout = (Workout) o;
    return Objects.equals(this.startedAt, workout.startedAt) &&
        Objects.equals(this.finishedAt, workout.finishedAt) &&
        Objects.equals(this.restPeriod, workout.restPeriod) &&
        Objects.equals(this.exercises, workout.exercises);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt, finishedAt, restPeriod, exercises);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workout {\n");
    
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    restPeriod: ").append(toIndentedString(restPeriod)).append("\n");
    sb.append("    exercises: ").append(toIndentedString(exercises)).append("\n");
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
