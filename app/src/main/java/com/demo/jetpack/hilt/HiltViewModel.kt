package com.demo.jetpack.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

class HiltViewModel @Inject constructor(val mRepository: Repository) : ViewModel() {


}