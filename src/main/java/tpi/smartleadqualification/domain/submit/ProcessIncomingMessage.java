package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.domain.common.ContactFormMessage;

public interface ProcessIncomingMessage {

    void execute(ContactFormMessage contactFormMessage);

}
