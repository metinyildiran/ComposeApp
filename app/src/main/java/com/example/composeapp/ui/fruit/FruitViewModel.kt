package com.example.composeapp.ui.fruit

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.composeapp.data.model.Fruit

class FruitViewModel:ViewModel() {
    val fruits = mutableStateListOf(
        Fruit("Elma", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/330px-Red_Apple.jpg"),
        Fruit("Muz", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Musa-sp3.1.jpg/330px-Musa-sp3.1.jpg"),
        Fruit("Çilek", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/D%C3%BClmen%2C_Kirchspiel%2C_Erdbeerfeld_--_2015_--_6509.jpg/330px-D%C3%BClmen%2C_Kirchspiel%2C_Erdbeerfeld_--_2015_--_6509.jpg"),
        Fruit("Armut", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Pears.jpg/330px-Pears.jpg"),
        Fruit("Üzüm", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Birstaler_Muskat_P1240336.jpg/330px-Birstaler_Muskat_P1240336.jpg"),
        Fruit("Portakal", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/OrangeBloss_wb.jpg/330px-OrangeBloss_wb.jpg"),
        Fruit("Karpuz", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Taiwan_2009_Tainan_City_Organic_Farm_Watermelon_FRD_7962.jpg/330px-Taiwan_2009_Tainan_City_Organic_Farm_Watermelon_FRD_7962.jpg"),
        Fruit("Kiraz", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Cherry_Stella444.jpg/330px-Cherry_Stella444.jpg"),
        Fruit("Ananas", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Pineapple1.JPG/330px-Pineapple1.JPG"),
        Fruit("Mango", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Mango_-_single.jpg/330px-Mango_-_single.jpg"),
        Fruit("Limon", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Lemon_-_whole_and_split.jpg/330px-Lemon_-_whole_and_split.jpg"),
        Fruit("Erik", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Plums_hanging.jpg/330px-Plums_hanging.jpg"),
        Fruit("Hindistan Cevizi", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Coconut_face.jpg/330px-Coconut_face.jpg"),
    )

    fun removeFruit(fruit: Fruit) {
        fruits.remove(fruit)
    }

    fun addFruit() {
        fruits.add(Fruit("Elma", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/330px-Red_Apple.jpg"))
    }
}