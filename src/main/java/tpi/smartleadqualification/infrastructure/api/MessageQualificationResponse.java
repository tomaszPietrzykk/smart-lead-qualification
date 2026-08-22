package tpi.smartleadqualification.infrastructure.api;

public record MessageQualificationResponse(Boolean isLead, String title, String leadType, String urgencyLevel,
                                           String summary) {
}