package uz.gita.myemailauthentificationapp1.data.local

import android.content.Context
import uz.gita.myemailauthentificationapp1.utils.SharedPreference
import javax.inject.Inject

class MySharedPref @Inject constructor(context: Context): SharedPreference(context) {
    var isRegistered : Boolean by BooleanPreference(false)
    var email : String by StringPreference("")
    var imageUri : String by StringPreference("")

}