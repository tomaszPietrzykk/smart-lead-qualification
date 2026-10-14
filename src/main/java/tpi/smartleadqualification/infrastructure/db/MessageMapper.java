package tpi.smartleadqualification.infrastructure.db;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tpi.smartleadqualification.domain.common.Message;
import tpi.smartleadqualification.domain.common.User;

import java.util.List;

@Mapper(componentModel = "spring")
interface MessageMapper {

    @Mapping(target = "sentAt", expression = "java(java.time.LocalDateTime.now())")
    MessageEntity toEntity(Message message);

    Message toDto(MessageEntity entity);

    List<Message> toDtos(List<MessageEntity> entities);

    UserEntity toEntity(User user);

    User toDto(UserEntity entity);

}