package com.eazybytes.message.functions;

import com.eazybytes.message.dto.AccountsMsgDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {

    private static final Logger log = LoggerFactory.getLogger(MessageFunctions.class);

    @Bean
    public Function<AccountsMsgDto, AccountsMsgDto> email() {
        return accountMsgDto-> {
            log.info("Sending email with the details :  {}", accountMsgDto.toString());
            return accountMsgDto;
        };
    }

    @Bean
    public Function<AccountsMsgDto, Long> sms() {
        return accountMsgDto-> {
            log.info("Sending sms with the details :  {}", accountMsgDto.toString());
            return accountMsgDto.accountNumber();
        };
    }
}
