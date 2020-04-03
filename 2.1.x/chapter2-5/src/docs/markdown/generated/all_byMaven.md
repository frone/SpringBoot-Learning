# spring-boot-starter-swagger


<a name="overview"></a>
## Overview
Starter for swagger 2.x


### Version information
*Version* : 1.9.0.RELEASE


### Contact information
*Contact* : didi  
*Contact Email* : dyc87112@qq.com


### License information
*License* : Apache License, Version 2.0  
*License URL* : https://www.apache.org/licenses/LICENSE-2.0.html  
*Terms of service* : https://github.com/dyc87112/spring-boot-starter-swagger


### URI scheme
*Host* : localhost:8080  
*BasePath* : /


### Tags

* 用户管理 : User Controller




<a name="paths"></a>
## Paths

<a name="postuserusingpost"></a>
### 创建用户
```
POST /users/
```


#### Description
根据User对象创建用户


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**user**  <br>*required*|user|[User](#user)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserlistusingget"></a>
### 获取用户列表
```
GET /users/
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|< [User](#user) > array|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserusingget"></a>
### 获取用户详细信息
```
GET /users/{id}
```


#### Description
根据url的id来获取用户详细信息


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int64)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="putuserusingput"></a>
### 更新用户详细信息
```
PUT /users/{id}
```


#### Description
根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|用户编号|integer (int64)|
|**Body**|**user**  <br>*required*|user|[User](#user)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="deleteuserusingdelete"></a>
### 删除用户
```
DELETE /users/{id}
```


#### Description
根据url的id来指定删除对象


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int64)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|string|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|




<a name="definitions"></a>
## Definitions

<a name="user"></a>
### User
用户实体


|Name|Description|Schema|
|---|---|---|
|**age**  <br>*optional*|用户年龄|integer (int32)|
|**id**  <br>*optional*|用户编号|integer (int64)|
|**name**  <br>*optional*|用户姓名|string|




<a name="securityscheme"></a>
## Security

<a name="authorization"></a>
### Authorization
*Type* : apiKey  
*Name* : TOKEN  
*In* : HEADER



