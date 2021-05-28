package com.example.sparkdemo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class IntNums {

    long sum1;
    public IntNums(long sum1) {
        super();
        this.sum1 = sum1;
    }

    public long getSum1() {
        return sum1;
    }

    public void setSum1(long a) {
        this.sum1=a;

    }


    @Override
    public String toString() {
        return String.format("sum equals", sum1);
    }


}
