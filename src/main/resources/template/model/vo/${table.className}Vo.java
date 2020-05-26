<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${beansPackage}.vo;

import ${basePackage}.common.frame.BaseVo;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@Data
public class ${table.className}Vo extends BaseVo {
	<#list table.columns as column>
	<#if column.columnNameFirstLower != 'id' && column.columnNameFirstLower != 'createTime' && column.columnNameFirstLower != 'createBy' && column.columnNameFirstLower != 'createId' && column.columnNameFirstLower != 'updateBy' && column.columnNameFirstLower != 'updateByName' && column.columnNameFirstLower != 'updateTime' && column.columnNameFirstLower != 'delFlag'>
	private ${column.possibleShortJavaType} ${column.columnNameFirstLower};
	</#if>
	</#list>
}