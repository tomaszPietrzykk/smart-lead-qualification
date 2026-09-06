package tpi.smartleadqualification.infrastructure.api.output;

public record MessageQualificationResponse(String title, String leadType, String urgencyLevel,
                                           String summary) {
}