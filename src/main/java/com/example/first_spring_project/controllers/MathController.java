package com.example.first_spring_project.controllers;

import com.example.first_spring_project.services.MathService;
import com.example.first_spring_project.converters.NumberConverter;
import com.example.first_spring_project.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {
    private final MathService mathService = new MathService();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
    public double sum(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
            ) throws UnsupportedMathOperationException {

        validateNumbers(numberOne, numberTwo);

        return mathService.sum(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtract/{numberOne}/{numberTwo}")
    public double subtract(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {

        validateNumbers(numberOne, numberTwo);

        return mathService.subtract(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/pow/{numberOne}/{numberTwo}")
    public double pow(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {

        validateNumbers(numberOne, numberTwo);

        return mathService.pow(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiply/{numberOne}/{numberTwo}")
    public double multiply(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {

        validateNumbers(numberOne, numberTwo);

        return mathService.multiply(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/divide/{numberOne}/{numberTwo}")
    public double divide(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {

        validateNumbers(numberOne, numberTwo);

        return mathService.divide(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    private void validateNumbers(String numberOne, String numberTwo)
    throws UnsupportedMathOperationException {

        if (!NumberConverter.isNumeric(numberOne) ||
                !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException();
        }
    }
}
