<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${mapperPackage};

import ${beansPackage}.entity.${table.className}Entity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@Mapper
public interface ${table.className}Mapper extends BaseMapper<${table.className}Entity> {
}
