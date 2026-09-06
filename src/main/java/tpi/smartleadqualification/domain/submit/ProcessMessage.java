package tpi.smartleadqualification.domain.submit;

import tpi.smartleadqualification.domain.common.Message;

public interface ProcessMessage {

    void execute(Message message);

}