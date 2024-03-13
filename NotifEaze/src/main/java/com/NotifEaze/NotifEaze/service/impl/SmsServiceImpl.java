package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.service.SmsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SmsServiceImpl implements SmsService {

    private Map<String, Boolean> sentMessages = new HashMap<>();
    private Map<String, Boolean> deliveryStatus = new HashMap<>();

    @Override
    public BaseSmsResponse sendSms(String phoneNumber, String message) {
        String messageId = generateMessageId();
        sentMessages.put(messageId, true);

        return new BaseSmsResponse(true, "SMS sent successfully");
    }

    @Override
    public SmsDeliveryStatus checkDeliveryStatus(String messageId) {
        Boolean delivered = deliveryStatus.getOrDefault(messageId, false);

        return new SmsDeliveryStatus(delivered, delivered ? "SMS delivered successfully" : "SMS not delivered");
    }

    private String generateMessageId() {
        return String.valueOf(System.currentTimeMillis());
    }
}
