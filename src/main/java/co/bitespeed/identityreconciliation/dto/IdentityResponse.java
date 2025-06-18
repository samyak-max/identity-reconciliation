package co.bitespeed.identityreconciliation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IdentityResponse {

    @JsonProperty("contact")
    private ContactInfo contactInfo;

    public IdentityResponse(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    @Getter
    @Setter
    public static class ContactInfo {
        private Long primaryContactId;
        private List<String> emails;
        private List<String> phoneNumbers;
        private List<Long> secondaryContactIds;

        public ContactInfo(Long primaryContactId, List<String> emails,
                           List<String> phoneNumbers, List<Long> secondaryContactIds) {
            this.primaryContactId = primaryContactId;
            this.emails = emails;
            this.phoneNumbers = phoneNumbers;
            this.secondaryContactIds = secondaryContactIds;
        }
    }
}


