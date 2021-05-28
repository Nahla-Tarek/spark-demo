package com.example.sparkdemo.controller;
import com.example.sparkdemo.model.IntNums;
import com.example.sparkdemo.service.impl.SumOfNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class SumOfNumbersController {
    @Autowired
    private SumOfNumbers sumofnumbers;

    @GetMapping("/Sum")
    public String readTxt()  {
           return  this.sumofnumbers.readTxt();
    }


}


