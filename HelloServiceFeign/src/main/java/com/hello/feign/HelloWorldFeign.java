package com.hello.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/4 9:19
 */
@FeignClient(value = "HelloService", fallback = HelloWorldFeignFallback.class)
public interface HelloWorldFeign {

    @RequestMapping(value = "/fib/{fibN}",method = RequestMethod.GET)
    Integer computedFib(@PathVariable("fibN") Integer fibN);


    default int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n - 2);
    }

}
