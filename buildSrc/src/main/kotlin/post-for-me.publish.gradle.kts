plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Post for Me API")
                description.set("The official API for [Post for Me](https://www.postforme.dev/)")
                url.set("https://www.github.com/stainless-sdks/post-for-me-kotlin")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Post For Me")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/post-for-me-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/post-for-me-kotlin.git")
                    url.set("https://github.com/stainless-sdks/post-for-me-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
