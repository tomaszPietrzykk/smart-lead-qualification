package tpi.smartleadqualification.infrastructure.db;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    @Override
    public Optional<UserEntity> findByEmail(String email) {
        return jpaUserRepository.findByEmailAddress(email);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return jpaUserRepository.save(userEntity);
    }

}

interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailAddress(String emailAddress);
}