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
 * 应用表
 * </p>
 *
 * @author fcy
 * @since 2022-09-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_app")
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "app_id", type = IdType.AUTO)
    private Integer appId;

    /**
     * 应用名字
     */
    private String appName;

    /**
     * 应用状态; 0-有效 1-无效
     */
    private Boolean appState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
