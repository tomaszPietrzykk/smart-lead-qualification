package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.domain.common.ContactFormMessage;
import tpi.smartleadqualification.domain.common.Lead;

import java.util.Optional;

public interface QualifyMessageAsLead {

    Optional<Lead> execute(ContactFormMessage contactFormMessage);

}
