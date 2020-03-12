package com.example.demo;

/**
 * @author sreekanth
 *
 */
public interface SmsSender {

    void sendSms(SmsRequest smsRequest);

    // or maybe void sendSms(String phoneNumber, String message);
}
