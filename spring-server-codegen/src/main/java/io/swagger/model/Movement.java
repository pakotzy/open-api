package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Information about a specific movement
 */
@Schema(description = "Information about a specific movement")
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-02T13:12:44.972642873Z[GMT]")


public class Movement   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("instructions")
  private String instructions = null;

  public Movement id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the movement
   * @return id
   **/
  @Schema(description = "Unique identifier of the movement")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Movement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the movement
   * @return name
   **/
  @Schema(description = "The name of the movement")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Movement instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Detailed instructions on how to perform the exercise
   * @return instructions
   **/
  @Schema(description = "Detailed instructions on how to perform the exercise")
  
    public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
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
