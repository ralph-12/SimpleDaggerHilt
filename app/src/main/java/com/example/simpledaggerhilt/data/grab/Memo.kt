package com.example.simpledaggerhilt.data.grab

data class Memo(
    val categoryIdx: Int,
    val categoryName: String,
    val contentType: String,
    val coverURL: String,
    val createdTime: Long,
    val cropCount: Int,
    val description: String,
    val descriptionForList: String,
    val descriptionHTML: String,
    val descriptionText: String,
    val encIdx: String,
    val gmttimeZone: String,
    val height: Int,
    val idx: Int,
    val imgRaw: String,
    val imgRawHTTPS: String,
    val imgThumb: String,
    val imgThumbHTTPS: String,
    val isLike: Int,
    val isOpen: String,
    val isOpenAuth: Int,
    val likeCount: Int,
    val orgFileName: String,
    val pdfFilePath: String,
    val rawText: Any,
    val regrabCount: Int,
    val replyCount: Int,
    val resolutionX: Int,
    val resolutionY: Int,
    val shareCount: Int,
    val simpleCreated: String,
    val siteUrl: String,
    val siteUrlTitle: String,
    val tagList: List<Any>,
    val type: String,
    val updated: Long,
    val useCover: String,
    val user: User,
    val width: Int,
    val x1: Int,
    val x2: Int,
    val y1: Int,
    val y2: Int
)