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

import org.openapitools.client.models.AwardViewModel
import org.openapitools.client.models.DoctorCertificateItemViewModel
import org.openapitools.client.models.DoctorEducationItemViewModel
import org.openapitools.client.models.DoctorPortfolioItemViewModel
import org.openapitools.client.models.DoctorSpecialtyItemViewModel
import org.openapitools.client.models.Gender
import org.openapitools.client.models.UserLanguageViewModel
import org.openapitools.client.models.UserLocationViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param startPracticeDate 
 * @param overview 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param doctorEducations 
 * @param doctorPortfolios 
 * @param doctorSpecialties 
 * @param doctorCertificates 
 * @param doctorAwards 
 * @param firstName 
 * @param lastName 
 * @param phone 
 * @param photo 
 * @param photoThumbnail 
 * @param gender 
 * @param dateOfBirth 
 * @param languages 
 * @param locations 
 */

data class UpdateDoctorCommand (
    @SerializedName("startPracticeDate")
    val startPracticeDate: java.time.LocalDateTime? = null,
    @SerializedName("overview")
    val overview: kotlin.String? = null,
    @SerializedName("consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @SerializedName("consultationFee")
    val consultationFee: kotlin.Double? = null,
    @SerializedName("doctorEducations")
    val doctorEducations: kotlin.collections.List<DoctorEducationItemViewModel>? = null,
    @SerializedName("doctorPortfolios")
    val doctorPortfolios: kotlin.collections.List<DoctorPortfolioItemViewModel>? = null,
    @SerializedName("doctorSpecialties")
    val doctorSpecialties: kotlin.collections.List<DoctorSpecialtyItemViewModel>? = null,
    @SerializedName("doctorCertificates")
    val doctorCertificates: kotlin.collections.List<DoctorCertificateItemViewModel>? = null,
    @SerializedName("doctorAwards")
    val doctorAwards: kotlin.collections.List<AwardViewModel>? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("languages")
    val languages: kotlin.collections.List<UserLanguageViewModel>? = null,
    @SerializedName("locations")
    val locations: kotlin.collections.List<UserLocationViewModel>? = null
)

