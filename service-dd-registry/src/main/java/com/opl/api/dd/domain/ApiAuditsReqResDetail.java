package com.opl.api.dd.domain;

import com.opl.jns.utils.constant.*;
import lombok.*;

import javax.persistence.*;


/**
 * @author - Krunal Prajapati
 * @Date - 6/17/2023
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "audit_log_details")
public class ApiAuditsReqResDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "api_audit_req_res_seq_gen")
    @SequenceGenerator(schema = DBNameConstant.JNS_BANK_API, name = "api_audit_req_res_seq_gen", sequenceName = "api_audit_req_res_seq_gen", allocationSize = 1)
	private Long id;

	@Column(name = "log_id", nullable = false)
	private Long logId;

	@Lob
	@Column(name = "request",  nullable = true)
	private String request;

	@Lob
	@Column(name = "response",  nullable = true)
	private String response;


}
