package com.example.stripe_tap_to_pay.data

import com.stripe.stripeterminal.external.models.Location

data class LocationListState(
    val locations: List<Location> = emptyList(),
    val isLoading: Boolean = true,
    val hasMore: Boolean = true,
) {
    /**
     * Whether the header view should be displayed in the list.
     */
    val headerVisible = locations.isNotEmpty() || !isLoading
}
