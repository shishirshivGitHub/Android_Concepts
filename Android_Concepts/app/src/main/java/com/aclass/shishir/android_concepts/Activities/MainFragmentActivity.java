package com.aclass.shishir.android_concepts.Activities;

import android.support.v4.app.FragmentActivity;

/**
 Activity <- FragmentActivity <- AppCompatActivity <- ActionBarActivity

 '<-' means inheritance here. The reference said ActionBarActivity is deprecated, use AppCompatActivity instead.

 So basically, using AppCompatActivity is always the right choise. The differences between them:

 Activity is the basic one.
 Based on Activity, FragmentActivity provides the ability to use Fragment.
 Based on FragmentActivity, AppCompatActivity provides features to ActionBar.

 */

// Better to use AppCompactActivity if you have toolbar and fragment,
// otherwise use Activity.

public class MainFragmentActivity extends FragmentActivity{

}
