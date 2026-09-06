package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.infrastructure.api.output.MessageQualificationResponse;
import tpi.smartleadqualification.infrastructure.api.output.QualifyMessageRequest;

import java.util.Optional;

public interface LeadQualifier {

    Optional<MessageQualificationResponse> qualifyMessage(QualifyMessageRequest message);

}
