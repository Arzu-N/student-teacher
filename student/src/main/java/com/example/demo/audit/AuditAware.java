package com.example.demo.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("AuditAware")
public class AuditAware implements AuditorAware<String> {
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("admin" );
    }
}
