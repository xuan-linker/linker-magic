package com.zju.dq.dao;

import com.zju.dq.model.UmsMenu;
import com.zju.dq.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Linker
 * @date 2021/3/4 11:06
 * @description：自定义后台角色管理Dao
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
