package com.example.song.rekotin.action

import org.rekotlin.Action

/**
 * @author s.liao
 * @email
 * @date 5/3/2021 10:45 AM
 * @desc
 */
data class HelloWorld(val unit: Unit = Unit): Action
data class GoodbyeWorld(val unit: Unit = Unit): Action