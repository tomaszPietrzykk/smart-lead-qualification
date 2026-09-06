package tpi.smartleadqualification.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.submit.ProcessIncomingMessage;

@Service
@RequiredArgsConstructor
public class DomainFacade {

    private final ProcessIncomingMessage processIncomingMessage;

    public void processMessage(Message message) {
        processIncomingMessage.execute(message);
    }

}