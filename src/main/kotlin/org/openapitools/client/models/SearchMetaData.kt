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


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param pageCount 
 * @param totalItemCount 
 * @param pageNumber 
 * @param pageSize 
 */

data class SearchMetaData (
    @SerializedName("pageCount")
    val pageCount: kotlin.Int? = null,
    @SerializedName("totalItemCount")
    val totalItemCount: kotlin.Int? = null,
    @SerializedName("pageNumber")
    val pageNumber: kotlin.Int? = null,
    @SerializedName("pageSize")
    val pageSize: kotlin.Int? = null
)

