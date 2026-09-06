package tpi.smartleadqualification.domain.impl.submit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.common.Lead;
import tpi.smartleadqualification.domain.submit.LeadQualifier;
import tpi.smartleadqualification.domain.submit.QualifyMessageAsLead;
import tpi.smartleadqualification.infrastructure.api.output.QualifyMessageRequest;

import java.util.Optional;

@Service
class QualifyMessageAsLeadImpl implements QualifyMessageAsLead {

    private final String model;

    private final LeadQualifier leadQualifier;
    private final LeadMapper leadMapper;

    public QualifyMessageAsLeadImpl(@Value("huggingface.model") String model, LeadQualifier leadQualifier, LeadMapper leadMapper) {
        this.model = model;
        this.leadQualifier = leadQualifier;
        this.leadMapper = leadMapper;
    }

    @Override
    public Optional<Lead> execute(Message message) {
        return leadQualifier
                .qualifyMessage(new QualifyMessageRequest(model, message.content()))
                .map(messageQualificationResponse ->
                        leadMapper.toLead(message.user(), messageQualificationResponse)
                );
    }

}