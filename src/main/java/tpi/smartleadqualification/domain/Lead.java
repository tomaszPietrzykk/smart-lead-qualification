package tpi.smartleadqualification.domain;

public record Lead(User user, String title, LeadType leadType, UrgencyLevel urgencyLevel, String summary) {

    public enum LeadType {
        DEMO_REQUEST,
        PRICING_INQUIRY,
        PARTNERSHIP,
        SUPPORT,
        OTHER
    }

    public enum UrgencyLevel {
        LOW, MEDIUM, HIGH
    }

}