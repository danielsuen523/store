package com.danielsuen.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // only is loaded when used
public class HeavyResource {
    public HeavyResource() {
        System.out.println("heavy resource created");
    }
}
