<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${beansPackage}.entity;

import ${basePackage}.common.frame.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@Data
@TableName("${table.tableName}")
public class ${table.className}Entity extends BaseEntity {
	<#list table.columns as column>
	<#if column.columnNameFirstLower != 'id' && column.columnNameFirstLower != 'createTime' && column.columnNameFirstLower != 'createBy' && column.columnNameFirstLower != 'createId' && column.columnNameFirstLower != 'updateBy' && column.columnNameFirstLower != 'updateByName' && column.columnNameFirstLower != 'updateTime' && column.columnNameFirstLower != 'delFlag'>
	@TableField(value = "${column.columnName}")
	private ${column.possibleShortJavaType} ${column.columnNameFirstLower};
	</#if>
	</#list>
}