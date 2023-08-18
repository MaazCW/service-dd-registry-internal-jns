package com.opl.api.dd.domain;

import com.opl.jns.utils.constant.*;
import lombok.*;

import javax.persistence.*;
import java.io.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "api_master")
public class ApiMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "api_master_seq_gen")
    @SequenceGenerator(schema = DBNameConstant.JNS_BANK_API, name = "api_master_seq_gen", sequenceName = "api_master_seq_gen", allocationSize = 1)
	private Long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "is_active")
	private Boolean isActive;
}
