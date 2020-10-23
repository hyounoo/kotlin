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
package org.openapitools.client.apis

import org.openapitools.client.models.HospitalSpecialtiesViewModel
import org.openapitools.client.models.HospitalSpecialtyViewModel
import org.openapitools.client.models.MarketingType
import org.openapitools.client.models.UpdateHospitalSpecialtySequenceCommand

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class HospitalSpecialtiesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * Delete hospitalSpecialty.
    * Sample request:        DELETE /api/v1/hospitals/1/specialties/1
    * @param hospitalId  
    * @param specialtyId  
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdDelete(hospitalId: java.util.UUID, specialtyId: java.util.UUID) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/hospitals/{hospitalId}/specialties/{specialtyId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"specialtyId"+"}", "$specialtyId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Create hospitalSpecialty.
    * Sample request:        POST /api/v1/hospitals/1/specialties/1
    * @param hospitalId  
    * @param specialtyId  
    * @return HospitalSpecialtyViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdSpecialtiesSpecialtyIdPost(hospitalId: java.util.UUID, specialtyId: java.util.UUID) : HospitalSpecialtyViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/hospitals/{hospitalId}/specialties/{specialtyId}".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"specialtyId"+"}", "$specialtyId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<HospitalSpecialtyViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as HospitalSpecialtyViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Update hospitalSpecialty sequence.
    * Sample request:        PUT /api/v1/hospitals/1/specialtysequence      {          \&quot;specialtyType\&quot;: \&quot;Endocrinology\&quot;,          \&quot;hospitalSpecialtySequence\&quot;: [14, 30, 5, 7]      }
    * @param hospitalId  
    * @param specialtyTypeId  
    * @param updateHospitalSpecialtySequenceCommand  (optional)
    * @return kotlin.Boolean
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsHospitalIdSpecialtysequencePut(hospitalId: java.util.UUID, specialtyTypeId: java.util.UUID, updateHospitalSpecialtySequenceCommand: UpdateHospitalSpecialtySequenceCommand?) : kotlin.Boolean {
        val localVariableBody: kotlin.Any? = updateHospitalSpecialtySequenceCommand
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/v1/hospitals/{hospitalId}/specialtysequence".replace("{"+"hospitalId"+"}", "$hospitalId").replace("{"+"SpecialtyTypeId"+"}", "$specialtyTypeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Boolean>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get all hospitalSpecialties.
    * Sample request:        GET /api/v1/hospitals/specialties
    * @param hospitalId  (optional)
    * @param hospitalName  (optional)
    * @param specialtyId  (optional)
    * @param specialtyName  (optional)
    * @param specialtyTypeId  (optional)
    * @param marketingType  (optional)
    * @param created  (optional)
    * @param page  (optional)
    * @param limit  (optional)
    * @param lastRetrieved  (optional)
    * @param current  (optional)
    * @return HospitalSpecialtiesViewModel
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV1HospitalsSpecialtiesGet(hospitalId: java.util.UUID?, hospitalName: kotlin.String?, specialtyId: java.util.UUID?, specialtyName: kotlin.String?, specialtyTypeId: java.util.UUID?, marketingType: MarketingType?, created: java.time.LocalDateTime?, page: kotlin.Int?, limit: kotlin.Int?, lastRetrieved: java.time.LocalDateTime?, current: kotlin.Boolean?) : HospitalSpecialtiesViewModel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (hospitalId != null) {
                    put("HospitalId", listOf(hospitalId.toString()))
                }
                if (hospitalName != null) {
                    put("HospitalName", listOf(hospitalName.toString()))
                }
                if (specialtyId != null) {
                    put("SpecialtyId", listOf(specialtyId.toString()))
                }
                if (specialtyName != null) {
                    put("SpecialtyName", listOf(specialtyName.toString()))
                }
                if (specialtyTypeId != null) {
                    put("SpecialtyTypeId", listOf(specialtyTypeId.toString()))
                }
                if (marketingType != null) {
                    put("MarketingType", listOf(marketingType.toString()))
                }
                if (created != null) {
                    put("Created", listOf(parseDateToQueryString(created)))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (lastRetrieved != null) {
                    put("lastRetrieved", listOf(parseDateToQueryString(lastRetrieved)))
                }
                if (current != null) {
                    put("Current", listOf(current.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/hospitals/specialties",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<HospitalSpecialtiesViewModel>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as HospitalSpecialtiesViewModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
