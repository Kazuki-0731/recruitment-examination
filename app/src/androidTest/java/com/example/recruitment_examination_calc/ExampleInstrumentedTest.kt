package com.example.recruitment_examination_calc

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
//    @Rule
//    var rule: ActivityTestRule = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.recruitment_examination_calc", appContext.packageName)
    }

//    private fun showMessageOnUiThread(message: String) {
//        class ShowTextAction(private val message: String) : Runnable {
//            override fun run() {
//                val messageText: TextView = rule.getActivity().findViewById(R.id.textMessage)
//                messageText.text = this.message
//            }
//        }
//        this.rule.getActivity().runOnUiThread(ShowTextAction(message))
//    }
}