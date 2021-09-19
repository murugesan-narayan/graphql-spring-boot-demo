package com.muru.graphql.demo.fetcher;

import com.muru.graphql.demo.generated.types.Person;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.context.DgsContext;
import com.netflix.graphql.dgs.internal.DgsRequestData;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.Optional;

@DgsComponent
public class HelloDataFetcher {

    @DgsQuery
    public String hello(@InputArgument(collectionType = Person.class) List<Person> people) {
        return "Hello To All People In The List !!!";
    }

    @DgsQuery
    public String greet(@InputArgument(collectionType = Person.class) Optional<Person> person) {
        return String.format("Hello %s !!!",
                person.isPresent() ? person.get().getFirstName() : "Guest");
    }

    @DgsQuery
    public String host(@RequestHeader String host) {
        return String.format("Hello Guest, your host from Request Header is %s !!!", host);
    }

    @DgsQuery
    public String customReqHeader(
            @RequestHeader(name="custom-header-test", defaultValue = "Custom-Test-Header-Default")
                    String myCustomReqHeader) {
        return String.format("Hello Guest, your custom header from Request Header is %s !!!", myCustomReqHeader);
    }

    @DgsQuery
    public String cookieWithDefault(
            @CookieValue(name = "my-test-cookie", defaultValue = "My-Test-Cookie-Default")
            String myCookie) {
        return String.format("Your cookie is %s !!!", myCookie);
    }

    @DgsQuery
    public String contentType(DgsDataFetchingEnvironment dfe) {
        DgsRequestData requestData = DgsContext.getRequestData(dfe);
//      System.out.println(requestData.getHeaders());
        return requestData.getHeaders().getContentType().toString();
    }

}
