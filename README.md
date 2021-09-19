Java DGS Framework example
=====

This repository is an example application for the [DGS Framework](https://netflix.github.io/dgs).
The example is a standalone GraphQL server in Java.

It shows the following features:
* [DataFetchers](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/datafetchers/ShowsDatafetcher.java#L26)
* [Mutations](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/datafetchers/ReviewsDataFetcher.java#L50)
* [DataLoader to prevent the N+1 problem](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/datafetchers/ReviewsDataFetcher.java#L40)
* [Query testing](https://github.com/Netflix/dgs-examples-java/blob/main/src/test/java/com/example/demo/ShowsDatafetcherTest.java#L61)
* [Using a generated Query API](https://github.com/Netflix/dgs-examples-java/blob/main/src/test/java/com/example/demo/ShowsDatafetcherTest.java#L89)
* [File Upload](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/datafetchers/ArtworkUploadDataFetcher.java#L22)
* [Using the Gradle codegen plugin](https://github.com/Netflix/dgs-examples-java/blob/main/build.gradle.kts#L45)
* [A custom instrumentation implementation](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/instrumentation/ExampleTracingInstrumentation.java#L20)
* [Subscriptions](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/datafetchers/ReviewsDataFetcher.java#L60)
* [Testing a subscription](https://github.com/Netflix/dgs-examples-java/blob/main/src/test/java/com/example/demo/ReviewSubscriptionTest.java#L46)
* [Registering an optional scalar from graphql-java](https://github.com/Netflix/dgs-examples-java/blob/main/src/main/java/com/example/demo/scalars/DateTimeScalar.java#L16)


Starting the example
----

The example requires Java 11.
Run the application in an IDE using its main class (Application.java)

Interact with the application using GraphiQL on http://localhost:8080/graphiql.