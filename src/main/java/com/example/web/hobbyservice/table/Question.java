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
    private int q_id;

    @Column(length = 100, nullable = false)
    private String q_content;

    @Column
    private int s_id;

    @Builder
    public Question(int q_id, String q_content, int s_id) {
        this.q_id = q_id;
        this.q_content = q_content;
        this.s_id = s_id;

    }

}
