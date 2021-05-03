package com.example.song.rekotin.reducer

import com.example.song.rekotin.action.GoodbyeWorld
import com.example.song.rekotin.action.HelloWorld
import com.example.song.rekotin.state.GreetingState
import org.rekotlin.Action

/**
 * @author s.liao
 * @email
 * @date 5/3/2021 10:46 AM
 * @desc
 */
fun greetingReducer(action: Action, state: GreetingState?): GreetingState {
    state ?: return GreetingState()

    return when (action) {
        is HelloWorld -> {
            state.copy(greeting = state.greeting + "long time no see.")
        }
        is GoodbyeWorld -> {
            state.copy(greeting = state.greeting + "see you next time.")
        }
        else -> {
            GreetingState()
        }
    }
}