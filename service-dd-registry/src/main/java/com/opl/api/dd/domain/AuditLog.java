package com.opl.api.dd.domain;

import com.opl.jns.utils.constant.*;
import lombok.*;

import javax.persistence.*;
import java.util.*;

/**
 * @author - Krunal Prajapati
 * @Date - 6/17/2023
 */
@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "audit_log")
@NoArgsConstructor
public class AuditLog {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_log_seq_gen")
        @SequenceGenerator(schema = DBNameConstant.JNS_BANK_API, name = "audit_log_seq_gen", sequenceName = "audit_log_seq_gen", allocationSize = 1)
        private Long id;
        
        @Column(name = "user_id",length = 36,nullable = true)
        private String userId;
        
        @Column(name = "application_id",nullable = true)
        private Long applicationId;
        
        @Column(name = "org_id",nullable = true)
        private Long orgId;
        
        @Column(name = "failure_reason",length = 1000,nullable = true)
        private String failureReason;
        
        @Column(name = "api_id",nullable = false)
        private Integer apiId;
        
        @Column(name = "response_code",nullable = true)
        private Integer responseCode;
        
        @Column(name = "response_message",nullable = true)
        private String responseMessage;
        
        @Column(name = "api_status",nullable = true)
        private Boolean apiStatus;
        
        @Column(name = "created_date",nullable = false)
        private Date createdDate;
        
        @Column(name = "modified_date",nullable = true)
        private Date modifiedDate;
        
        @Column(name = "is_active",nullable = false)
        private Boolean isActive;

        @Column(name = "is_success",nullable = true)
        private Boolean isSuccess;
				

}
