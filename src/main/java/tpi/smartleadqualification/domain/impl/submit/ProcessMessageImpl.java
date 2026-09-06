package tpi.smartleadqualification.domain.impl.submit;

import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.submit.ProcessMessage;
import tpi.smartleadqualification.domain.submit.SaveMessage;

@Service
@RequiredArgsConstructor
class ProcessMessageImpl implements ProcessMessage {

    private static final Logger LOGGER = LogManager.getLogger();

    private final SaveMessage saveMessage;

    @Override
    public void execute(Message message) {
        LOGGER.info("Saving message to db");
        saveMessage.save(message);
        LOGGER.info("Saved message");
    }

}