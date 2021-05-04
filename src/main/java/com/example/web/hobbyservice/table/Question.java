package com.example.web.hobbyservice.table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*private int q_id;*/
    private int s_id;

    @Column(length = 100, nullable = false)
    private String q_title;


    @Column(length = 45, nullable = false)
    private String q_content1;

    @Column(length = 45, nullable = false)
    private String q_content2;

    @Column(length = 45, nullable = false)
    private String q_content3;


    @Builder
    public Question(/*int q_id,*/ int s_id, String q_title, String q_content1, String q_content2, String q_content3) {
        /*this.q_id = q_id;*/
        this.s_id = s_id;
        this.q_title = q_title;
        this.q_content1 = q_content1;
        this.q_content2 = q_content2;
        this.q_content3 = q_content3;


    }

}
