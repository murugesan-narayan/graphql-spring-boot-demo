package com.muru.graphql.demo.service;

import com.muru.graphql.demo.generated.types.Show;

import java.util.List;

public interface ShowsService {
    List<Show> shows();
}
