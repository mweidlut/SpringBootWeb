package com.test.web.service;

import com.test.web.domain.ErrorMessage;
import com.test.web.repo.ErrorMessageRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: weimeng
 * Date: 2018/3/26 13:46
 */
@Service
public class ErrorMessageService {
    private static Logger logger = LoggerFactory.getLogger(ErrorMessageService.class);


    @Autowired
    private ErrorMessageRepo repo;

    public void insertOne(String code, String message) {
        ErrorMessage em = new ErrorMessage(code, message);
        repo.save(em);

        logger.info("insert one error message={}", em);
    }

    public List<ErrorMessage> findAll(){
        return repo.findAll();
    }
}
