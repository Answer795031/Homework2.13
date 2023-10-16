package pro.sky.homework_2_13.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String calculator(){
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int a, int b) {

        int res = a + b;
        return a + " + " + b + " = " + res;
    }

    public String minus(int a, int b) {
        int res = a - b;
        return a + " - " + b + " = " + res;
    }

    public String multiply(int a, int b) {
        int res = a * b;
        return a + " * " + b + " = " + res;
    }

    public String divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Ошибка! На ноль делить нельзя!");
        } else {
            int res =  a /  b;
            return a + " / " + b + " = " + res;
        }
    }

}