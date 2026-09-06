package tpi.smartleadqualification.infrastructure.db;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tpi.smartleadqualification.domain.common.User;

@Getter
@RequiredArgsConstructor
class LeadEntity {

    private final User user;
    private final String title;
    private final LeadType leadType;
    private final UrgencyLevel urgencyLevel;
    private final String summary;

    enum LeadType {
        DEMO_REQUEST,
        PRICING_INQUIRY,
        PARTNERSHIP,
        SUPPORT,
        OTHER
    }

    enum UrgencyLevel {
        LOW, MEDIUM, HIGH
    }

}