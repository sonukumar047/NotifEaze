# NotifEaze

# Notification Integration Service

This Spring Boot application provides a raw framework for integrating with multiple SMS, email, and notification vendors. It defines interfaces for SMS, email, and notification services.

## Project Structure

The project is structured as follows:

- `src/main/java/com/NotifEaze/NotifEaze/service`: Contains interface definitions for SMS, email, and notification services.
- `src/main/java/com/NotifEaze/NotifEaze/service/impl`: Contains sample implementations for SMS, email, and push notifications. (To be created)
- `src/main/java/com/NotifEaze/NotifEaze/controller`: Contains a sample controller for testing the services. (To be created)
- `src/test`: Contains unit tests for the services (not provided in this example). (Optional)
- `src/main/java/com/NotifEaze/NotifEaze/mock`: Contains mock classes providing mocked responses for SMS, email, and push notifications.

## How to Use

To use this framework with specific vendors like Gupshup and Kaylera, you need to implement the corresponding interfaces:

- `EmailService`: Implement this interface to send emails.
- `PushNotificationService`: Implement this interface to send push notifications.
- `SmsService`: Implement this interface to send SMS messages.

Since we are not integrating with Gupshup and Kaylera directly, we can use the provided mock classes to get the response of respective APIs.

## Sample Endpoints

You can use the following sample endpoints to test the services:

- `POST /api/communication/send-sms`: Send an SMS.
- `POST /api/communication/send-email`: Send an email.
- `POST /api/communication/send-notification`: Send a push notification.

## Configuration

You can configure which vendor to route to by implementing your own logic in the service implementations or controller.

## Dependencies

- Java 8
- Spring Boot
- Maven

## Getting Started

1. Clone the repository.
2. Configure the project with your preferred IDE.
3. Implement the necessary service interfaces and logic.
4. Run the application and test the endpoints using a tool like Postman.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
