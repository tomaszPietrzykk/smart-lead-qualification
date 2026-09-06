package tpi.smartleadqualification.infrastructure.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.submit.SaveMessage;
import tpi.smartleadqualification.domain.view.FindMessages;

import java.util.List;

@Service
@RequiredArgsConstructor
class MessageService implements SaveMessage, FindMessages {

    private final MessageMapper messageMapper;
    private final MessageRepository messageRepository;

    @Override
    public void save(Message message) {
        messageRepository.save(messageMapper.toEntity(message));
    }

    @Override
    public List<Message> findAll() {
        return messageMapper.toDtos(messageRepository.findAllMessages());
    }

}