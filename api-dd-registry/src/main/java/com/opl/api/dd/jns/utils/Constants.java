package com.opl.api.dd.jns.utils;

import java.text.*;
import java.util.*;

public class Constants {

	public static final String JNS_PUBLISH_API_DB_PRFX = "PAE"; // PUBLISH API ENGINE
	
	public static final  String ENROLLMENT_APPLICATION_LIST_REQUEST_EXAMPLE ="{\"fromDate\":\"2023-05-15 07:29:45\",\"toDate\":\"2023-05-15 07:29:45\"}";
	public static final  String CLAIM_APPLICATION_LIST_EXAMPLE="{\"claimReferenceId\":0}";

	public static final  String CLAIM_APPLICATION_RESPONSE_EXAMPLE="{\"message\": \"string\",\"data\": {\"urn\": \"string\",\"claimReferenceId\": 0,\"schemeName\": \"string\",\"schemeId\": 0,\"customerAccountNumber\": \"string\",\"customerBankname\": \"Rock Patel\",\"customerIFSC\": \"string\",\"accountHolderName\": \"Rock\",\"dob\": \"2022-01-02\",\"gender\": \"M\",\"cif\": \"string\",\"masterPolicyNumber\": \"545454545\",\"dateOfEnrollment\": \"2023-05-16 09:16:54\",\"bankCode\": \"BOB\",\"branchName\": \"string\",\"firstName\": \"Rajesh\",\"middleName\": \"N\",\"lastName\": \"Patel\",\"fatherHusbandName\": \"RameshBhai\",\"mobileNumber\": \"7878544545\",\"emailID\": \"rock@gmail.com\",\"addressline1\": \"Isanpur\",\"addressline2\": \"Isanpur\",\"pincode\": 385444,\"city\": \"Isanpur\",\"cityLGDCode\": \"string\",\"district\": \"Isanpur\",\"districtLGDCode\": \"string\",\"state\": \"Gujarat\",\"stateLGDCode\": \"string\",\"kycID1\": \"PAN\",\"kycID1number\": \"AAGFV5271N\",\"kycID2\": \"Passport\",\"kycID2number\": \"M65689865\",\"pan\": true,\"panNumber\": \"string\",\"aadhaar\": true,\"aadhaarNumber\": \"string\",\"ckyc\": \"YES\",\"ckycNumber\": \"string\",\"nomineeFirstName\": \"string\",\"nomineeMiddleName\": \"string\",\"nomineeLastName\": \"string\",\"nomineeDateOfBirth\": \"2012-02-22\",\"nomineeMobileNumber\": \"7598898956\",\"nomineeEmailId\": \"rajesh@opl.com\",\"nomineeAddressline1\": \"Isanpur\",\"nomineeAddressline2\": \"Isanpur\",\"nomineePincode\": \"382350\",\"nomineeCity\": \"Ahmedabad\",\"nomineeCityLGDCode\": \"10\",\"nomineeDistrict\": \"Ahmedabad\",\"nomineeDistrictLGDCode\": \"10\",\"nomineeState\": \"Gujarat\",\"nomineeStateLGDCode\": \"10\",\"relationOfNominee\": \"string\",\"correctNomineeFirstName\": \"Rock\",\"correctNomineeFirstName\": \"Rock\",\"correctnomineeMiddleName\": \"M\",\"correctnomineeLastName\": \"Patel\",\"nameofGuardian\": \"string\",\"addressOfGuardian\": \"string\",\"relationShipOfGuardian\": \"string\",\"guardianMobileNumber\": \"7854489625\",\"guardianEmailId\": \"paresh@opl.com\",\"claimantFirstName\": \"string\",\"claimantMiddleName\": \"string\",\"claimantLastName\": \"string\",\"claimantDateOfBirth\": \"2012-02-22\",\"relationOfClaimant\": \"string\",\"claimantMobileNumber\": \"string\",\"claimantKYC1\": \"string\",\"claimantKYCNumber1\": \"string\",\"claimantKYC2\": \"string\",\"claimantKycNumber2\": \"string\",\"dateOfAccident\": \"2012-02-22\",\"timeOfAccident\": \"16:12:10\",\"dayOfAccident\": \"Sunday\",\"placeOfAccident\": \"string\",\"natureOfAccident\": \"string\",\"dateOfDeath\": \"2023-05-16 09:16:54\",\"causeOfDeath\": \"string\",\"causeOfDeathDisability\": \"string\",\"typeOfDisability\": \"string\",\"claimantBankAccount\": \"string\",\"claimantBank\": \"string\",\"claimantIFSC\": \"string\",\"premDebitDate\": \"2012-02-22\",\"premRemitDate\": \"2012-02-22\"},\"status\": 0,\"success\": \"true\"}";

