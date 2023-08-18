package com.opl.client.download;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.opl.jns.insurance.api.published.UpdateAppClaimRequest;
import com.opl.jns.insurance.api.published.publish.claim_status_webhook.ClaimStatusWebhook;
import com.opl.jns.published.utils.common.CommonResponse;
import com.opl.jns.utils.common.OPLUtils;

@Slf4j
public class DownloadClient {


	private static final String IS_DECRYPT = "isDecrypt";
	public static final String REQUEST_HEADER_USERNAME = "user-name";
	public static final String REQUEST_HEADER_API_KEY = "api-key";
	public static final String PUBLISHED_REQ_AUTH = "ZHAyOWhWNXhGK2o4MEg4NiS5WwUVUKNXy82ZixoEYXo";


	private String downloadUrl;
	private RestTemplate restTemplate;

	public DownloadClient(String webHookBaseUrl) {
		this.downloadUrl = webHookBaseUrl;
		restTemplate = new RestTemplate();

	}
	
	 public static void setClient(HttpHeaders headers) {
	        headers.set(OPLUtils.REQUEST_HEADER_AUTHENTICATE, OPLUtils.REQUEST_HEADER_AUTHENTICATE_VALUE);
	        headers.set(IS_DECRYPT, OPLUtils.REQUEST_HEADER_AUTHENTICATE_VALUE);
	        headers.add("Accept", "application/json");
	    }

//
//	public CommonResponse updateClaimStatusToBankByInsurer(UpdateAppClaimRequest updateAppClaimRequest,HttpServletRequest httpServletRequest) {
//		String url = downloadUrl.concat(UPDATE_CLAIM_STATUS_TO_BANK_BY_INSURER);
////		String url = "http://localhost:8063/wb/jns/web/updateClaimStatusToBankByInsurer";
//		try {
//			HttpHeaders headers = new HttpHeaders();
//            headers.set("req_auth", "true");
//            headers.set(IS_DECRYPT, "true");
//			String username = httpServletRequest.getHeader(REQUEST_HEADER_USERNAME);
//			String apiKey = httpServletRequest.getHeader(REQUEST_HEADER_API_KEY);
//			headers.set(REQUEST_HEADER_USERNAME, username);
//			headers.set(REQUEST_HEADER_API_KEY, apiKey);
//			headers.set(PUBLISHED_REQ_AUTH, "true");
//            setClient(headers);
//            headers.setContentType(MediaType.APPLICATION_JSON);
//			HttpEntity<UpdateAppClaimRequest> entity = new HttpEntity<>(updateAppClaimRequest, headers);
//			return restTemplate.exchange(url, HttpMethod.POST, entity, CommonResponse.class).getBody();
//		} catch (Exception e) {
//			logger.error("Exception While calling  updateClaimStatusToBankByInsurer Api :: ", e);
//            return null;
//		}
//	}

}
