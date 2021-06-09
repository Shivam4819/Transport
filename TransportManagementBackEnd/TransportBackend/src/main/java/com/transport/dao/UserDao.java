package com.transport.dao;

import com.transport.entity.UserEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,Integer> {
        UserEntity getByUsername(final @NonNull String username);
}
