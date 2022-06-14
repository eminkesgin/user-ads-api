package com.medipol.useradsapi.service;

import com.medipol.useradsapi.controller.model.SearchText;
import com.medipol.useradsapi.controller.model.UserSearchHistoryResponse;
import com.medipol.useradsapi.domain.UserSearchHistory;
import com.medipol.useradsapi.repository.UserSearchHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserSearchHistoryService {
    private final UserSearchHistoryRepository repository;


    public UserSearchHistoryResponse getUserAds(String userId) {
        var searchHistories = repository.findAllByUserId(userId);
        var userSearchHistoryMap = searchHistories
                .stream()
                .filter(userSearchHistory -> Objects.nonNull(userSearchHistory) && StringUtils.isNoneEmpty( userSearchHistory.getSearchText()))
                .collect(Collectors.groupingBy(
                        UserSearchHistory::getSearchText,
                        Collectors.mapping(
                                i -> i, Collectors.toList())));

        var searchTexes = userSearchHistoryMap.entrySet().stream().map(i -> {
            var searchText = new SearchText();
            searchText.setSearchText(i.getKey());
            searchText.setCount(i.getValue().size());
            return searchText;
        }).collect(Collectors.toList());



        return new UserSearchHistoryResponse(userId, searchTexes);
    }

    public void addUserSearchHistory(UserSearchHistory userSearchHistory) {
        userSearchHistory.setDate(Instant.now());
        repository.save(userSearchHistory);
    }
}
