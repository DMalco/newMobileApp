package com.example.assignment

sealed class Screens (val screen: String) {
    data object Home: Screens("home")
    data object Apparel: Screens("apparel")
    data object Help: Screens("help")
    data object Contact: Screens("contact")

    data object Cart: Screens("cart")
}