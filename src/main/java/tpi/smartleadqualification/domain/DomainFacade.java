package tpi.smartleadqualification.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DomainFacade {

    private final QualifyMessageAsLead qualifyMessageAsLead;


    public void processMessage(Message message) {



    }

}