package com.example.myapplication.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.google.firebase.auth.FirebaseAuth

class fragmentAuthorization : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_authorization, container, false)

        val etEmail = v.findViewById<EditText>(R.id.etEmail)

        val etPass = v.findViewById<EditText>(R.id.etPass)

        val tvReg = v.findViewById<TextView>(R.id.tvReg)

        val btnAuth = v.findViewById<Button>(R.id.btnAuth)

        btnAuth.setOnClickListener{

            val etEmailText = etEmail.text.toString().trim()

            val etPasswordText = etPass.text.toString().trim()

            if(etEmail.text.isEmpty() or etPass.text.isEmpty()) {

                Toast.makeText(activity,"შეავსეთ ყველა ველი", Toast.LENGTH_SHORT).show()

            }

            else if(etEmail.text.length < 8) {

                Toast.makeText(activity,"მეილი უნდა შეიცავდეს 8ზე მეტ სიმბოლოს", Toast.LENGTH_SHORT).show()

            }

            else if(!etEmail.text.contains("@") or !etEmail.text.contains(".")) {

                Toast.makeText(activity,"გთხოვთ შეიყვანოთ @ და . სიმბოლოები", Toast.LENGTH_SHORT).show()

            }

            else if(etPass.text.length < 8) {

                Toast.makeText(activity,"პაროლი უნდა შეიცავდეს 8ზე მეტ სიმბოლოს", Toast.LENGTH_SHORT).show()

            }

            else {

                FirebaseAuth.getInstance().signInWithEmailAndPassword(etEmailText,etPasswordText).addOnCompleteListener{
                        task ->
                    if (task.isSuccessful){
                        etPass.text.clear()
                        etEmail.text.clear()
                        Toast.makeText(activity,"წარმატებით გაიარეთ ავთენთიფიკაცია", Toast.LENGTH_SHORT).show()
                        Handler().postDelayed({
                            val intent = Intent(activity, MainActivity :: class.java)
                            startActivity(intent)


                        }, 0)

                    } else {

                        Toast.makeText(activity, "აუცილებელია რეგისტრაცია", Toast.LENGTH_SHORT).show()

                    }


                }

            }

        }

        tvReg.setOnClickListener{

            val fragmentRegistration = fragmentRegistration()
            fragmentManager?.beginTransaction()?.replace(R.id.layoutMain,fragmentRegistration)?.commit()

            etPass.text.clear()
            etEmail.text.clear()

        }


        return v
    }
}
