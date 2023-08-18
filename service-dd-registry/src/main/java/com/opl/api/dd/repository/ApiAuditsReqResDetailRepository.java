package com.opl.api.dd.repository;

import com.opl.api.dd.domain.*;
import org.springframework.data.jpa.repository.*;

public interface ApiAuditsReqResDetailRepository extends JpaRepository<ApiAuditsReqResDetail,Long> {
	ApiAuditsReqResDetail findFirstByLogIdOrderByIdDesc(Long id);
}
