package com.opl.api.dd.repository;

import io.swagger.annotations.*;
import org.springframework.data.jpa.repository.*;

public interface ApiResponseRepository extends JpaRepository<ApiResponse,Long>{

	ApiResponse findByApiIdAndOrgId(Long apiId, Long orgId);

}
