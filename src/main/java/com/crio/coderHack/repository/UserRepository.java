package com.crio.coderHack.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.springframework.stereotype.Repository;

import com.crio.coderHack.entity.UserEntity;

@Repository
public class UserRepository {

private List<UserEntity> users;

public UserRepository() {
    users = new ArrayList<>();
}

public List<UserEntity> findAll() {
    Collections.sort(users);
    return users;
}

public UserEntity save(UserEntity userEntity) {
    users.add(userEntity);
    return userEntity;
}

}
