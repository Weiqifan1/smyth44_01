package com.ebookfrenzy.lifecycledemo.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ebookfrenzy.lifecycledemo.R

import com.ebookfrenzy.lifecycledemo.DemoObserver
import com.ebookfrenzy.lifecycledemo.DemoOwner

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var demoOwner: DemoOwner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    //nået til 9103
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        demoOwner = DemoOwner()
        demoOwner.startOwner()
        demoOwner.stopOwner()
        //lifecycle.addObserver(DemoObserver())
        // TODO: Use the ViewModel
    }

}
