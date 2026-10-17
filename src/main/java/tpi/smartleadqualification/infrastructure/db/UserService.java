package tpi.smartleadqualification.infrastructure.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tpi.smartleadqualification.domain.common.User;

@Service
@RequiredArgsConstructor
class UserService implements FindOrCreateUser {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserEntity execute(User user) {
        return userRepository.findByEmail(user.emailAddress()).orElseGet(() -> {
            var newUser = userMapper.toEntity(user);
            return userRepository.save(newUser);
        });
    }
}
