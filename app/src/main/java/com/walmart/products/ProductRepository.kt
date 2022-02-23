package com.walmart.products

object ProductRepository {
    fun getProducts(): List<Product> = listOf(
        Product (
            id = 10001,
            name = "Banana Muffin",
            price = 2.599,
            description = "Freshly baked Banana muffin with chocolate chip cookies on top. This if for the people who love to add something extra in their muffins. This is a crowd favorite.",
            image = "https://image.shutterstock.com/image-photo/homemade-banana-muffins-cinnamon-chocolate-600w-1902548164.jpg"
        ),
        Product (
            id = 10002,
            name = "Regular Muffin",
            price = 1.59,
            description = "Freshly baked Regular muffin. Tried and tested great regular muffin which you can never go wrong with.",
            image = "https://image.shutterstock.com/image-photo/freshly-baked-homemade-muffins-white-600w-1592819455.jpg"
        ),
        Product (
            id = 10003,
            name = "Blueberry Muffin",
            price = 2.999,
            description = "Freshly baked classic Blueberry muffin. Who doesn’t love the taste of blueberry muffin? This is also another crowd favorite.",
            image = "https://image.shutterstock.com/image-photo/freshly-baked-homemade-muffins-white-600w-1592819455.jpg"
        ),
        Product (
            id = 10004,
            name = "Raspberry Muffin",
            price = 2.59,
            description = "Freshly baked Raspberry muffin. For those who are feeling adventurous. This will be sure to bring a smile on your face if you love Raspberries!",
            image = " https://image.shutterstock.com/image-photo/blueberry-raspberry-muffins-powdered-sugar-600w-477025264.jpg"
        ),
        Product (
            id = 10005,
            name = "Cherry Muffin",
            price = 1.99,
            description = "This Cherry muffin is a specialty in our bakery. This is made to order and you will have to order one day before.",
            image = "https://image.shutterstock.com/image-photo/tasty-muffins-berries-on-white-600w-146300555.jpg"
        )
    )
}

