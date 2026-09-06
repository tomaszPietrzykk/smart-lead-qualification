package tpi.smartleadqualification.infrastructure.db;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tpi.smartleadqualification.domain.common.User;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
class MessageEntity {

    private final User user;
    private final String messageContent;
    private final LocalDateTime sentAt;

}
