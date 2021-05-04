package com.example.web.hobbyservice.dto;

import com.example.web.hobbyservice.table.Question;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class QuestionDto {
  /*  private int q_id;*/
    private int s_id;
    private String q_title;
    private String q_content1;
    private String q_content2;
    private String q_content3;


    public Question toEntity() {
        Question build = Question.builder()
            /*.q_id(q_id)*/
            .s_id(s_id)
            .q_title(q_title)
            .q_content1(q_content1)
            .q_content2(q_content2)
            .q_content3(q_content3)
            .build();
        return build;
    }

    @Builder
    public QuestionDto(/*int q_id,*/ int s_id, String q_title, String q_content1, String q_content2, String q_content3) {
       /* this.q_id = q_id;*/
        this.s_id = s_id;
        this.q_title = q_title;
        this.q_content1 = q_content1;
        this.q_content2 = q_content2;
        this.q_content3 = q_content3;


    }

}
