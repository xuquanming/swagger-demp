package com.company.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


//@Api(注释)
@ApiModel("用户文档注释")
public class User {

    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("密码")
    public String password;

}
