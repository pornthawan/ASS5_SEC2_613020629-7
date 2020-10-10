package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

     var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("employee")
        name.text = "Employee Name : ${newEmployee?.Name}"
        Gender.text = "Gender : ${newEmployee?.gender}"
        email.text = "Email : ${newEmployee?.Email}"
        salary.text = "Salary : ${newEmployee?.salary}"
    }

    fun onClickClose(view: View){
        finish()
    }
}
