/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.data.mapper

import com.glassdoor.intern.data.model.HeaderInfoDto
import com.glassdoor.intern.data.model.ItemInfoDto
import com.glassdoor.intern.domain.model.HeaderInfo
import com.glassdoor.intern.domain.model.ItemInfo
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import javax.inject.Inject

internal class HeaderInfoMapper @Inject constructor() {

    /**
     * DONE: Complete the transformation logic
     */
    fun toDomain(header: HeaderInfoDto, items: List<ItemInfoDto>): HeaderInfo = with(header) {
        HeaderInfo(
            task=task,
            items = items.map(::toDomain),
            dates = LocalDateTime.now()
        )
    }

    private fun toDomain(item: ItemInfoDto): ItemInfo = with(item) {
        ItemInfo(
            title = title,
            description = description,
            imageUrl = imageUrl,
            timestampInSeconds = Instant.parse(timestamp).epochSecond,
        )
    }
}
