package com.example.h2database.entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 建行代扣发起记录表
 */
@Entity
@Data
public class JhDaikouRecord {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String date;
    private String state;
    private String errMsg;

    public JhDaikouRecord() {

    }

    public JhDaikouRecord(String date, String state, String errMsg) {
        this.date = date;
        this.state = state;
        this.errMsg = errMsg;
    }
}