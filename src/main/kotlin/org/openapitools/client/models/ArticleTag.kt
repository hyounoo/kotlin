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

import org.openapitools.client.models.Article
import org.openapitools.client.models.Tag

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param articleId 
 * @param article 
 * @param tagId 
 * @param tag 
 * @param order 
 */

data class ArticleTag (
    @SerializedName("articleId")
    val articleId: java.util.UUID? = null,
    @SerializedName("article")
    val article: Article? = null,
    @SerializedName("tagId")
    val tagId: kotlin.String? = null,
    @SerializedName("tag")
    val tag: Tag? = null,
    @SerializedName("order")
    val order: kotlin.Int? = null
)

