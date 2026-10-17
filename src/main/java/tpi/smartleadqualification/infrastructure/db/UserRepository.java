package tpi.smartleadqualification.infrastructure.db;

import java.util.Optional;

interface UserRepository {

    Optional<UserEntity> findByEmail(String email);

    UserEntity save(UserEntity userEntity);

}
