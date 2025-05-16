package iuh.fit.user_service.service;

public interface EmailService {
    void sendEmail(String to, String subject, String content);
}
