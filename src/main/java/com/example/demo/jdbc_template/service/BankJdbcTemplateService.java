package com.example.demo.jdbc_template.service;


import com.example.demo.jdbc_template.repository.BankJdbcTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankJdbcTemplateService {

    private final BankJdbcTemplateRepository bankJdbcTemplateRepository;

    public Object getBankAccounts() {
        return null;
    }
}
