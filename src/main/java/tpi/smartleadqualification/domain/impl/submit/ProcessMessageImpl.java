package tpi.smartleadqualification.domain.impl.submit;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.ContactFormMessage;
import tpi.smartleadqualification.domain.submit.ProcessMessage;

@Service
@RequiredArgsConstructor
class ProcessMessageImpl implements ProcessMessage {


    @Override
    public void execute(ContactFormMessage contactFormMessage) {

    }

}