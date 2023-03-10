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
import CarWashSwaggerApi.api.model.AppointmentDTOReq;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AppointmentOnTimeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T00:45:30.896522+03:00[Europe/Moscow]")
public class AppointmentOnTimeRequest {
  @JsonProperty("appointmentDTO")
  private AppointmentDTOReq appointmentDTO = null;

  @JsonProperty("appointmentTime")
  private String appointmentTime = null;

  public AppointmentOnTimeRequest appointmentDTO(AppointmentDTOReq appointmentDTO) {
    this.appointmentDTO = appointmentDTO;
    return this;
  }

   /**
   * Get appointmentDTO
   * @return appointmentDTO
  **/
  @Schema(description = "")
  public AppointmentDTOReq getAppointmentDTO() {
    return appointmentDTO;
  }

  public void setAppointmentDTO(AppointmentDTOReq appointmentDTO) {
    this.appointmentDTO = appointmentDTO;
  }

  public AppointmentOnTimeRequest appointmentTime(String appointmentTime) {
    this.appointmentTime = appointmentTime;
    return this;
  }

   /**
   * Get appointmentTime
   * @return appointmentTime
  **/
  @Schema(example = "dd-MM-yyyy HH:mm", description = "")
  public String getAppointmentTime() {
    return appointmentTime;
  }

  public void setAppointmentTime(String appointmentTime) {
    this.appointmentTime = appointmentTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentOnTimeRequest appointmentOnTimeRequest = (AppointmentOnTimeRequest) o;
    return Objects.equals(this.appointmentDTO, appointmentOnTimeRequest.appointmentDTO) &&
        Objects.equals(this.appointmentTime, appointmentOnTimeRequest.appointmentTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDTO, appointmentTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentOnTimeRequest {\n");
    
    sb.append("    appointmentDTO: ").append(toIndentedString(appointmentDTO)).append("\n");
    sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
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
