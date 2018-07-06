package com.kachadi.web.controller;

import com.kachadi.web.dto.ErrorMessageDto;
import com.kachadi.web.domain.ErrorMessage;
import com.kachadi.web.service.ErrorMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * * User: weimeng
 * Date: 2018/3/26 13:41
 */
@Controller
public class ErrorMessageController {

    @Autowired
    private ErrorMessageService service;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {

        return "index";
    }

    @RequestMapping(value = "/addPage", method = RequestMethod.GET)
    public String showAdd() {

        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(ErrorMessageDto errorMessageDto) {

        service.insertOne(errorMessageDto.getCode(), errorMessageDto.getMessage());

        return "redirect:/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {

        List<ErrorMessage> all = service.findAll();
        model.addAttribute("ErrorMessageList", all);

        return "list";
    }

}