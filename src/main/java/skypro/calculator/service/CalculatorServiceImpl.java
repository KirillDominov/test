package skypro.calculator.service;

import org.springframework.stereotype.Service;
import skypro.calculator.exception.NotEnoughArgumentException;
import skypro.calculator.exception.ZeroDivideException;
import skypro.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String sayHallo() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int getSum(int num1, int num2) {
        if (num1==null || num2==null){
            throw new NotEnoughArgumentException("один из двух параметров (или оба) не введены")
        }
        return num1 + num2;
    }

    @Override
    public int getMinus(int num1, int num2) {
        if (num1==null || num2==null){
            throw new NotEnoughArgumentException("один из двух параметров (или оба) не введены")
        }
        return num1 - num2;
    }

    @Override
    public int getMultiply(int num1, int num2) {
        if (num1==null || num2==null){
            throw new NotEnoughArgumentException("один из двух параметров (или оба) не введены")
        }
        return num1 * num2;
    }

    @Override
    public int getDivide(int num1, int num2) {
        if (num1==null || num2==null){
            throw new NotEnoughArgumentException("один из двух параметров (или оба) не введены")
        }
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ZeroDivideException("На ноль делить нельзя");
        }
    }
}