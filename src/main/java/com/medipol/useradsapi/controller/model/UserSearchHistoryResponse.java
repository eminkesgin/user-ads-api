package com.medipol.useradsapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSearchHistoryResponse {
    private String userId;
    private List<SearchText> searchTexts;
}
