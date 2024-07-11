package com.eazybytes.accounts.dto;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

// @Data
// @JsonInclude(JsonInclude.Include.NON_NULL)
// public class ErrorResponseDto {
//     private String apiPath;
//     private HttpStatus HttpStatus;
//     private String errorMessage;
//     private LocalDateTime errorTime;
// }

@Data 
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private  String apiPath;

    @Schema(
            description = "Error code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error happened"
    )
    private  String errorMessage;

    @Schema(
            description = "Time representing when the error happened"
    )
    private LocalDateTime errorTime;
    @Schema(
            description = "Lista de errores"
    )
    private Map<String, String> Errors; 

}