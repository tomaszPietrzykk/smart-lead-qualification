package tpi.smartleadqualification.infrastructure.db;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tpi.smartleadqualification.domain.common.Message;

import java.util.List;

@Mapper(componentModel = "spring")
interface MessageMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "sentAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "user", source = "userEntity")
    MessageEntity toEntity(Message message, UserEntity userEntity);

    Message toDto(MessageEntity entity);

    List<Message> toDtos(List<MessageEntity> entities);

}