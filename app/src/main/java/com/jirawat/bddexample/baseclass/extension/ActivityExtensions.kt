package com.jirawat.bddexample.baseclass.extension

import android.app.Activity
import android.view.View

fun Activity.getContentView(): View = this.findViewById(android.R.id.content)