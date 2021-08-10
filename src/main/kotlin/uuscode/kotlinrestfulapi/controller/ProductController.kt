package uuscode.kotlinrestfulapi.controller

import org.springframework.web.bind.annotation.*
import uuscode.kotlinrestfulapi.model.*
import uuscode.kotlinrestfulapi.service.ProductService

@RestController
class ProductController(val productService: ProductService) {

    @PostMapping(
        value = ["/api/products"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse>{
        val productResponse = productService.create(body)

        return WebResponse(
            code = 200,
            status = "Product Berhasil dibuat",
            data = productResponse
        )
    }

    @GetMapping(
        value = ["/api/products/{idProduct}"],
        produces = ["application/json"]
    )
    fun getProduct(@PathVariable("idProduct") id: String): WebResponse<ProductResponse>{
        val productResponse = productService.get(id)

        return WebResponse(
            code = 200,
            status = "Ok",
            data = productResponse
        )
    }

    @PutMapping(
        value = ["/api/products/{idProduct}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateProduct(@PathVariable("idProduct") id:String,
                      @RequestBody updateProductRequest: UpdateProductRequest
    ): WebResponse<ProductResponse>{
        val productResponse = productService.update(id, updateProductRequest)

        return WebResponse(
            code = 200,
            status = "Data Berhasil di Update",
            data = productResponse
        )
    }

    @DeleteMapping(
        value = ["/api/products/{idProduct}"],
        produces = ["application/json"]
    )
    fun deleteProduct(@PathVariable("idProduct") id: String): WebResponse<String>{
        productService.delete(id)

        return WebResponse(
            code = 200,
            status = "Data Berhasil di Delete",
            data = id
        )
    }

    @GetMapping(
        value = ["/api/products"],
        produces = ["application/json"]
    )
    fun listProduct(@RequestParam(value = "size", defaultValue = "10") size: Int,
                    @RequestParam(value = "page", defaultValue = "0") page: Int
    ): WebResponse<List<ProductResponse>> {
        val request = ListProductRequest(page = page, size = size)
        val response = productService.list(request)

        return WebResponse(
            code = 200,
            status = "Ok",
            data = response
        )
    }
}