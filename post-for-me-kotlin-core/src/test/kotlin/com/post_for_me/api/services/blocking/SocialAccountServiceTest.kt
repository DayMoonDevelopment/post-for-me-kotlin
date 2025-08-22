// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.blocking

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.models.socialaccounts.SocialAccountCreateAuthUrlParams
import com.post_for_me.api.models.socialaccounts.SocialAccountListParams
import com.post_for_me.api.models.socialaccounts.SocialAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SocialAccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountService = client.socialAccounts()

        val socialAccount = socialAccountService.retrieve("id")

        socialAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountService = client.socialAccounts()

        val socialAccount =
            socialAccountService.update(
                SocialAccountUpdateParams.builder()
                    .id("id")
                    .externalId("external_id")
                    .username("username")
                    .build()
            )

        socialAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountService = client.socialAccounts()

        val socialAccounts =
            socialAccountService.list(
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

    @Disabled("Prism tests are disabled")
    @Test
    fun createAuthUrl() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountService = client.socialAccounts()

        val response =
            socialAccountService.createAuthUrl(
                SocialAccountCreateAuthUrlParams.builder()
                    .platform("platform")
                    .externalId("external_id")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun disconnect() {
        val client =
            PostForMeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialAccountService = client.socialAccounts()

        val response = socialAccountService.disconnect("id")

        response.validate()
    }
}
