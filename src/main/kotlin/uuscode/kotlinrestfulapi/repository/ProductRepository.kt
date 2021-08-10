package uuscode.kotlinrestfulapi.repository

import org.springframework.data.jpa.repository.JpaRepository
import uuscode.kotlinrestfulapi.entity.Product

interface ProductRepository: JpaRepository<Product, String> {

}