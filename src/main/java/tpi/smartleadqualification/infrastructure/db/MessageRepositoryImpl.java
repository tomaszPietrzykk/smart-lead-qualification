package tpi.smartleadqualification.infrastructure.db;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
class MessageRepositoryImpl implements MessageRepository {

    private final JpaMessageRepository jpaMessageRepository;

    @Override
    public void save(MessageEntity messageEntity) {
        jpaMessageRepository.save(messageEntity);
    }

    @Override
    public List<MessageEntity> findAllMessages() {
        return jpaMessageRepository.findAll();
    }


}

interface JpaMessageRepository extends JpaRepository<MessageEntity, Long> {

}