package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "size")
public class Size extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "chieu_dai")
    private Integer chieuDai;
}
