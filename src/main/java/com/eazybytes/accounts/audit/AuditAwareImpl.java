package com.eazybytes.accounts.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String>{

    /**
     * Retunrs the current auditor of the applicatiom
     * 
     * @return the current auditor
     */
    @Override
    public Optional<String> getCurrentAuditor(){
        return Optional.of("ACCOUNTS_MS");
    }
    
}
