package com.sashakhyzhun.healthmonitor.utils.common

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * @author SashaKhyzhun
 * Created on 5/2/17.
 */
object KeyboardUtils {


    fun hideSoftInput(activity: Activity) {
        var view = activity.currentFocus
        if (view == null) {
            view = View(activity)
        }

        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager

        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun showSoftInput(edit: EditText, context: Context) {
        edit.isFocusable = true
        edit.isFocusableInTouchMode = true
        edit.requestFocus()
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(edit, 0)
    }

    fun toggleSoftInput(context: Context) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
    }


}
