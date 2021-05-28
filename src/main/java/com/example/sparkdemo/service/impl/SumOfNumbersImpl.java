package com.example.sparkdemo.service.impl;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;



@Service
public class SumOfNumbersImpl implements SumOfNumbers {
    @Autowired
    private JavaSparkContext sc;

    @Override
    public String readTxt()   {
       JavaRDD<String> lines = sc.textFile("in/prime_nums.text");
        JavaRDD<String> numbers = lines.flatMap(line -> Arrays.asList(line.split("\\s+")).iterator());

        JavaRDD<String> validNumbers = numbers.filter(number -> !number.isEmpty());

        JavaRDD<Integer> intNumbers = validNumbers.map(number -> Integer.valueOf(number));
        long sum=intNumbers.reduce((x, y) -> x + y);
        String g="sum is : "+sum;
        return g;
    }



}













