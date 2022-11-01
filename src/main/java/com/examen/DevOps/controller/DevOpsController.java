package com.examen.DevOps.controller;

import com.examen.DevOps.domain.dto.MessageDto;
import com.examen.DevOps.domain.dto.BodyDto;
import com.examen.DevOps.application.DevOpsDevApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/DevOps")
public class DevOpsController {
    @Autowired
    private DevOpsDevApplication devOpsDevApplication;

    @PostMapping()
    public ResponseEntity getDevOps(@RequestBody BodyDto bodyDto, @RequestHeader HttpHeaders header){
        return  devOpsDevApplication.getMessage(bodyDto,header);
    }
}
