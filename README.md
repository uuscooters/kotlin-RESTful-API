Gambaran dokumentasi Api pada sebuah project yang dikerjakan

# API Spec

## Authentication
All API must use this Authentication

Request:
- Header :
  - X-Api-Key: "your secret api key"

## Create Product
Request :
- Method : POST
- EndPoint : `api/products`
- Header: 
    - Content-Type : application/json
    - Accept : application/json
- Body :
```Json
{
    "id": "String, Unique",
    "name": "String",
    "price": "long",
    "quantity": "Integer"
}
```
- Response :
```Json
{
  "code": "number",
  "status": "String",
  "data": { 
    "id": "String, Unique",
    "name": "String",
    "price": "long",
    "quantity": "Integer",
    "createdAt": "date"
  }
}
```


## Get Product 
Request :
- Method : GET
- EndPoint : `api/products/{id_product}`
- Header:
    - Content-Type : application/json
- Response :
```Json
{
  "code": "number",
  "status": "String",
  "data": {
    "id": "String, Unique",
    "name": "String",
    "price": "long",
    "quantity": "Integer",
    "createdAt": "date"
  }
}
```


## Update Product
Request :
- Method : PUT
- EndPoint : `api/products/{id_product}`
- Header:
    - Content-Type : application/json
    - Accept : application/json
- Body :
```Json
{
    "name": "String",
    "price": "long",
    "quantity": "Integer"
}
```
- Response :
```Json
{
  "code": "number",
  "status": "String",
  "data": {
    "id": "String, Unique",
    "name": "String",
    "price": "long",
    "quantity": "Integer",
    "createdAt": "date"
  }
}
```
## List Product 
Request :
- Method : GET
- EndPoint : `api/products`
- Header:
    - Accept : application/json
- Query Params: 
    - size: number,
    - page: number
- Response :
```Json
{
  "code": "number",
  "status": "String",
  "data": [
    {
      "id": "String, Unique",
      "name": "String",
      "price": "long",
      "quantity": "Integer",
      "createdAt": "date"
    },
    {
      "id": "String, Unique",
      "name": "String",
      "price": "long",
      "quantity": "Integer",
      "createdAt": "date"
    },
  ]
}
```


## Delete Product 
Request :
- Method : DELETE
- EndPoint : `api/products/{id_product}`
- Header:
    - Accept : application/json

- Response :
```Json
{
  "code": "number",
  "status": "String"
}
```