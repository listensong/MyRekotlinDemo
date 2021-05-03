package com.example.song.rekotin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.song.rekotin.action.GoodbyeWorld
import com.example.song.rekotin.action.HelloWorld
import com.example.song.rekotin.state.GreetingState
import com.example.song.rekotin.store.mainStore
import org.rekotlin.StoreSubscriber

class MainActivity : AppCompatActivity(), StoreSubscriber<GreetingState> {
    private val btnHello: Button by lazy(LazyThreadSafetyMode.NONE) {
        findViewById<Button>(R.id.btn_hello)
    }
    private val btnBye: Button by lazy(LazyThreadSafetyMode.NONE) {
        findViewById<Button>(R.id.btn_bye)
    }
    private val tvWord: TextView by lazy(LazyThreadSafetyMode.NONE) {
        findViewById<TextView>(R.id.tv_word)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello.setOnClickListener {
            mainStore.dispatch(HelloWorld())
        }

        btnBye.setOnClickListener {
            mainStore.dispatch(GoodbyeWorld())
        }
        mainStore.subscribe(this)
    }

    override fun newState(state: GreetingState) {
        tvWord.text = state.greeting
    }
}