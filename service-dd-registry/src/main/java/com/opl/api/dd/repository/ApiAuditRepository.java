package com.opl.api.dd.repository;

import com.opl.api.dd.domain.*;
import org.springframework.data.jpa.repository.*;

public interface ApiAuditRepository extends JpaRepository<AuditLog,Long> {
	AuditLog findFirstByIdOrderByIdDesc(Long id);
}
