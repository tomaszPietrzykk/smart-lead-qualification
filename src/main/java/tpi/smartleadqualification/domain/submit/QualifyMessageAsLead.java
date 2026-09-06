package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.common.Lead;

import java.util.Optional;

public interface QualifyMessageAsLead {

    Optional<Lead> execute(Message message);

}
