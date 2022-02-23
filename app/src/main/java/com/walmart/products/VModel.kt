package com.walmart.products

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.walmart.products.ProductRepository.getProducts

class VModel : ViewModel() {

    var products : MutableLiveData<List<Product>> = MutableLiveData();

    fun getProduct(): MutableLiveData<List<Product>> {
        return products;
    }

    fun setProduct() {
        products.value = getProducts()
    }

}