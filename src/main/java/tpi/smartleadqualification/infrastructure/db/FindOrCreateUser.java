package tpi.smartleadqualification.infrastructure.db;

import tpi.smartleadqualification.domain.common.User;

interface FindOrCreateUser {

    UserEntity execute(User user);

}