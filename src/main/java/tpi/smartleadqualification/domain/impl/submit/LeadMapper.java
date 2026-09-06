package tpi.smartleadqualification.domain.impl.submit;

import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Lead;
import tpi.smartleadqualification.domain.common.User;
import tpi.smartleadqualification.infrastructure.api.output.MessageQualificationResponse;

@Service
class LeadMapper {

    Lead toLead(User user, MessageQualificationResponse response) {
        return new Lead(
                user,
                response.title(),
                Lead.LeadType.valueOf(response.leadType()),
                Lead.UrgencyLevel.valueOf(response.urgencyLevel()),
                response.summary()
        );
    }

}