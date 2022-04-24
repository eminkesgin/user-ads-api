package com.medipol.useradsapi.repository;

import com.medipol.useradsapi.domain.UserAds;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAdsRepository  extends JpaRepository<UserAds,Long>{

    List<UserAds> findAllByUserId(String userId);
}
