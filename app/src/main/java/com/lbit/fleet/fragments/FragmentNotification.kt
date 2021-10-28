package com.lbit.fleet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lbit.fleet.R

class FragmentNotification : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val v = inflater.inflate(R.layout.fragment_notification, container, false)

        return v
    }
}