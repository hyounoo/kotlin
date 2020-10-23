/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.ArticleStatus
import org.openapitools.client.models.ArticleTagItemViewModel
import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.MediaViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param title 
 * @param slug 
 * @param description 
 * @param body 
 * @param status 
 * @param marketingType 
 * @param userId 
 * @param userName 
 * @param hospitalId 
 * @param hospitalName 
 * @param hospitalSlug 
 * @param articleTags 
 * @param medias 
 * @param auditableEntity 
 */

data class ArticleItemViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("status")
    val status: ArticleStatus? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("userId")
    val userId: java.util.UUID? = null,
    @SerializedName("userName")
    val userName: kotlin.String? = null,
    @SerializedName("hospitalId")
    val hospitalId: java.util.UUID? = null,
    @SerializedName("hospitalName")
    val hospitalName: kotlin.String? = null,
    @SerializedName("hospitalSlug")
    val hospitalSlug: kotlin.String? = null,
    @SerializedName("articleTags")
    val articleTags: kotlin.collections.List<ArticleTagItemViewModel>? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

