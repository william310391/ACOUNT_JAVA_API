package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "customer", description = "Schaema to hold customer and Account information")
public class CustomerDto {
    private Long customerId;
    @Schema(description = "Name of the custormer", example = "Eazy Bytes")
    @NotEmpty(message ="Name can not be a null or empty" )
    @Size(min = 5, max = 30 , message = "The legth of the customer name should be between 5 and 30")
    private String name;

    @Schema(description = "Email address of the custormer", example = "tutor@eazybytes.com")
    @NotEmpty(message ="Email Address can not be a null or empty" )
    @Email(message = "Email address shold be a valid value")
    private String email;
    @Schema(description = "Mobile Number of the custormer", example = "934301348")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    
    @Schema(description = "Account details of the custormer")
    private AccountsDto account;
}