	public static final  String CLAIM_LIST_EXAMPLE="{\"message\": \"string\",\"data\": {\"claimReferenceId\": 0,\"urn\": \"JNS-PMSBY-4-1613\",\"schemeName\": \"PMJJBY\",\"schemeId\": 0},\"status\": 0,\"success\": true}";

	
	public static final  String CLAIM_UPLOAD_REQUEST_EXAMPLE="{\n"
			+ "  \"claimReferenceId\": 0,\n"
			+ "  \"documentId\": [\n"
			+ "    null\n"
			+ "  ]\n"
			+ "}\n"
			+ "";
	
	public static final  String CLAIM_UPLOAD_RESPONSE_EXAMPLE="{\"message\": \"string\",\"data\": {\"claimReferenceId\": 0,\"urn\": \"JNS-XXXXX-0000-00-00000-0000\",\"documentList\": [{\"documentType\": \"string\",\"documentId\": 0,\"contentType\": \"string\",\"document\": [\"string\"],\"message\": \"string\",\"success\": true}]},\"status\": \"200\",\"success\": \"true\"}";
	public static final  String CLAIM_RESPONSE_EXAMPLE="{\"message\":\"String\",\"status\":\"200\",\"success\":\"true\"}";

	public static final  String ENROLLMENT_PLAIN_REQUEST_EXAMPLE="{\"applicationReferenceId\":0}";
	public static final  String CLAIM_PLAIN_REQUEST_EXAMPLE="{\"claimReferenceId\":0,\"urn\":\"JNS-XXXXX-0000-00-00000-0000\",\"claimStatus\":6,\"reason\":\"String\",\"claimId\":\"0\",\"insurerStatus\":\"String\",\"transactionUTR\":\"String\",\"dateOfTransaction\":\"2023-05-16 09:16:54\",\"amountOfTransaction\":100}";
	public static final  String WB_UPDATE_CLAIM_STATUS_PLAIN_REQUEST_EXAMPLE="{\"claimId\":123,\"claimReferenceId\":123456,\"urn\":\"JNS-XXXXX-0000-00-00000-0000\",\"claimStatus\":6,\"message\":\"\",\"remarks\":\"\",\"documents\":[{\"documentId\":132,\"documentType\":\"\",\"contentType\":\"PDF\",\"document\":\"\"}]}";
	public static final  String CLAIM_PLAIN_DE_DUPE_REQUEST_EXAMPLE="{\"claimReferenceId\":123,\"urn\":\"value\",\"hospitalisationDate\":\"value\",\"firNo\":\"value\",\"firDate\":\"value\",\"panchnamaNo\":\"value\",\"panchnamaDate\":\"value\",\"postMortemReportNo\":\"value\",\"postMortemReportDate\":\"value\",\"deathCertificateReportNo\":\"value\",\"deathCertificateReportDate\":\"value\",\"documentReceivingDate\":\"value\"}";
	public static final  String CLAIM_PLAIN_DE_DUPE_SUCCESS_RESPONSE_EXAMPLE="{\"message\":\"Success\",\"success\":true,\"status\":200,\"data\":{\"dedupeCheck\":true,\"isMatchWith\":{\"urn\":\"\",\"intimationDate\":\"\",\"type\":1,\"claimStatus\":1,\"dateOfLoss\":\"\",\"beneficiaryName\":\"{Nominee/Guardian/Claimant Name}\",\"beneficiaryBank\":\"\"}}}";

