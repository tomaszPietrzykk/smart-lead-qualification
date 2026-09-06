package tpi.smartleadqualification.infrastructure.db;

import org.mapstruct.Mapper;
import tpi.smartleadqualification.domain.common.Message;

import java.util.List;

@Mapper(componentModel = "spring")
interface MessageMapper {

    // TODO:  finish mapstruct implementation
    MessageEntity toEntity(Message message);

    List<Message> toDtos(List<MessageEntity> entities);
}
