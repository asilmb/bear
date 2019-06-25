package com.example.bear

import java.util.*

class BeerExpert {
    internal fun getBrands(color: String): List<String> {
        val brands = ArrayList<String>()
        if (color == "amber") {
            brands.add("Jack Amber")
            brands.add("Red Moose")
        } else {
            brands.add("Jail Pale Ale")
            brands.add("Gout Stout")
        }
        return brands
    }
}