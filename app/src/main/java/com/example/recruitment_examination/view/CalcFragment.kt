package com.example.recruitment_examination.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.recruitment_examination.R
import com.example.recruitment_examination.databinding.FragmentCalcBinding
import com.example.recruitment_examination.viewmodel.CalcViewModel
import timber.log.Timber

class CalcFragment : Fragment() {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var binding: FragmentCalcBinding
    private lateinit var viewModel: CalcViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_calc,
            container,
            false
        )

//        viewModel = ViewModelProvider(
//            this,
//            viewModelFactory
//        ).get(CalcViewModel::class.java)
//        viewModel.navigator = this
//        binding.viewModel = viewModel

        Log.d("debug", "CalcFragment onCreateView")
        Timber.d("CalcFragment onCreateView")

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("debug", "CalcFragment onViewCreated")
        Timber.d("CalcFragment onViewCreated")
    }

    companion object {
        @JvmStatic
        fun newInstance() = CalcFragment()
    }
}