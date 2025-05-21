package com.chengliang.domain;

import cn.xbatis.db.IdAutoType;
import cn.xbatis.db.annotations.Ignore;
import cn.xbatis.db.annotations.Ignores;
import cn.xbatis.db.annotations.Table;
import cn.xbatis.db.annotations.TableId;
import lombok.Data;
import org.dromara.autotable.annotation.AutoColumn;
import org.dromara.autotable.annotation.ColumnType;

import java.io.Serial;
import java.io.Serializable;

/**
 * 授权管理对象 sys_client
 *
 * @author chengliang4810
 * @since 2025/05/21
 */
@Data
@Table("sys_client")

// @org.dromara.autotable.annotation.Ignore //忽略自动生成该表
@Ignores({"clientKey", "grantType"}) // 批量忽略字段
public class SysClient implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    // @TableId代表主键 指定类型为 IdAutoType.AUTO设置为自增字段
    @TableId(IdAutoType.AUTO)
    private Long id;

    /**
     * 客户端id
     */
    // 通过 AutoColumn注解 可以指定字段的注释（优先级更高），长度，默认值，是否为空等
    @AutoColumn(comment = "客户端id，优先级高", length = 32, defaultValue = "0", notNull = true)
    private String clientId;

    /**
     * 客户端key
     */
    private String clientKey;

    /**
     * 客户端秘钥
     */
    // 指定字段类型为text类型
//    @AutoColumn(type = "text", comment = "客户端秘钥") // 使用AutoColumn注解指定字段类型为text类型，并需要指定注释
    @ColumnType("text") // 指定字段类型为text类型
    private String clientSecret;

    /**
     * 授权类型
     */
    private String grantType;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * token活跃超时时间
     */
    @Ignore // 忽略该字段
    private Long activeTimeout;

    /**
     * token固定超时时间
     */
    private Long timeout;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;


}
