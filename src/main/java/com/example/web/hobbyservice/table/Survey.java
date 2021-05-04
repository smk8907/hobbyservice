package com.example.web.hobbyservice.table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int s_id;

    @Column(length = 45, nullable = false)
    private String interest;

    @Builder
    public Survey(int s_id, String interest) {
        this.s_id = s_id;
        this.interest = interest;

    }

}