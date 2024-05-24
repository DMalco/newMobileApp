package com.example.assignment

// Sealed class defining the different screens in the app
sealed class Screens(val screen: String) {
    // Each screen is represented by an object inheriting from Screens class
    data object Home : Screens("home")
    data object Apparel : Screens("apparel")
    data object Help : Screens("help")
    data object Contact : Screens("contact")
    data object Booking : Screens("booking")
    data object Cart : Screens("cart")
    data object BookingConfirm : Screens("bookingConfirm")
}
