package tpi.smartleadqualification.infrastructure.api.input;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tpi.smartleadqualification.domain.DomainFacade;

@RestController
@RequiredArgsConstructor
@RequestMapping("/smart-lead-qualification")
class ContactFormMessageController {

    private final DomainFacade domainFacade;
    private final RequestMapper requestMapper;

    @PostMapping("/api/v1/messages")
    public ResponseEntity<HttpStatus> postMessage(@RequestBody @Valid MessageRequest messageRequest) {
        domainFacade.processMessage(requestMapper.toMessage(messageRequest));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}