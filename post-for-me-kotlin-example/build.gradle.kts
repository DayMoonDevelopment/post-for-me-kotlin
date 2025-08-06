plugins {
    id("post-for-me.kotlin")
    application
}

dependencies {
    implementation(project(":post-for-me-kotlin"))
}

application {
    // Use `./gradlew :post-for-me-kotlin-example:run` to run `Main`
    // Use `./gradlew :post-for-me-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.post_for_me.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
