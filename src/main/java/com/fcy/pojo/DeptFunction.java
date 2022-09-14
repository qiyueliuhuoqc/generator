package com.fcy.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 部门功能表
 * </p>
 *
 * @author fcy
 * @since 2022-09-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_dept_function")
public class DeptFunction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 租户id
     */
    private Integer lesseeId;

    /**
     * 组织id
     */
    private Integer organizeId;

    /**
     * 拥有的功能id
     */
    private String functionId;

    /**
     * 功能权限; 0-新增 1-删除 2-修改 3-查询
     */
    private String functionAuth;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
