package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.domain.common.ContactFormMessage;

public interface ProcessMessage {

    void execute(ContactFormMessage contactFormMessage);

}