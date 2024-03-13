package com.NotifEaze.NotifEaze.mock;


import java.util.HashMap;
import java.util.Map;

public class GupshupMock {
    private static final Map<String, String> SMS_MOCKED_RESPONSES = new HashMap<>();
    private static final Map<String, String> EMAIL_MOCKED_RESPONSES = new HashMap<>();

    private static final Map<String, String> SMS_DELIVERY_STATUS_MOCKED_RESPONSES = new HashMap<>();

    private static final Map<String, String> PN_MOCKED_RESPONSES = new HashMap<>();



    static {

        /*
        {
          "success": true,
          "messageId": "MessageId1",
          "providerResponse": "SMSsentsuccessfully."
        }
         */
        getSmsMockedResponses().put("MessageId1", "{\"success\":true,\"messageId\":\"MessageId1\",\"providerResponse\":\"SMSsentsuccessfully.\"}");

        /*
        {
          "success": false,
          "messageId": "MessageId2",
          "providerResponse": "Network Failure !"
        }
         */
        getSmsMockedResponses().put("MessageId2", "{\"success\":false,\"messageId\":\"MessageId2\",\"providerResponse\":\"NetworkFailure!\"}");


        /*
        {
           "status": "Success"
           "message": "Successfully Sent"
        }
         */
        getSmsDeliveryStatusMockedResponses().put("MessageId1", "{\"status\":\"Success\"\"message\":\"SuccessfullySent\"}");



        /*
        {
           "status": "Failed"
           "message": "Invalid Message Id"
        }
         */
        getSmsDeliveryStatusMockedResponses().put("MessageId2", "{\"status\":\"Failed\"\"message\":\"Invalid Message Id\"}");


        /*
        {
          "status": "success",
          "message": "Notification sent successfully",
          "timestamp": "2023-12-01T12:34:56Z",
          "data": {
            "notification_id": "123456789",
            "recipient": "user123",
            "platform": "iOS",
            }
        }
         */
        PN_MOCKED_RESPONSES.put("FCMToken1", "{\"status\":\"success\",\"message\":\"Notificationsentsuccessfully\",\"timestamp\":\"2023-12-01T12:34:56Z\",\"data\":{\"notification_id\":\"123456789\",\"recipient\":\"user123\",\"platform\":\"iOS\",}}");


        /*
        {
          "status": "error",
          "message": "Failed to send notification",
          "timestamp": "2023-12-01T13:45:00Z",
          "error": {
            "code": "500",
            "details": "Internal server error"
          }
        }
         */
        PN_MOCKED_RESPONSES.put("FCMToken2", "{\"status\":\"error\",\"message\":\"Failedtosendnotification\",\"timestamp\":\"2023-12-01T13:45:00Z\",\"error\":{\"code\":\"500\",\"details\":\"Internalservererror\"}}");


        /*
        {
      "status": "success",
      "message": "Email sent successfully",
      "timestamp": "2023-12-01T14:30:00Z",
      "data": {
        "email_id": "test1@gmail.com",
        "recipient": "user@example.com",
        "subject": "Sample Email Subject"
        }
       }
         */
        EMAIL_MOCKED_RESPONSES.put("Email1", "{\"status\":\"success\",\"message\":\"Emailsentsuccessfully\",\"timestamp\":\"2023-12-01T14:30:00Z\",\"data\":{\"email_id\":\"test1@gmail.com\",\"recipient\":\"user@example.com\",\"subject\":\"SampleEmailSubject\"}}");
    }



	public static Map<String, String> getSmsMockedResponses() {
		return SMS_MOCKED_RESPONSES;
	}



	public static Map<String, String> getSmsDeliveryStatusMockedResponses() {
		return SMS_DELIVERY_STATUS_MOCKED_RESPONSES;
	}
}
