<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basePackage}.application.service.impl;


import ${basePackage}.application.service.I${table.className}Service;
import org.springframework.stereotype.Service;
/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@Service
public class ${table.className}ServiceImpl implements I${table.className}Service{

}
