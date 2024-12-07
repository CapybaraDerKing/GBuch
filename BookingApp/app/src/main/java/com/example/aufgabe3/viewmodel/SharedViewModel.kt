package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.aufgabe3.model.BookingEntry

class SharedViewModel : ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun deleteBooking(booking: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value.filter { it != booking }
    }

    fun addBooking(booking: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value + booking
    }
}
