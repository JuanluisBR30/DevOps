package com.examen.DevOps.application;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.examen.DevOps.domain.dto.BodyDto;
import com.examen.DevOps.domain.dto.MessageDto;

import java.util.List;

@Component
public class DevOpsDevApplication {
private String  KEY_HEADER="X-Parse-REST-API-Key";
    private String  APY_KEY="2f5ae96c-b558-4c7b-a590-a501ae1c3f6c";
    public ResponseEntity getMessage(BodyDto bodyDto, HttpHeaders header){
        MessageDto msg= new MessageDto();
        List<String> headersList =header.get(KEY_HEADER);
        if(headersList != null) {
            if(headersList.get(0).equals(APY_KEY)) {
                msg.setMessage("Hello"+ bodyDto.getTo()+"your message will be send");
            }else {
                msg.setMessage("this tocken is not valid");
                return ResponseEntity
                        .status(HttpStatus.FORBIDDEN)
                        .body(msg);
            }
        }else {
            msg.setMessage("Error tocken is required");

            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body(msg);
        }
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(msg);
    }
}
