package tpi.smartleadqualification.infrastructure.db;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tpi.smartleadqualification.infrastructure.db.entities.LeadEntity;

import java.util.List;

@Getter
@RequiredArgsConstructor
class UserEntity {

    private final String username;
    private final String email;
    private final String phoneNumber;
    private final List<MessageEntity> messages;
    private final List<LeadEntity> leads;

}