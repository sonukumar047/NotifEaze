// PushNotificationServiceImpl.java
package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationServiceImpl implements PushNotificationService {

    @Override
    public BasePushNotificationResponse sendNotification(String fcmToken, String message) {
        try {
            Message pushMessage = Message.builder()
                .setToken(fcmToken)
                .putData("message", message)
                .build();

            String response = FirebaseMessaging.getInstance().send(pushMessage);
            System.out.println("Successfully sent message: " + response);
            return new BasePushNotificationResponse(true, "Notification sent successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return new BasePushNotificationResponse(false, "Failed to send notification");
        }
    }
}
