package com.fsoft.weatherapp.data.model

interface GeneraEntity {
    fun areItemsTheSame(newItem: GeneraEntity): Boolean
    fun areContentsTheSame(newItem: GeneraEntity): Boolean
}
