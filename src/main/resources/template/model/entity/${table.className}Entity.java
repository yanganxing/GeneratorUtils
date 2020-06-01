<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${beansPackage}.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@Data
@TableName("${table.tableName}")
public class ${table.className}Entity {
	<#list table.columns as column>
	@TableField(value = "${column.columnName}")
	private ${column.possibleShortJavaType} ${column.columnNameFirstLower};

	</#list>
}