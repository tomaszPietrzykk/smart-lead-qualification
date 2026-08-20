package tpi.smartleadqualification.domain;

import java.util.Optional;

interface QualifyMessageAsLead {

    Optional<Lead> execute(Message message);

}
