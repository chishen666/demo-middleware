package com.carrx.demo.common.common.constant;

/**
 * 接口失败信息
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/3 15:21
 **/
public interface ResponseConstants {

    String BASECRUD_ID_NOT_EXISTED = "参数id不存在";

    String BASECRUD_SAVE_ERROR = "数据新增失败";

    String BASECRUD_UPDATE_ERROR = "数据更新失败";

    String BASECRUD_DELETE_ERROR = "数据删除失败";

    String VALIDATE_ID_IS_REQUIRED = "参数id是必填参数";

    String VALIDATE_VERSION_IS_REQUIRED = "参数version是必填参数";

    String VALIDATE_ROLE_ROLECODE_IS_REQUIRED = "角色编码是必填参数";

    String VALIDATE_ROLE_ROLENAME_IS_REQUIRED = "角色名称是必填参数";

    String VALIDATE_ROLE_ROLECODE_IS_EXISTED = "角色编码是已存在";

    String VALIDATE_ROLE_ROLENAME_IS_EXISTED = "角色名称是已存在";

}
