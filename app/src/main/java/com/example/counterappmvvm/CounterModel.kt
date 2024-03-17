package com.example.counterappmvvm

data class CounterModel(var count: Int)

/* we are going to set up our counter repository :
* A repository is a design pattern that acts as a clean API (Application Programming Interface)
* for data access to the rest of the application - repository is mediator
*/

class CounterRepository {
    private var _counter = CounterModel(0)
    fun getCounter() = _counter

    fun incrementCounter() {
        _counter.count++
    }

    fun decrementCounter() {
        _counter.count--
    }
}






