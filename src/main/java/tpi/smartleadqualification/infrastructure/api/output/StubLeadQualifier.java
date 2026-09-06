package tpi.smartleadqualification.infrastructure.api.output;

import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Lead;
import tpi.smartleadqualification.domain.submit.LeadQualifier;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Profile("stub")
class StubLeadQualifier implements LeadQualifier {

    @Override
    public Optional<MessageQualificationResponse> qualifyMessage(QualifyMessageRequest message) {
        if (message.messages().get(1).content().equals("lead")) {
            return Optional.of(createSampleLead());
        }
        return Optional.empty();
    }

    private static @NonNull MessageQualificationResponse createSampleLead() {
        return new MessageQualificationResponse(
                "Lead",
                Lead.LeadType.PARTNERSHIP.toString(),
                Lead.UrgencyLevel.MEDIUM.toString(),
                "summary"
        );
    }

}