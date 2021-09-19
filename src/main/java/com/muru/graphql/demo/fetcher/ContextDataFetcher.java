package com.muru.graphql.demo.fetcher;

import com.muru.graphql.demo.context.MyContext;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.context.DgsContext;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ContextDataFetcher {
    @DgsQuery
    public String withContext(DataFetchingEnvironment dfe) {
        MyContext customContext = DgsContext.getCustomContext(dfe);
        return customContext.getCustomState();
    }

    @DgsQuery
    public String customContextWithReq(DataFetchingEnvironment dfe) {
        MyContext customContext = DgsContext.getCustomContext(dfe);
        String userId = customContext.getWebRequest().getParameter("userId");
        return userId + " - " + customContext.getCustomState();
    }
}
