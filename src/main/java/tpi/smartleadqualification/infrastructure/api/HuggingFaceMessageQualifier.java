package tpi.smartleadqualification.infrastructure.api;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.submit.LeadQualifier;

@Service
@Profile("ai")
@RequiredArgsConstructor
class HuggingFaceMessageQualifier implements LeadQualifier {



    @Override
    public MessageQualificationResponse qualifyMessage(QualifyMessageRequest message) {
        return null;
    }

}