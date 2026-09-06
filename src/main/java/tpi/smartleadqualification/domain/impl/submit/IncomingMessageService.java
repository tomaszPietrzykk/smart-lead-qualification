package tpi.smartleadqualification.domain.impl.submit;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
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

    @Async // TODO: enable async
    @Override
    public void execute(Message message) {
        qualifyMessageAsLead.execute(message)
                .ifPresentOrElse(
                        processLead::execute,
                        () -> processMessage.execute(message)
                );
    }

}