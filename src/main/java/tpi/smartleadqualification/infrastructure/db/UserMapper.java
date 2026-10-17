package tpi.smartleadqualification.infrastructure.db;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tpi.smartleadqualification.domain.common.User;

@Mapper(componentModel = "spring")
interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "messages", ignore = true)
    UserEntity toEntity(User user);

}
