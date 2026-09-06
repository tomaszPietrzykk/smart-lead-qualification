package tpi.smartleadqualification.infrastructure.api.output;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.submit.LeadQualifier;

import java.util.Optional;

@Service
@Profile("ai")
@RequiredArgsConstructor
class HuggingFaceMessageQualifier implements LeadQualifier {



    @Override
    public Optional<MessageQualificationResponse> qualifyMessage(QualifyMessageRequest message) {
        return null;
    }

}