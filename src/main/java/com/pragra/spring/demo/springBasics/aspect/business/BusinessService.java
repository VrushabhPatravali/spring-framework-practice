package com.pragra.spring.demo.springBasics.aspect.business;

import com.pragra.spring.demo.springBasics.aspect.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService {

    @Autowired
    private DataService dataService;

    public int getMaxValue() {
        return Arrays.stream(dataService.getData()).max().orElse(0);
    }
}
