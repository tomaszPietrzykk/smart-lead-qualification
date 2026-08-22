package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.infrastructure.api.MessageQualificationResponse;
import tpi.smartleadqualification.infrastructure.api.QualifyMessageRequest;

public interface LeadQualifier {

    MessageQualificationResponse qualifyMessage(QualifyMessageRequest message);

}
