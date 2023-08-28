package com.example.examboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchParam {
    private String searchType;
    private String searchValue;

    public void setSearchType(String searchType) {
    }

    public void setSearchValue(String searchValue) {
    }
}
