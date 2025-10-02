package com.yupi.yuaicodemother.controller;

import com.yupi.yuaicodemother.common.BaseResponse;
import com.yupi.yuaicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yufeng
 * @since 2025/10/2 16:15
 */

@RestController
@RequestMapping("/health")
public class HealthContoller {
    @GetMapping
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
