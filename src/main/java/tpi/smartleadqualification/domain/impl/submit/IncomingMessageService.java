package tpi.smartleadqualification.domain.impl.submit;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.ContactFormMessage;
import tpi.smartleadqualification.domain.submit.ProcessIncomingMessage;
import tpi.smartleadqualification.domain.submit.ProcessLead;
import tpi.smartleadqualification.domain.submit.ProcessMessage;
import tpi.smartleadqualification.domain.submit.QualifyMessageAsLead;

@Service
@RequiredArgsConstructor
class IncomingMessageService implements ProcessIncomingMessage {

    private final QualifyMessageAsLead qualifyMessageAsLead;
    private final ProcessLead processLead;
    private final ProcessMessage processMessage;

    @Override
    public void execute(ContactFormMessage contactFormMessage) {
        qualifyMessageAsLead.execute(contactFormMessage)
                .ifPresentOrElse(
                        processLead::execute,
                        () -> processMessage.execute(contactFormMessage)
                );
    }

}