# Spring Boot总结

## 注解说明

- @Controller：修饰class，用来创建处理http请求的对象
- @RestController：Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，如果直接用@RestController替代
- @Controller就不需要再配置@ResponseBody，默认返回json格式
- @RequestMapping：配置url映射。现在更多的也会直接用以Http Method直接关联的映射注解来定义，比如：GetMapping、PostMapping、DeleteMapping、PutMapping等

## RESTful API设计说明

![RESTFUL](http://blog.didispace.com/content/images/posts/springbootrestfulapi-1.png)

## SR-303

在开始动手实践之前，我们先了解一下接下来我们将使用的一项标准规范：JSR-303

### 什么是JSR

JSR是Java Specification Requests的缩写，意思是Java 规范提案。是指向JCP(Java Community Process)提出新增一个标准化技术规范的正式请求。任何人都可以提交JSR，以向Java平台增添新的API和服务。JSR已成为Java界的一个重要标准。

### JSR-303定义的是什么标准

JSR-303 是JAVA EE 6 中的一项子规范，叫做Bean Validation，Hibernate Validator 是 Bean Validation 的参考实现 . Hibernate Validator 提供了 JSR 303 规范中所有内置 constraint 的实现，除此之外还有一些附加的 constraint。

### Bean Validation中内置的constraint

![Bean Validation](http://img.didispace.com/Fugzgq1zvxjKur4qdm_N-xV5twMj)

### Hibernate Validator附加的constraint

![Hibernate Validator](http://img.didispace.com/FnNRRGx1eWbniJFHQz2m-pUIEWKa)
