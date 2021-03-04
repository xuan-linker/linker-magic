package com.zju.dq.component;

import com.zju.dq.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Linker
 * @date 2021/3/4 12:02
 * @description：资源与角色访问对应关系操作组件
 */
@Component
public class ResourceRoleRulesHolder {

    @Autowired
    private UmsResourceService resourceService;

    @PostConstruct
    public void initResourceRolesMap() {
        resourceService.initResourceRolesMap();
    }
}
