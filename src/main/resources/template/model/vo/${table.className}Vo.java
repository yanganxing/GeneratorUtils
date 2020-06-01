<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${beansPackage}.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@Data
public class ${table.className}Vo{
	<#list table.columns as column>
	@ApiModelProperty(value = "${column.remark}" )
	private ${column.possibleShortJavaType} ${column.columnNameFirstLower};

	</#list>
}