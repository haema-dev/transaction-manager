package com.example.demo.jdbc_template.controller;

import com.example.demo.jdbc_template.service.BankJdbcTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //spring-boot-starter-web
@RequiredArgsConstructor // Lombok
public class BankJdbcTemplateController {

    private final BankJdbcTemplateService bankJdbcTemplateService;

    @GetMapping("/jdbcTemplate")
    public ResponseEntity<?> jdbcTemplate() {
        return ResponseEntity.ok(bankJdbcTemplateService.getBankAccounts());
    }
}