	public static final  String GET_APPLICATION_PLAIN_RESPONSE_SUCCESS="{\"message\":\"string\",\"data\":[{\"applicationReferenceId\":0,\"urn\":\"JNS-XXXXX-0000-00-00000-0000\",\"schemeName\":\"PMJJBY\",\"schemeId\":0}],\"status\":0,\"success\":true}";
	public static final  String ENROLLMENT_PLAIN_REQUEST_SUCCESS="{\"message\": \"string\",\"data\": {\"accountHolderName\": \"Rock\",\"dob\": \"2022-01-13\",\"gender\": \"M\",\"cif\": \"string\",\"masterPolicyNumber\": \"56556555556\",\"dateOfEnrollment\": \"2023-05-16 09:16:54\",\"bankCode\": \"string\",\"branchName\": \"string\",\"firstName\": \"Rock\",\"middleName\": \"N\",\"lastName\": \"Panchal\",\"fatherHusbandName\": \"RameshBhai\",\"mobileNumber\": \"7569987896\",\"emailId\": \"rock@opl.com\",\"addressline1\": \"Isanpur\",\"addressline2\": \"Isanpur\",\"pincode\": 385445,\"city\": \"Isanpur\",\"cityLGDCode\": \"string\",\"district\": \"Isanpur\",\"districtLGDCode\": \"string\",\"state\": \"Gujarat\",\"stateLGDCode\": \"string\",\"kycID1\": \"PAN\",\"kycID1Number\": \"AAGFV5271N\",\"kycID2\": \"Passport\",\"kycID2Number\": \"M65689865\",\"disabilityStatus\": \"Y\",\"disabilityDetails\": \"stringsssss\",\"pan\": true,\"panNumber\": \"string\",\"aadhaar\": true,\"aadhaarNumber\": \"string\",\"ckyc\": \"YES\",\"ckycNumber\": \"511121\",\"nomineeFirstName\": \"Rajesh\",\"nomineeMiddleName\": \"M\",\"nomineeLastName\": \"Patel\",\"nomineeDateOfBirth\": \"2012-02-22\",\"nomineeMobileNumber\": \"7598898956\",\"nomineeEmailId\": \"rajesh@opl.com\",\"nomineeAddressline1\": \"Isanpur\",\"nomineeAddressline2\": \"Isanpur\",\"nomineePincode\": \"382350\",\"nomineeCity\": \"Ahmedabad\",\"nomineeCityLGDCode\": \"10\",\"nomineeDistrict\": \"Ahmedabad\",\"nomineeDistrictLGDCode\": \"10\",\"nomineeState\": \"Gujarat\",\"nomineeStateLGDCode\": \"10\",\"relationOfNominee\": \"father\",\"nameofGuardian\": \"rock\",\"addressofGuardian\": \"Isanpur\",\"relationshipofGuardian\": \"Son\",\"guardianMobileNumber\": \"7854489625\",\"guardianEmailId\": \"paresh@opl.com\",\"customerAccountNumber\": \"55454545454454\",\"customerIFSC\": \"AAAD0FDFF\",\"nameofInsurer\": \"LIC\",\"insurerCode\": \"string\",\"urn\": \"string\",\"schemeName\": \"string\",\"schemeId\": 0,\"consentforautodebit\": \"Yes\",\"transactionUTR\": \"string\",\"transactionTimeStamp\":\"2023-05-16 09:16:54\",\"transactionAmount\": 0,\"comment\": \"string\",\"bankName\": \"string\",\"ruralUrban\": \"Rural\",\"userId1\": \"1051\",\"userId2\": \"1051\",\"channelId\": \"channel\",\"source\": \"Other channel\",\"transactionType\": \"Endorsement\",\"coi\": {\"documentType\":\"coi\",\"contentType\":\"pdf\",\"document\":\"JVBERi0xLjcKJeLjz9MKNSAwIG9isssaaadadrwreterrtertewwerwrwrwwa\"}},\"status\": 0}";

