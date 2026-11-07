package com.aman.amulnotifier.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Liveness endpoint to confirm the backend is up and reachable.
 *
 * <p>{@code @RestController}: methods handle HTTP requests and return JSON.
 * {@code @RequestMapping("/api/v1")}: versioned path prefix for all endpoints here.
 */
@RestController
@RequestMapping("/api/v1")
public class PingController {

    /**
     * Handles {@code GET /api/v1/ping}. No database or side effects, so safe to call anytime.
     *
     * @return status {@code "UP"} and the service name
     */
    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("UP", "amul-notifier");
    }
}
