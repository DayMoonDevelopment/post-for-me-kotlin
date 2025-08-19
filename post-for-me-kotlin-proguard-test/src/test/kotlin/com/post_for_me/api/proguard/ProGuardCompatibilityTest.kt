// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import com.post_for_me.api.models.socialposts.CreateSocialPost
import com.post_for_me.api.models.socialposts.TiktokConfiguration
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/post-for-me-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = PostForMeOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.media()).isNotNull()
        assertThat(client.socialPosts()).isNotNull()
        assertThat(client.socialPostResults()).isNotNull()
        assertThat(client.socialAccounts()).isNotNull()
    }

    @Test
    fun createSocialPostRoundtrip() {
        val jsonMapper = jsonMapper()
        val createSocialPost =
            CreateSocialPost.builder()
                .caption("caption")
                .addSocialAccount("string")
                .addAccountConfiguration(
                    CreateSocialPost.AccountConfiguration.builder()
                        .configuration(
                            CreateSocialPost.AccountConfiguration.Configuration.builder()
                                .allowComment(true)
                                .allowDuet(true)
                                .allowStitch(true)
                                .addBoardId("string")
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .link("link")
                                .addMedia("string")
                                .placement(
                                    CreateSocialPost.AccountConfiguration.Configuration.Placement
                                        .REELS
                                )
                                .privacyStatus("privacy_status")
                                .title("title")
                                .build()
                        )
                        .socialAccountId("social_account_id")
                        .build()
                )
                .externalId("external_id")
                .isDraft(true)
                .addMedia(
                    CreateSocialPost.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .platformConfigurations(
                    CreateSocialPost.PlatformConfigurations.builder()
                        .bluesky(
                            CreateSocialPost.PlatformConfigurations.Bluesky.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia("string")
                                .build()
                        )
                        .facebook(
                            CreateSocialPost.PlatformConfigurations.Facebook.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia("string")
                                .placement(
                                    CreateSocialPost.PlatformConfigurations.Facebook.Placement.REELS
                                )
                                .build()
                        )
                        .instagram(
                            CreateSocialPost.PlatformConfigurations.Instagram.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addCollaborator("string")
                                .addMedia("string")
                                .placement(
                                    CreateSocialPost.PlatformConfigurations.Instagram.Placement
                                        .REELS
                                )
                                .build()
                        )
                        .linkedin(
                            CreateSocialPost.PlatformConfigurations.Linkedin.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia("string")
                                .build()
                        )
                        .pinterest(
                            CreateSocialPost.PlatformConfigurations.Pinterest.builder()
                                .addBoardId("string")
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .link("link")
                                .addMedia("string")
                                .build()
                        )
                        .threads(
                            CreateSocialPost.PlatformConfigurations.Threads.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia("string")
                                .placement(
                                    CreateSocialPost.PlatformConfigurations.Threads.Placement.REELS
                                )
                                .build()
                        )
                        .tiktok(
                            TiktokConfiguration.builder()
                                .allowComment(true)
                                .allowDuet(true)
                                .allowStitch(true)
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .addMedia("string")
                                .privacyStatus("privacy_status")
                                .title("title")
                                .build()
                        )
                        .tiktokBusiness(
                            TiktokConfiguration.builder()
                                .allowComment(true)
                                .allowDuet(true)
                                .allowStitch(true)
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .addMedia("string")
                                .privacyStatus("privacy_status")
                                .title("title")
                                .build()
                        )
                        .x(
                            CreateSocialPost.PlatformConfigurations.X.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia("string")
                                .build()
                        )
                        .youtube(
                            CreateSocialPost.PlatformConfigurations.Youtube.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia("string")
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCreateSocialPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createSocialPost),
                jacksonTypeRef<CreateSocialPost>(),
            )

        assertThat(roundtrippedCreateSocialPost).isEqualTo(createSocialPost)
    }
}
