package com.naim.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UuidServiceImpl implements UuidService {

    String uri = "http://uuid-service/generateid";
    public UuidServiceImpl() {
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String generateUUID() throws Exception{
        try {
            ResponseEntity res = restTemplate.getForEntity(uri, String.class);
            return (String) res.getBody();
        } catch (Exception e) {
            throw new MessageException(MessageErrors.MESSAGE_ID_NOT_BE_CREATED);
        }
    }
}
