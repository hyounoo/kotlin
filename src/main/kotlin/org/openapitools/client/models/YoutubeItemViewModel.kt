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

import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.YoutubeTagItemViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param title 
 * @param slug 
 * @param description 
 * @param url 
 * @param youtubeTags 
 * @param marketingType 
 * @param auditableEntity 
 */

data class YoutubeItemViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("title")
    val title: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("url")
    val url: kotlin.String? = null,
    @SerializedName("youtubeTags")
    val youtubeTags: kotlin.collections.List<YoutubeTagItemViewModel>? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)
