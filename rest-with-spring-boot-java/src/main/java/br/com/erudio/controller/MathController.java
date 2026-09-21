package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("sum/{first}/{second}")
    public Double sum(@PathVariable("first") String first, @PathVariable("second") String second)throws Exception{
        if(!isNumeric(first) || !isNumeric(second)) throw new UnsupportedOperationException("Please set a numeric value");

        return convertToDouble(first) + convertToDouble(second);
    }
    @RequestMapping("div/{first}/{second}")
    public Double div(@PathVariable("first") String first,@PathVariable("second") String second) throws Exception{
        if(!isNumeric(first) || !isNumeric(second)) throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(first) / convertToDouble(second);
    }
    @RequestMapping("/mult/{first}/{second}")
    public Double mult(@PathVariable("first") String first, @PathVariable("second") String second) throws Exception{
        if(!isNumeric(first) || !isNumeric(second)) throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(first) * convertToDouble(second);
    }
    private Double convertToDouble(String strNumber)throws Exception{
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }
    private boolean isNumeric(String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }


}
