package com.opl.api.dd.controller;

import com.opl.jns.insurance.api.published.publish.claim_status_webhook.*;
import com.opl.jns.utils.common.*;
import lombok.extern.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class Controller {

	@PostMapping(value = "/enrollment", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<CommonResponse> updateDocForQuery(@RequestBody ClaimStatusWebhook request) {
		CommonResponse commonResponse = new CommonResponse();
		return new ResponseEntity<CommonResponse>(commonResponse, HttpStatus.OK);
	}

}
