<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basePackage}.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date ${.now?string('yyyy/MM/dd HH:mm')}
 * @since 1.8
 */
@RestController
@RequestMapping("${table.classNameFirstLower}")
public class Rest${table.className}Controller {

}
