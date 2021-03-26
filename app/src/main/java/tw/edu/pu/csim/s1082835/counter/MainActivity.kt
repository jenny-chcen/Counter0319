package tw.edu.pu.csim.s1082835.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()

    }

    fun Add(v: View){ //View是一個視覺元件，用來判斷是哪一個button
        //if(v.id == R.id.button){ //button=>java的寫法
        if(v == button){
            counter++
        }
        else{ //button1
            counter+=2
        }
        txv.text = counter.toString()
    }

}