	public static final String PLAIN_RESPONSE_LBL = "Plain Response";
	public static final String ENCRYPTED_RESPONSE_LBL = "Encrypted response";
    public static final  String WB_PLAIN_RESPONSE_401="{\"message\":\"Unauthorized Request\",\"status\":401,\"success\":false}";
    public static final  String WB_PLAIN_RESPONSE_400="{\"message\":\"It seems that request is not properly formed.\",\"status\":400,\"success\":false}";
	public static final  String PLAIN_RESPONSE_400="{\"message\":\"It seems that request is not properly formed.\",\"data\":{},\"status\":400,\"success\":false}";
	public static final  String DEDUPE_FAILED_PLAIN_RESPONSE_400="{\"message\":\"De-dupe failed reason\",\"status\":\"400\",\"success\":\"true\",\"flag\":false,\"claimReferenceId\":null}";
    public static final  String WIHTOUT_FLAG_PLAIN_RESPONSE_401="{\"message\":\"Unauthorized Request\",\"status\":401,\"success\":false}";
	public static final  String PLAIN_RESPONSE_401="{\"message\":\"Unauthorized Request\",\"status\":401,\"success\":false,\"flag\":false}";
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final String MSG_INVALID_BAD_REQUEST_FOR_PARAM_EMPTY = "Invalid or Bad Request.One or more parameter is empty.";
    public static final String COMMON_DOCUMENT_MESSAGE = "Get Upload Documents Response";
    
    public static final String PLAIN_REQUEST_LBL = "Plain Request";
    public static final String REQUEST_EXAMPLES_DESC = "Request examples";
    public static final String DATE_FORMAT_DESCRIPTION="<u>Date Format should be <b>yyyy-MM-dd HH:mm:ss<b></u>";
    public static final String DATE_FORMAT_DESCRIPTION_FOR_UPDATE_STATUS="<u>Date Format should be <b>yyyy-MM-dd HH:mm:ss<b></u><br><br><b>Reason</b> is mandatory for Queried(7) and Repudiated(8) Claim.<br><br><b>Transaction details(transactionUTR,dateOfTransaction,amountOfTransaction)</b> are mandatory only for Approved(10) Claim.";
    public static final String ENCRYPTED_REQUEST_LBL = "Encrypted Request";
    
