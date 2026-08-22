package tpi.smartleadqualification.infrastructure;

import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.ContactFormMessage;
import tpi.smartleadqualification.domain.common.User;

@Service
class RequestMapper {

    ContactFormMessage toMessage(MessageRequest messageRequest) {
        return new ContactFormMessage(new User(messageRequest.username(), messageRequest.email()), messageRequest.content());
    }

}