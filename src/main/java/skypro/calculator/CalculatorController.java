package skypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.calculator.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String sayHallo() {
        return calculatorService.sayHallo();
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.getDivide(num1, num2);
    }
}
