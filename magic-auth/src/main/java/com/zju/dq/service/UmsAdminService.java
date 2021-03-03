package com.zju.dq.service;

import com.zju.dq.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Linker
 * @date 2021/3/3 10:55
 * @description：
 */
@FeignClient("magic-admin")
public interface UmsAdminService {
    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
