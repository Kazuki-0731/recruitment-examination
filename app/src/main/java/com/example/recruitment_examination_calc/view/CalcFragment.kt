package com.example.recruitment_examination_calc.view

import android.content.Context
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.recruitment_examination_calc.R
import com.example.recruitment_examination_calc.databinding.FragmentCalcBinding
import com.example.recruitment_examination_calc.navigator.CalcNavigator
import com.example.recruitment_examination_calc.viewmodel.CalcViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CalcFragment : Fragment(), CalcNavigator {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var binding: FragmentCalcBinding
    private lateinit var viewModel: CalcViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_calc,
            container,
            false
        )

        viewModel = ViewModelProvider(
            requireActivity(),
            viewModelFactory
        ).get(CalcViewModel::class.java)
        viewModel.navigator = this

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        binding.textCalcResult.movementMethod = ScrollingMovementMethod()

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun scrollToEnd() {
        binding.scrollCalcResult.fullScroll(View.FOCUS_DOWN)
    }
}