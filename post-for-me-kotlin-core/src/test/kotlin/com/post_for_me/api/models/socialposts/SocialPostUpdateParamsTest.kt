// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.post_for_me.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostUpdateParamsTest {

    @Test
    fun create() {
        SocialPostUpdateParams.builder()
            .id("id")
            .createSocialPost(
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
                                        CreateSocialPost.AccountConfiguration.Configuration
                                            .Placement
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
                        PlatformConfigurationsDto.builder()
                            .bluesky(
                                BlueskyConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        BlueskyConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .facebook(
                                FacebookConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        FacebookConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(FacebookConfigurationDto.Placement.REELS)
                                    .build()
                            )
                            .instagram(
                                InstagramConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addCollaborator("string")
                                    .addMedia(
                                        InstagramConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(InstagramConfigurationDto.Placement.REELS)
                                    .build()
                            )
                            .linkedin(
                                LinkedinConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        LinkedinConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .pinterest(
                                PinterestConfigurationDto.builder()
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .link("link")
                                    .addMedia(
                                        PinterestConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .threads(
                                ThreadsConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        ThreadsConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(ThreadsConfigurationDto.Placement.REELS)
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
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
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
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .x(
                                TwitterConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        TwitterConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .youtube(
                                YoutubeConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        YoutubeConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .title("title")
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SocialPostUpdateParams.builder()
                .id("id")
                .createSocialPost(
                    CreateSocialPost.builder().caption("caption").addSocialAccount("string").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SocialPostUpdateParams.builder()
                .id("id")
                .createSocialPost(
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
                                            CreateSocialPost.AccountConfiguration.Configuration
                                                .Placement
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
                            PlatformConfigurationsDto.builder()
                                .bluesky(
                                    BlueskyConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            BlueskyConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .facebook(
                                    FacebookConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            FacebookConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(FacebookConfigurationDto.Placement.REELS)
                                        .build()
                                )
                                .instagram(
                                    InstagramConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addCollaborator("string")
                                        .addMedia(
                                            InstagramConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(InstagramConfigurationDto.Placement.REELS)
                                        .build()
                                )
                                .linkedin(
                                    LinkedinConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            LinkedinConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .pinterest(
                                    PinterestConfigurationDto.builder()
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .link("link")
                                        .addMedia(
                                            PinterestConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .threads(
                                    ThreadsConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            ThreadsConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(ThreadsConfigurationDto.Placement.REELS)
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
                                        .addMedia(
                                            TiktokConfiguration.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
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
                                        .addMedia(
                                            TiktokConfiguration.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .x(
                                    TwitterConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            TwitterConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .youtube(
                                    YoutubeConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            YoutubeConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .title("title")
                                        .build()
                                )
                                .build()
                        )
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                        CreateSocialPost.AccountConfiguration.Configuration
                                            .Placement
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
                        PlatformConfigurationsDto.builder()
                            .bluesky(
                                BlueskyConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        BlueskyConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .facebook(
                                FacebookConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        FacebookConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(FacebookConfigurationDto.Placement.REELS)
                                    .build()
                            )
                            .instagram(
                                InstagramConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addCollaborator("string")
                                    .addMedia(
                                        InstagramConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(InstagramConfigurationDto.Placement.REELS)
                                    .build()
                            )
                            .linkedin(
                                LinkedinConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        LinkedinConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .pinterest(
                                PinterestConfigurationDto.builder()
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .link("link")
                                    .addMedia(
                                        PinterestConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .threads(
                                ThreadsConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        ThreadsConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(ThreadsConfigurationDto.Placement.REELS)
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
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
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
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .x(
                                TwitterConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        TwitterConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .youtube(
                                YoutubeConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        YoutubeConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .title("title")
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SocialPostUpdateParams.builder()
                .id("id")
                .createSocialPost(
                    CreateSocialPost.builder().caption("caption").addSocialAccount("string").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateSocialPost.builder().caption("caption").addSocialAccount("string").build()
            )
    }
}
