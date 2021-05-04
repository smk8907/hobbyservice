package com.example.web.hobbyservice.dto;

import com.example.web.hobbyservice.table.Survey;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SurveyDto {
    private int s_id;
    private String interest;



    public Survey toEntity() {
        Survey build = Survey.builder()
                .s_id(s_id)
                .interest(interest)
                .build();
        return build;
    }

    @Builder
    public SurveyDto(int s_id, String interest) {
        this.s_id = s_id;
        this.interest = interest;

    }

}
