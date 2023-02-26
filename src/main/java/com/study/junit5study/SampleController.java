package com.study.junit5study;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @GetMapping("/sample/get")
    public String sampleGetMethod() {
        return "get test complete";
    }

    @PostMapping("/sample/post")
    public String samplePostMethod() {
        return "post test complete";
    }

    @GetMapping("/sample/get/{number}")
    public SampleDto getSample(@PathVariable Integer number) {
        SampleDto sampleDto = sampleService.getSample(number);
        return sampleDto;
    }
}
