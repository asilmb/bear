package com.example.bear

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Spinner
import android.widget.TextView

class FindBeerActivity : AppCompatActivity() {

    private val beerExpert : BeerExpert = BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }

    fun onClickFindBeer(view: View) {
        val brands : TextView = findViewById(R.id.brands)
        val spinner : Spinner = findViewById(R.id.color)
        var beerType: String? = spinner.selectedItem?.toString()
        if (beerType == null) {
            beerType = "empty"
        }
        var brandList : List<String> = beerExpert.getBrands(beerType)
        brands.setText( brandList.first())

    }
}
