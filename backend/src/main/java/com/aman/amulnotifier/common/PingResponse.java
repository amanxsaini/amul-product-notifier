package com.aman.amulnotifier.common;

/**
 * JSON body of {@code GET /api/v1/ping}.
 *
 * <p>Immutable DTO (record): defines exactly which fields the API exposes.
 *
 * @param status  {@code "UP"} when the app is running
 * @param service name of the responding application
 */
public record PingResponse(String status, String service) {
}
