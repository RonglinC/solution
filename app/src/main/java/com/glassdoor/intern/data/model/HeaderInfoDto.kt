/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.LocalDateTime

/**
 * Done: Define the structure of the DTO model based on the server response
 */
@JsonClass(generateAdapter = true)
internal class HeaderInfoDto(
    @Json(name="task")
    val task:String ,
    @Json(name="ItemInfo")
    val items :List<ItemInfoDto> = emptyList(),
    @Json(name="dates")
    // no default value provide for time
    val dates: LocalDateTime
)
