package com.company.details.di

import com.company.details.ui.fragments.MovieDetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val detailsModule = module {
    viewModel { MovieDetailsViewModel(get(), get()) }
}

val loadDetailsModule by lazy {
    val modules = listOf(detailsModule)
    loadKoinModules(modules)
}