package com.medipol.useradsapi.service;

import com.medipol.useradsapi.domain.UserAds;
import com.medipol.useradsapi.repository.UserAdsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserAdsService {
    private final UserAdsRepository userAdsRepository;

    public void addUserAds(UserAds userAds) {
        userAds.setDate(Instant.now());
        userAdsRepository.save(userAds);
    }

    public List<UserAds> getUserAds(String userId) {
       return userAdsRepository.findAllByUserId(userId);
       // return userAdsRepository.findAll();
    }
}