    public static final  String ENCRYPTED_REQUEST_EXAMPLE ="{\n \"meta-data\": \"YytjVzZYc0RwNHc5M0pEYitlckdNb0hRTnRkYWVNYzFTRXRhMGV3c1psdVNUUWIwS3BmaU4wejZ3MSs0RjFXRjl1K0JOYXhNWitSVlVMTEhrcGJsR29TWm9WZUFDMUJUaGdZV0o0Um9NajllNGk4ZElWeStLOVBna1l4K0NidFp0QWhCdFlSTXpZbGN0Q0ZaS2tGNUVEOElpVEl3R0QzRm9vMDd3U1kwNzAvNkc1QVdGSG9HWnFVcmhIRVhnUWx3Z0xnT2JrVGVRdTFJdVI0enkxVFk5SkdHZEU3bVZqWnZ6elhqamlVQlRtaHFsclA0K1VEKyt3dWg5czNQUnptRkRTSWorVmZ4c29oaFlueUEyTmhMTXR4Y3k2TmhQSVlBY2l0QmlpMDlLVGtFdDVpZTZURTl3MnkrK0k1TTEwTHRhNGVYZ3hYSkJRT0pRL1kzSk1jTGNsZGVFcCtJQldvbVVLZUFhZnJCTmV5b1lCTk5qcWQ0aWwxUDE4dkl1R1Z4RkIwenlqRUIwUHVIZjN1UDFmWmxDK3lZZGgzQjBIelpqWmx4SDIrYVBqVW16SmZFZ1BqVFcrY29vNWh2N2YzNWJrMzhOaHNMMzBwTlMvRmJOTjc0OU56U29ORVZDVHpRUGpYVUp6S0dMZFFnbUczNmdlODczTit6SVNsZUJkaFlOVkVHaXZkeTVHNm5xZjhQdzV6ZVRKWEFFWlBpRVQ4aXRCRXRhNmFqTjQ1bmxZZzh1ZUtMcFNvMzZJLzJWckRHcCsycHVkcUNrY09PUjErWm1XVWZ6MDI3UURnWlc1bjhoUy9DN001eXNrRGR6OGplMG90L0FUeTZVRjNSN0Z0aHluVS9nZ0VOL0tFdlM3a0tDeG9WTEMxTkVPVkY5aTNOQWZkZHZSdmhGQjQ9OlRPdUM3QUZxOEliMHJSNDRnMkFlMVpqdVlzbjNsYjhUVzNxeCtqRVZZMFM0T1dYRks0WEtsRzNTR0gzbVZtMFRiWjFHc3BWbDlYVzQ0QlM1Q0FqUjh5eVJ2bXBMNytGZU0rZUxYVHJ3RHdjVzgvRXNWclJoUUdHQlR1U2R5cWphY21FMFUrNXRqQ1QzY09uZjYyTENpNmpvK0ZwaElteWQ2S3RUV3RvbGZIU1dHR2I4dFJ0c3NmMUFXa0tDb0R0aHh0U0k0bHpkMlpiOFQvSzlrbmhwQkFGUU0yUlJIR3oxYUtjZnFsNEt3S0F2WUttUno4Y1VyOGtOOXUzaGFieFVsZUVVOVViL3VRTkcvY2p2T2l2MDVtZ29tNkh4S3Q1bG8vVlBxVE9kZUpxcy80Q1NuRWQxUXdScGxSUXJVbllxT2lycGw4MmFoWVFGVVpTdkJ3UkJGU1ViSE5RdXdPamdyMXdkaVV5V2ZkM0p3VURsNy90Z2hBMU5xNFFZalVIekpob3hMV2tlQ2YrbzNEMzV5YlZYcUhSaE83YjMxbHN1N1czU3NPS3F3YTAvbm9SYUZyWWZyaEluL3JBcHpuTnlCZ0lBR1pueGlNTnM3TXgwUDYwdWhIa1l0cHpUUVBqR0k2S1hBRmQrWkoydVZBTFc4NHRuVXZGdWhsQ09ZNGpUZTBabUZjMy9sc1F2UVNFK3JIRS9EK2MvNGFRcXd3MWNEYzhLbVFRdm53MEZ0Kzc0c1Z5d3hiYUlJbHV1aDVBdEpjK2IzOGR\"\n}";
    public static final String ENCRYPTED_RESPONSE ="{\n\"meta-data\": \"YytjVzZYc0RwNHc5M0pEYitlckdNb0hRTnRkYWVNYzFTRXRhMGV3c1psdVNUUWIwS3BmaU4wejZ3MSs0RjFXRjl1K0JOYXhNWitSVlVMTEhrcGJsR29TWm9WZUFDMUJUaGdZV0o0Um9NajllNGk4ZElWeStLOVBna1l4K0NidFp0QWhCdFlSTXpZbGN0Q0ZaS2tGNUVEOElpVEl3R0QzRm9vMDd3U1kwNzAvNkc1QVdGSG9HWnFVcmhIRVhnUWx3Z0xnT2JrVGVRdTFJdVI0enkxVFk5SkdHZEU3bVZqWnZ6elhqamlVQlRtaHFsclA0K1VEKyt3dWg5czNQUnptRkRTSWorVmZ4c29oaFlueUEyTmhMTXR4Y3k2TmhQSVlBY2l0Qmlp\"\n}";

    public static final String STATUS_UPDATE = "Status updated successfully.";

    public static final DateFormat sdf_yyyy_MM_dd_HH_mm_ss_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
    public static final DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

    public static final String COMMON_DATA_MESSAGE = "In Response of API, HTTP status code 200 can be possible in below scenarios for which code will be set in key status :\n" +
            "1. 200 - Success\n" +
            "2. 500 - Internal Server Error\n" +
            "3. 400 - Parameter Missing in Request (Bad Request)\n" +
            "4. 400 - Invalid Application Reference Id  (Bad Request)";
    public static final String COMMON_NOT_ENCRYPTED_MESSAGE = "When encrypted request is not correctly formed";
    public static final String COMMON_UNAUTHORIZED_MESSAGE = "Unauthorised request";

