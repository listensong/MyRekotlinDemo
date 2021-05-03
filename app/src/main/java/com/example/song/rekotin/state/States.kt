package com.example.song.rekotin.state

import org.rekotlin.StateType

/**
 * @author s.liao
 * @email
 * @date 5/3/2021 10:47 AM
 * @desc
 */
data class GreetingState(
    val greeting: String = "Hi,"
): StateType