package gallery.mima.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class calculations : AppCompatActivity() {

    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivision:Button
    lateinit var etNumber1:EditText
    lateinit var etNumber2:EditText
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculations)

        btnPlus=findViewById(R.id.btnPlus)
        btnMinus=findViewById(R.id.btnMinus)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivision=findViewById(R.id.btnDivision)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        tvResult=findViewById(R.id.tvResult)

        btnPlus.setOnClickListener {
            val firstnum=etNumber1.text.toString()
            val secondnum=etNumber2.text.toString()
            if (firstnum.isBlank()) {
                etNumber1.setError("input number")
                return@setOnClickListener
            }
            if (secondnum.isBlank()){
                etNumber2.setError("input number")
                return@setOnClickListener
            }
            addition(firstnum.toInt(), secondnum.toInt())
        }

        btnMinus.setOnClickListener {
            val firstnum=etNumber1.text.toString()
            val secondnum=etNumber2.text.toString()
            if (firstnum.isBlank()) {
                etNumber1.setError("input number")
                return@setOnClickListener
            }
            if (secondnum.isBlank()){
                etNumber2.setError("input number")
                return@setOnClickListener
            }
            subtract(firstnum.toInt(), secondnum.toInt())
        }

        btnMultiply.setOnClickListener {
            val firstnum=etNumber1.text.toString()
            val secondnum=etNumber2.text.toString()
            if (firstnum.isBlank()) {
                etNumber1.setError("input number")
                return@setOnClickListener
            }
            if (secondnum.isBlank()){
                etNumber2.setError("input number")
                return@setOnClickListener
            }
            multipy(firstnum.toInt(), secondnum.toInt())
        }

        btnDivision.setOnClickListener {
            val firstnum=etNumber1.text.toString()
            val secondnum=etNumber2.text.toString()
            if (firstnum.isBlank()) {
                etNumber1.setError("input number")
                return@setOnClickListener
            }
            if (secondnum.isBlank()){
                etNumber2.setError("input number")
                return@setOnClickListener
            }
            division(firstnum.toInt(), secondnum.toInt())
        }

    }

    fun addition(firstnum:Int, secondnum:Int){
        var sum=firstnum + secondnum
        tvResult.text=sum.toString()
    }
    fun subtract(firstnum:Int, secondnum:Int){
        var subtraction= firstnum - secondnum
        tvResult.text=subtraction.toString()
    }
    fun multipy(firstnum:Int, secondnum:Int){
        var multiplication=firstnum * secondnum
        tvResult.text=multiplication.toString()
    }
    fun division(firstnum:Int, secondnum:Int){
        var modulus=firstnum % secondnum
        tvResult.text=modulus.toString()
    }

}