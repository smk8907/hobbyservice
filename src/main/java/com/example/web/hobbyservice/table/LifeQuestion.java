/*package com.example.web.hobbyservice.table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LifeQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ql_id;
    private int s_id;

    @Column(length = 100, nullable = false)
    private String ql_title;


    @Column(length = 45, nullable = false)
    private String ql_content1;

    @Column(length = 45, nullable = false)
    private String ql_content2;

    @Column(length = 45, nullable = false)
    private String ql_content3;


    @Builder
    public LifeQuestion(int ql_id, int s_id, String ql_title, String ql_content1, String ql_content2, String ql_content3) {
        this.ql_id = ql_id;
        this.s_id = s_id;
        this.ql_title = ql_title;
        this.ql_content1 = ql_content1;
        this.ql_content2 = ql_content2;
        this.ql_content3 = ql_content3;


    }

}*/
