package com.medipol.useradsapi.controller;

import com.medipol.useradsapi.domain.UserAds;
import com.medipol.useradsapi.service.UserAdsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userAds")
public class UserAdsController {

    private final UserAdsService userAdsService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUserAds(@RequestBody UserAds userAds) {
        userAdsService.addUserAds(userAds);
    }

    @GetMapping("/{userId}")
    public List<UserAds> addUserAds(@PathVariable String userId) {
        return userAdsService.getUserAds(userId);
    }
}
