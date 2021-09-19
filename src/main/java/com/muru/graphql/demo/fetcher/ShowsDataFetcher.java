package com.muru.graphql.demo.fetcher;

import com.muru.graphql.demo.generated.types.Show;
import com.muru.graphql.demo.service.ShowsService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ShowsDataFetcher {
    private final ShowsService showsService;

    public ShowsDataFetcher(ShowsService showsService) {
        this.showsService = showsService;
    }

    /**
     * This data fetcher resolves the shows field on Query.
     * It uses an @InputArgument to get the titleFilter from the Query if one is defined.
     */
    @DgsQuery
    public List<Show> shows(@InputArgument("titleFilter") String titleFilter) {
        if (titleFilter == null) {
            return showsService.shows();
        }

        return showsService.shows().stream().filter(s -> s.getTitle().contains(titleFilter)).collect(Collectors.toList());
    }
}
