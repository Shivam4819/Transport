package com.transport.dao;

import com.transport.entity.UserEntity;
import com.transport.response.AllUserDataResponse;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
        UserEntity getByUsername(final @NonNull String username);

       // List<AllUserDataResponse> findAll();
}
