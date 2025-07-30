// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import com.post_for_me.api.models.socialaccounts.SocialAccountCreateAuthUrlParams
import com.post_for_me.api.models.socialaccounts.SocialAccountListParams
import com.post_for_me.api.models.socialaccounts.SocialAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SocialAccountServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountServiceAsync = client.socialAccounts()

        val socialAccount = socialAccountServiceAsync.retrieve("id")

        socialAccount.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountServiceAsync = client.socialAccounts()

        val socialAccount =
            socialAccountServiceAsync.update(
                SocialAccountUpdateParams.builder()
                    .id("id")
                    .externalId("external_id")
                    .username("username")
                    .build()
            )

        socialAccount.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountServiceAsync = client.socialAccounts()

        val socialAccounts =
            socialAccountServiceAsync.list(
                SocialAccountListParams.builder()
                    .addId("string")
                    .addExternalId("string")
                    .limit(0.0)
                    .offset(0.0)
                    .addPlatform("string")
                    .addUsername("string")
                    .build()
            )

        socialAccounts.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun createAuthUrl() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountServiceAsync = client.socialAccounts()

        val response =
            socialAccountServiceAsync.createAuthUrl(
                SocialAccountCreateAuthUrlParams.builder()
                    .platform("platform")
                    .platformData(
                        SocialAccountCreateAuthUrlParams.PlatformData.builder()
                            .bluesky(
                                SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                                    .appPassword("app_password")
                                    .handle("handle")
                                    .build()
                            )
                            .linkedin(
                                SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                                    .connectionType(
                                        SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                            .ConnectionType
                                            .PERSONAL
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun disconnect() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountServiceAsync = client.socialAccounts()

        val response = socialAccountServiceAsync.disconnect("id")

        response.validate()
    }
}
