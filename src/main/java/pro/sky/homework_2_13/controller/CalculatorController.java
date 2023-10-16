package pro.sky.homework_2_13.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.homework_2_13.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler
    public String handleException(RuntimeException e){
        return e.getMessage();
    }

    @GetMapping
    public String calculator(){
        return calculatorService.calculator();
    }

    @GetMapping(path = "plus") // /calculator/plus?num1=5&num2=5
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.plus(a, b);
    }

    @GetMapping(path = "/minus") // /calculator/minus?num1=5&num2=5
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.minus(a, b);
    }

    @GetMapping(path = "/multiply") // /calculator/multiply?num1=5&num2=5
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping(path = "/divide") // /calculator/divide?num1=5&num2=2
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.divide(a, b);
    }
}