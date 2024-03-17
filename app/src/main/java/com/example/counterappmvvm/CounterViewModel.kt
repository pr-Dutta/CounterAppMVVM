package com.example.counterappmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


// The CounterViewModel is the ViewModel of the MVVM and it's a class
// means mediator between the View and the Model

class CounterViewModel() : ViewModel() {

    private val _repository: CounterRepository = CounterRepository()

    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose the _count as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }

}




