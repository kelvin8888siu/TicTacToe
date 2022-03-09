package com.example.TicTacToe.Model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse201
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-09T10:21:32.498099-05:00[America/Toronto]")

public class InlineResponse201   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("username")
  private String username;

  public InlineResponse201 id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The Player ID.
   * @return id
  */
  @ApiModelProperty(value = "The Player ID.")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse201 username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The user name.
   * @return username
  */
  @ApiModelProperty(value = "The user name.")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.id, inlineResponse201.id) &&
        Objects.equals(this.username, inlineResponse201.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

