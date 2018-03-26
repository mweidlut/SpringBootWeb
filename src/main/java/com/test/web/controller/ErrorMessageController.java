package com.test.web.controller;

import com.test.web.domain.ErrorMessage;
import com.test.web.service.ErrorMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * * User: weimeng
 * Date: 2018/3/26 13:41
 */
@Controller
public class ErrorMessageController {
    private AtomicInteger counter = new AtomicInteger(1);

    @Autowired
    private ErrorMessageService service;

    @RequestMapping(value = "/insertOne", method = RequestMethod.GET)
    public String insertOne() {
        String code = "00" + counter.getAndIncrement();
        String message = code + "_message";
        service.insertOne(code, message);

        return "success";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {

        List<ErrorMessage> all = service.findAll();
        model.addAttribute("ErrorMessageList", all);

        return "list";
    }

}
