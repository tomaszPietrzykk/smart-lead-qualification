package tpi.smartleadqualification.infrastructure.db;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.submit.SaveMessage;
import tpi.smartleadqualification.domain.view.FindMessages;

import java.util.List;

@Service
@RequiredArgsConstructor
class MessageService implements SaveMessage, FindMessages {

    private final FindOrCreateUser findOrCreateUser;
    private final MessageMapper messageMapper;
    private final MessageRepository messageRepository;

    @Override
    @Transactional
    public void save(Message message) {
        var userEntity = findOrCreateUser.execute(message.user());
        messageRepository.save(messageMapper.toEntity(message, userEntity));
    }

    @Override
    public List<Message> findAll() {
        return messageMapper.toDtos(messageRepository.findAllMessages());
    }

}