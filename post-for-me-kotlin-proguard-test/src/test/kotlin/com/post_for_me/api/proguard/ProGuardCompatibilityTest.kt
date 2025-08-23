// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import com.post_for_me.api.models.socialposts.BlueskyConfigurationDto
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
    fun blueskyConfigurationDtoRoundtrip() {
        val jsonMapper = jsonMapper()
        val blueskyConfigurationDto =
            BlueskyConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia("string")
                .build()

        val roundtrippedBlueskyConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blueskyConfigurationDto),
                jacksonTypeRef<BlueskyConfigurationDto>(),
            )

        assertThat(roundtrippedBlueskyConfigurationDto).isEqualTo(blueskyConfigurationDto)
    }
}