    public static final String STATUS = "status";
    
    public static final String SUCCESS = "Success";

    public static final String FAILED = "Failed";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final long LONG_0 = 0L;
    public static final long LONG_1 = 1L;
    public static final long LONG_2 = 2L;
    public static final long LONG_3 = 3L;
    public static final long LONG_4 = 4L;
    public static final long LONG_5 = 5L;
    public static final long LONG_6 = 6L;
    public static final int INT_0 = 0;
    public static final int INT_1 = 1;
    public static final int INT_6 = 6;
    public static final int INT_14 = 14;
    public static final int INT_2 = 2;
    public static final int INT_3 = 3;
    public static final int INT_4 = 4;

    public static final int ENROLLMENT_STAGE_ID = INT_6;
    public static final int CLAIM_STAGE_ID = INT_14;
    public static final String EXIT_FROM_UPDATE_CLAIM_STATUS = "... .Exit from updateClaimStatus(). ...";
    public static final int ENROLLMENT_TYPE_ID_1 = INT_1;
    public static final String APPLICATION_NOT_FOUND = "Application not found";
    public static final String APPLICATION_NOT_PUSHED = "Application not pushed";
    public static final String APPLICANT = "Applicant";
    public static final String PUSHING_REQUEST_OF_TOTAL_APPLICATION_IN_START_TIME = "pushing request of total application  [{}] in start time [{}]";
    public static final String USER_ORG_ID = "userOrgId ==> {}";
    public static final String STR_6 = "6";
    public static final String STR_7 = "7";
    public static final String STR_8 = "8";
    public static final String STR_401 = "401";
    public static final String STR_400 = "400";
    public static final String STR_200 = "200";
    public static final String STR_5 = "5";
    public static final String STR_4 = "4";
    public static final String STR_3 = "3";
    public static final String STR_1 = "1";
    public static final String STR_2 = "2";
    public static final String REQUEST_MAPPING_V1 = "/v1";
    public static final String EXCEPTION_WHILE_SAVING = "Exception while saving:: ";
    public static final String INVALID_APPLICATION_REF_ID = "Invalid applicationReferenceId";
    public static final String INVALID_CLAIM_REF_ID = "Invalid claimReferenceId";

    public static class MSG {
        public static final String SUCCESS = "Success";
        public static final String FAILED = "Failed";
        public static final String USER_NOT_FOUND = "User Not Found";
        public static final String SMTG_WNT_WNG = "Something Went Wrong.";
        public static final String TOKEN_SAVED_SUCCESS = "Token Saved Successfully";
        public static final String TOKEN_SAVED_FAILED = "Failed to save token";
    }

    public static class ErrorMsg {
    	ErrorMsg(){
    	}

        public static final String FAILED = "failed";
        public static final String SMTG_WNT_WRG = "Something went wrong";

    }

    public enum ClaimStatus {

        RECEIVED_FROM_BANK(6, "Received from bank"),
        CLAIM_REPUDIATED(8, "Claim repudiated"),
        CLAIM_APPROVED(10, "Claim approved"),
        QUERY(7, "Query"),
        IN_PROCESS(11, "In process");
        private Integer id;
        private String description;

        ClaimStatus(Integer status, String description) {
            this.id = status;
            this.description = description;
        }

        public static ClaimStatus getById(Integer id) {
           return Arrays.stream(values()).filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        }


        public Integer getId() {
            return this.id;
        }

        public String getDescription() {
            return this.description;
        }
    }
    public enum APIStatus {

        PENDING(1, "Pending"),
        IN_PROGRESS(2, "In progress"),
        FAILED(3, Constants.FAILED),
        READY(4, "Ready");
        private Integer id;
        private String description;

        APIStatus(Integer status, String description) {
            this.id = status;
            this.description = description;
        }

        public Integer getId() {
            return this.id;
        }

        public String getDescription() {
            return this.description;
        }
    }
}
