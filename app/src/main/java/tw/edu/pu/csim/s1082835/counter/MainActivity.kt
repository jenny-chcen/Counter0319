package tw.edu.pu.csim.s1082835.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {
    //View.OnClickListener => 系統會隨時監控
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()

        txv.setOnClickListener(this) //報名監控

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        btnHappy.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }
        })

        txv.setOnLongClickListener(this)

    }



    override fun onClick(v: View?) { //發生以後，事件處理
        if(v == txv || v == button){
            counter++
        }
        else if(v == button2){
            counter +=2
        }
        else{
            counter = 0;
        }
        txv.text = counter.toString()
    }

    override fun onLongClick(v: View?): Boolean {
        counter+=2
        txv.text = counter.toString()
        return true
    }

}