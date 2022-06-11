package com.medipol.useradsapi.controller;

import com.medipol.useradsapi.controller.model.UserSearchHistoryResponse;
import com.medipol.useradsapi.domain.UserSearchHistory;
import com.medipol.useradsapi.service.UserSearchHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-search-history")
public class UserSearchHistoryController {

    private final UserSearchHistoryService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUserSearchHistory(@RequestBody UserSearchHistory userSearchHistory) {
        service.addUserSearchHistory(userSearchHistory);
    }

    @GetMapping("/{userId}")
    public UserSearchHistoryResponse getUserSearchHistoryByUserId(@PathVariable String userId) {
        return service.getUserAds(userId);
    }
}
