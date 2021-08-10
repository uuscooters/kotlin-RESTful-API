package uuscode.kotlinrestfulapi.repository

import org.springframework.data.jpa.repository.JpaRepository
import uuscode.kotlinrestfulapi.entity.ApiKey

interface ApiKeyRepository : JpaRepository<ApiKey, String>  {
}