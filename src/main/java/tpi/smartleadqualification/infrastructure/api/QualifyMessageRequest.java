package tpi.smartleadqualification.infrastructure.api;

import java.util.List;

public record QualifyMessageRequest(
        String model,
        List<Message> messages
) {

    private static final String SYSTEM_ROLE = "system";
    private static final String USER_ROLE = "user";

    private static final String SYSTEM_PROMPT = """
            You are a lead qualification assistant. Analyze the incoming
            message and determine if it is a qualified sales lead or just a general
            inquiry.
            """;

    public QualifyMessageRequest(String model, String message) {
        this(model, List.of(new Message(SYSTEM_ROLE, SYSTEM_PROMPT), new Message(USER_ROLE, message)));
    }

    public record Message(
            String role,
            String content
    ) {
    }

}