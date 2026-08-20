package tpi.smartleadqualification.infrastructure;

import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.Message;

@Service
class RequestMapper {

    Message toMessage(MessageRequest messageRequest) {
        return new Message(messageRequest.username(), messageRequest.content());
    }

}