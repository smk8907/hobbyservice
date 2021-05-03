package com.example.web.hobbyservice.dto;

import com.example.web.hobbyservice.table.Question;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class QuestionDto {
    private int q_id;
    private String q_content;
    private int s_id;

    public Question toEntity() {
        Question build = Question.builder()
            .q_id(q_id)
            .q_content(q_content)
            .s_id(s_id)
            .build();
        return build;
    }

    @Builder
    public QuestionDto(int q_id, String q_content, int s_id) {
        this.q_id = q_id;
        this.q_content = q_content;
        this.s_id = s_id;

    }

}
