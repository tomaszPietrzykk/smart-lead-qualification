package tpi.smartleadqualification.domain;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class HuggingFaceQualifyMessageAsLead implements QualifyMessageAsLead {

    // todo start from here, create HuggingFaceClient
    private final HuggingFaceClient huggingFaceClient;

    @Override
    public Optional<Lead> execute(Message message) {
        return Optional.empty();
    }

}