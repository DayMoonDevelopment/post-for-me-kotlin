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
                description.set("The official API for [Post for Me](https://www.postforme.dev/)\n\n## Auth\n\nAuthentication is required for all endpoints. Provide a valid API key as a\nBearer token in the Authorization header. Log in to your\n[Post for Me](https://www.postforme.dev/) account to retrieve your API key.\n\n## Getting Started\n\nTo create a post you first need to get the social accounts you want to post to,\nupload any media for the post (if applicable), and then create the post.\n\nThe below example shows how to create a media post from start to finish.\n\n**Example flow using JavaScript and the Fetch API:**\n\n**Connect an Account**\n\nYou can skip this step if you have accounts connected already, or are connecting\naccounts through the [dashboard](https://app.postforme.dev/)\n\n```js\n//Create an auth URL to redirect the user to in order for them to login and connect their account\nconst socialAccountAuthUrlResponse = await fetch(\n  \"https://api.postforme.dev/v1/social-accounts/auth-url\",\n  {\n    method: \"POST\",\n    headers: {\n      \"Content-Type\": \"application/json\",\n      Authorization: \"Bearer YOUR_API_KEY\",\n    },\n    body: JSON.stringify({\n      platform: \"facebook\",\n    }),\n  }\n);\n\nconst { url } = await socialAccountAuthUrlResponse.json();\n\n//Redirect to the url from the repsone\nconsole.log(url);\n```\n\n**Get Social Accounts**\n\n```js\n// Step 1: Fetch the social accounts you want to post to. In this case we are getting all facebook and instagram accounts.\nconst socialAccountResponse = await fetch(\n  \"https://api.postforme.app/v1/social-accounts?platform=facebook&platform=instagram\",\n  {\n    method: \"GET\",\n    headers: {\n      \"Content-Type\": \"application/json\",\n      Authorization: \"Bearer YOUR_API_KEY\",\n    },\n  }\n);\n\nconst { data } = await socialAccountResponse.json();\n\n//Grab the ids from the social account response\nconst accountIds = data.map((account) => account.id);\n```\n\n**Create the post**\n\n```js\n// Step 2: Create the post using the social account ids\n\n// We are scheduling the post one hour from now\nconst scheduledAt = new Date();\nscheduledAt.setHours(scheduledAt.getHours() + 1);\n\nconst postResponse = await fetch(\"https://api.postforme.dev/v1/social-posts\", {\n  method: \"POST\",\n  headers: {\n    \"Content-Type\": \"application/json\",\n    Authorization: \"Bearer YOUR_API_KEY\",\n  },\n  body: JSON.stringify({\n    caption: \"Hello, world!\",\n    scheduled_at: scheduledAt,\n    media: [\n      {\n        url: \"https://picsum.photos/id/237/1080/1080\",\n      },\n    ],\n    social_accounts: accountIds,\n  }),\n});\n\nconst postData = await postResponse.json();\n```\n\n**Thats It! You have successfully scheduled a post to go out in one hour.**\n\n## Client Libraries\n\nFollow the links below for our official libraries:\n\n[TypeScript](https://www.npmjs.com/package/post-for-me)\n\n[Python](https://pypi.org/project/post-for-me/)\n\n[Ruby](https://rubygems.org/gems/post-for-me)\n\n[Go](https://pkg.go.dev/github.com/DayMoonDevelopment/post-for-me-go)")
                url.set("https://api.postforme.dev/docs")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Post For Me")
                        email.set("postforme@daymoon.dev")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/DayMoonDevelopment/post-for-me-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/DayMoonDevelopment/post-for-me-kotlin.git")
                    url.set("https://github.com/DayMoonDevelopment/post-for-me-kotlin")
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
