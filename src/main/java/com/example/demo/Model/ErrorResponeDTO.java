package com.example.demo.Model;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.ArrayList;
import java.util.List;
@ControllerAdvice
public class ErrorResponeDTO {
    private String  error;
    private List<String> detail = new ArrayList<>() ;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getDetail() {
        return detail;
    }

    public void setDetail(List<String> detail) {
        this.detail = detail;
    }
}
