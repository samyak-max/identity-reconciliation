package co.bitespeed.identityreconciliation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdentifyRequest {

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "^[0-9+/-/s()]*$", message = "Invalid phone number format")
    private String phoneNumber;

    public boolean hasAtLeastOneField() {
        return (email != null && !email.trim().isEmpty()) ||
                (phoneNumber != null && !phoneNumber.trim().isEmpty());
    }
}
