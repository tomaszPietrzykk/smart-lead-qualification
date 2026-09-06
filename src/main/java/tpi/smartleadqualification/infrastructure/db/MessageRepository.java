package tpi.smartleadqualification.infrastructure.db;

import java.util.List;

interface MessageRepository {

    void save(MessageEntity messageEntity);

    // TODO: different parameters in the future? By user / by timestamp / ordered
    List<MessageEntity> findAllMessages();

}