package com.zeezaglobal.carrental.Fragments.CarList

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zeezaglobal.carrental.R

class CarListFragment : Fragment() {

    companion object {
        fun newInstance() = CarListFragment()
    }

    private val viewModel: CarListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_car_list, container, false)
    }
}