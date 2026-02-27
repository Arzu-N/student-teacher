package com.teacher1.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class BaseEntity {

    @CreatedDate
    @Column(insertable=false)
    private LocalDateTime createdDate;
    @CreatedBy
    @Column(updatable=false)
    private String createdBy;
    @LastModifiedDate
    @Column(insertable=false)
    private LocalDateTime lastModifiedDate;
    @LastModifiedBy
    @Column(insertable=false)
    private String lastModifiedBy;

}
