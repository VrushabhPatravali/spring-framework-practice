package com.pragra.spring.demo.springBasics.aspect.data;

import org.springframework.stereotype.Service;

@Service
public class DataService {

    public int[] getData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}
