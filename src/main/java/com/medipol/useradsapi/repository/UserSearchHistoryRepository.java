package com.medipol.useradsapi.repository;

import com.medipol.useradsapi.domain.UserSearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSearchHistoryRepository extends JpaRepository<UserSearchHistory,Long>{

    List<UserSearchHistory> findAllByUserId(String userId);
}
