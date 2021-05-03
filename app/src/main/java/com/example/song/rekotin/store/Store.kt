package com.example.song.rekotin.store

import com.example.song.rekotin.reducer.greetingReducer
import org.rekotlin.Store

/**
 * @package com.example.song.rekotin.store
 */
val mainStore = Store(
    reducer = ::greetingReducer,
    state = null
)