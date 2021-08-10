package uuscode.kotlinrestfulapi.service

import uuscode.kotlinrestfulapi.model.CreateProductRequest
import uuscode.kotlinrestfulapi.model.ListProductRequest
import uuscode.kotlinrestfulapi.model.ProductResponse
import uuscode.kotlinrestfulapi.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id:String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}