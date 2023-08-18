package com.opl.api.dd.domain;

import com.opl.jns.utils.constant.*;
import lombok.*;

import javax.persistence.*;
import java.io.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "api_status_master")
public class ApiStatusMasterV3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "api_status_master_seq_gen")
    @SequenceGenerator(schema = DBNameConstant.JNS_BANK_API, name = "api_status_master_seq_gen", sequenceName = "api_status_master_seq_gen", allocationSize = 1)
	private Long id;
	
	@Column(name = "description")
	private String description;
	
}
