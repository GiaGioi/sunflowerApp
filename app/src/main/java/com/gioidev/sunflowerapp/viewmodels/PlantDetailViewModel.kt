package com.gioidev.sunflowerapp.viewmodels

import androidx.lifecycle.SavedStateHandle
import com.gioidev.sunflowerapp.data.GardenPlantingRepository
import com.gioidev.sunflowerapp.data.PlantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlantDetailViewModel @Inject constructor (
    savedStateHandle: SavedStateHandle,
    plantRepository: PlantRepository,
    private val gardenPlantingRepository: GardenPlantingRepository,

    ){
}