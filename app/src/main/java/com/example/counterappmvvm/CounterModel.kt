package com.example.counterappmvvm

// It's The Model of the MVVM means data handling section and it's a class


// Now for instance this data class acts as the actual data source
data class CounterModel(var count: Int)

/* we are going to set up our counter repository :
* A repository is a design pattern that acts as a clean API (Application Programming Interface)
* for data access to the rest of the application - repository is mediator between the data and
* the ViewMode
*/


// Repository:- is a class
// Teh repository takes the data from tha actual data source
// and it will provide those to the ViewModel and also maintain its functionality
//class CounterRepository {
//    private var _counter = CounterModel(0)
//    fun getCounter() = _counter
//
//    fun incrementCounter() {
//        _counter.count++
//    }
//
//    fun decrementCounter() {
//        _counter.count--
//    }
//}






