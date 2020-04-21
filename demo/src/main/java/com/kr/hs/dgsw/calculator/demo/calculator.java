package com.kr.hs.dgsw.calculator.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {

  @GetMapping("cal")
  public Float calculate(@RequestParam final Float num1, @RequestParam final Float num2, @RequestParam final String op){
    if(op.equals("+")) return (float)(num1+num2);
    else if(op.equals("-")) return (float)(num1-num2);
    else if(op.equals("*")) return num1*num2;
    else if(op.equals("/")) return num1/num2;
    
    return (float)0;
  }

  @GetMapping("cal1/{num3}/{op}/{num4}")
  public Float calculate1(@PathVariable Float num3, @PathVariable String op, @PathVariable Float num4){
    if(op.equals("+")) return (float)(num3+num4);
    else if(op.equals("-")) return (float)(num3-num4);
    else if(op.equals("*")) return num3*num4;
    else if(op.equals("/")) return num3/num4;
    
    return (float)0;
  }


}