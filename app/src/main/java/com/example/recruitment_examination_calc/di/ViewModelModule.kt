package com.example.recruitment_examination_calc.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recruitment_examination_calc.viewmodel.CalcViewModel
import com.example.recruitment_examination_calc.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    // Calc ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(CalcViewModel::class)
    abstract fun bindCalcViewModel(calcViewModel: CalcViewModel): ViewModel

    // etc...

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
