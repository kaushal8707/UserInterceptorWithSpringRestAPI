package com.home.UserInterceptorWithSpringRestAPI.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/demo1")
public class Demo1RestController
{
    @GetMapping("/demo1")
    public ResponseEntity<String> demo1()
    {
        try{
            return new ResponseEntity<String>("Demo 1",HttpStatus.OK);
        }catch (Exception e)
        {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/demo2")
    public ResponseEntity<String> demo2()
    {
        try{
            return new ResponseEntity<String>("Demo 2",HttpStatus.OK);
        }catch (Exception e)
        {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
}
