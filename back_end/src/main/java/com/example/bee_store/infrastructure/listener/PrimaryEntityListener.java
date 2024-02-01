package com.example.bee_store.infrastructure.listener;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

public class PrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryEntity entity) {
        entity.setNgayTao(new Date());
        entity.setNgayCapNhat(new Date());
        entity.setDeleted(true);
        entity.setNguoiCapNhat(null);
        entity.setNguoiTao(null);
    }

    @PreUpdate
    private void onUpdate(PrimaryEntity entity) {
        entity.setNgayCapNhat(new Date());
        entity.setNguoiCapNhat(null);
    }

}
