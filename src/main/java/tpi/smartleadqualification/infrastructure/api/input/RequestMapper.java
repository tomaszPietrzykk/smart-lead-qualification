package tpi.smartleadqualification.infrastructure.api.input;

import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.common.User;

@Service
class RequestMapper {

    Message toMessage(MessageRequest messageRequest) {
        return new Message(
                new User(messageRequest.username(), messageRequest.email(), messageRequest.phoneNumber()),
                messageRequest.content());
    }

}