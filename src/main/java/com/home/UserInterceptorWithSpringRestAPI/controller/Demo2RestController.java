package com.home.UserInterceptorWithSpringRestAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/demo2")
public class Demo2RestController
{
    @GetMapping("/hello")
    public ResponseEntity<String> demo1()
    {
        try{
            return new ResponseEntity<String>("Hello",HttpStatus.OK);
        }catch (Exception e)
        {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/hi")
    public ResponseEntity<String> demo2()
    {
        try{
            return new ResponseEntity<String>("Hi",HttpStatus.OK);
        }catch (Exception e)
        {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
}
