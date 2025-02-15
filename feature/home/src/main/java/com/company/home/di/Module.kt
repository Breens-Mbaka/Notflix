package com.company.home.di

import com.company.home.ui.fragments.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val homeModule = module {
    viewModel { HomeViewModel(get(), get(), get(), get()) }
}

val loadHomeModule by lazy {
    val modules = listOf(homeModule)
    loadKoinModules(modules)
}