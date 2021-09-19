package com.muru.graphql.demo.context;

import com.netflix.graphql.dgs.context.DgsCustomContextBuilderWithRequest;
import org.jetbrains.annotations.Nullable;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyContextWithReqBuilder implements DgsCustomContextBuilderWithRequest<MyContext> {

    @Override
    public MyContext build(@Nullable Map<String, ?> map,
                           @Nullable HttpHeaders httpHeaders,
                           @Nullable WebRequest webRequest) {
//        System.out.println("MyContextWithReqBuilder...");
        return new MyContext(map, httpHeaders, webRequest);
    }
}
