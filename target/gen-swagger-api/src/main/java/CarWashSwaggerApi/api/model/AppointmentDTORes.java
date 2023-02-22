/*
 * Carwash service
 * Carwash service. Make appointments on free time slots or the next free time
 *
 * OpenAPI spec version: 1.0.0
 * Contact: kontarook@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package CarWashSwaggerApi.api.model;

import java.util.Objects;
import java.util.Arrays;
import CarWashSwaggerApi.api.model.Assistance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AppointmentDTORes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T00:45:30.896522+03:00[Europe/Moscow]")
public class AppointmentDTORes {
  @JsonProperty("assistances")
  private List<Assistance> assistances = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("tilStart")
  private String tilStart = null;

  @JsonProperty("totalPrice")
  private Double totalPrice = null;

  public AppointmentDTORes assistances(List<Assistance> assistances) {
    this.assistances = assistances;
    return this;
  }

  public AppointmentDTORes addAssistancesItem(Assistance assistancesItem) {
    if (this.assistances == null) {
      this.assistances = new ArrayList<>();
    }
    this.assistances.add(assistancesItem);
    return this;
  }

   /**
   * Get assistances
   * @return assistances
  **/
  @Schema(description = "")
  public List<Assistance> getAssistances() {
    return assistances;
  }

  public void setAssistances(List<Assistance> assistances) {
    this.assistances = assistances;
  }

  public AppointmentDTORes created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(example = "dd-MM-yyyy HH:mm", description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public AppointmentDTORes endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(example = "dd-MM-yyyy HH:mm", description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public AppointmentDTORes id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AppointmentDTORes startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(example = "dd-MM-yyyy HH:mm", description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public AppointmentDTORes tilStart(String tilStart) {
    this.tilStart = tilStart;
    return this;
  }

   /**
   * Get tilStart
   * @return tilStart
  **/
  @Schema(description = "")
  public String getTilStart() {
    return tilStart;
  }

  public void setTilStart(String tilStart) {
    this.tilStart = tilStart;
  }

  public AppointmentDTORes totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @Schema(description = "")
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentDTORes appointmentDTORes = (AppointmentDTORes) o;
    return Objects.equals(this.assistances, appointmentDTORes.assistances) &&
        Objects.equals(this.created, appointmentDTORes.created) &&
        Objects.equals(this.endTime, appointmentDTORes.endTime) &&
        Objects.equals(this.id, appointmentDTORes.id) &&
        Objects.equals(this.startTime, appointmentDTORes.startTime) &&
        Objects.equals(this.tilStart, appointmentDTORes.tilStart) &&
        Objects.equals(this.totalPrice, appointmentDTORes.totalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistances, created, endTime, id, startTime, tilStart, totalPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentDTORes {\n");
    
    sb.append("    assistances: ").append(toIndentedString(assistances)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tilStart: ").append(toIndentedString(tilStart)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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