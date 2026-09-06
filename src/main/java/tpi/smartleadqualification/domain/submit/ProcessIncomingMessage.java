package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.domain.common.Message;

public interface ProcessIncomingMessage {

    void execute(Message message);

}
