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

import org.openapitools.client.models.AccreditationViewModel
import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.AwardViewModel
import org.openapitools.client.models.HospitalEvaluationViewModel
import org.openapitools.client.models.LocationViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.MediaViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 * @param slug 
 * @param description 
 * @param logo 
 * @param overview 
 * @param bedsCount 
 * @param operationsPerYear 
 * @param foundationYear 
 * @param medicalStaffCount 
 * @param doctorCount 
 * @param countryId 
 * @param countryName 
 * @param marketingType 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param timeZone 
 * @param articlesCount 
 * @param packagesCount 
 * @param equipmentsCount 
 * @param reviewsCount 
 * @param departmentsCount 
 * @param specialtiesCount 
 * @param accreditationsCount 
 * @param doctorAffiliationsCount 
 * @param managerAffiliationsCount 
 * @param specialtiesSummerized 
 * @param awards 
 * @param medias 
 * @param accreditations 
 * @param evaluations 
 * @param location 
 * @param auditableEntity 
 */

data class HospitalItemViewModel (
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("description")
    val description: kotlin.String? = null,
    @SerializedName("logo")
    val logo: kotlin.String? = null,
    @SerializedName("overview")
    val overview: kotlin.String? = null,
    @SerializedName("bedsCount")
    val bedsCount: kotlin.Int? = null,
    @SerializedName("operationsPerYear")
    val operationsPerYear: kotlin.Int? = null,
    @SerializedName("foundationYear")
    val foundationYear: kotlin.Int? = null,
    @SerializedName("medicalStaffCount")
    val medicalStaffCount: kotlin.Int? = null,
    @SerializedName("doctorCount")
    val doctorCount: kotlin.Int? = null,
    @SerializedName("countryId")
    val countryId: java.util.UUID? = null,
    @SerializedName("countryName")
    val countryName: kotlin.String? = null,
    @SerializedName("marketingType")
    val marketingType: MarketingType? = null,
    @SerializedName("consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @SerializedName("consultationFee")
    val consultationFee: kotlin.Double? = null,
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null,
    @SerializedName("articlesCount")
    val articlesCount: kotlin.Int? = null,
    @SerializedName("packagesCount")
    val packagesCount: kotlin.Int? = null,
    @SerializedName("equipmentsCount")
    val equipmentsCount: kotlin.Int? = null,
    @SerializedName("reviewsCount")
    val reviewsCount: kotlin.Int? = null,
    @SerializedName("departmentsCount")
    val departmentsCount: kotlin.Int? = null,
    @SerializedName("specialtiesCount")
    val specialtiesCount: kotlin.Int? = null,
    @SerializedName("accreditationsCount")
    val accreditationsCount: kotlin.Int? = null,
    @SerializedName("doctorAffiliationsCount")
    val doctorAffiliationsCount: kotlin.Int? = null,
    @SerializedName("managerAffiliationsCount")
    val managerAffiliationsCount: kotlin.Int? = null,
    @SerializedName("specialtiesSummerized")
    val specialtiesSummerized: kotlin.String? = null,
    @SerializedName("awards")
    val awards: kotlin.collections.List<AwardViewModel>? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<MediaViewModel>? = null,
    @SerializedName("accreditations")
    val accreditations: kotlin.collections.List<AccreditationViewModel>? = null,
    @SerializedName("evaluations")
    val evaluations: kotlin.collections.List<HospitalEvaluationViewModel>? = null,
    @SerializedName("location")
    val location: LocationViewModel? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)

