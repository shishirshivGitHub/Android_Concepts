package com.aclass.shishir.android_concepts.Activities;

import android.support.v7.app.AppCompatActivity;

/**
 Activity <- FragmentActivity <- AppCompatActivity <- ActionBarActivity

 '<-' means inheritance here. The reference said ActionBarActivity is deprecated, use AppCompatActivity instead.

 So basically, using AppCompatActivity is always the right choise. The differences between them:

 Activity is the basic one.
 Based on Activity, FragmentActivity provides the ability to use Fragment.
 Based on FragmentActivity, AppCompatActivity provides features to ActionBar.

 */

/*
    AppCompatActivity is the new way to go because the ActionBar, instead of
    ActionBar can use Toolbar.
*/

// Better to use AppCompactActivity if you have toolbar and fragment,
// otherwise use Activity.

public class MainAppCompactActivity extends AppCompatActivity{

}
