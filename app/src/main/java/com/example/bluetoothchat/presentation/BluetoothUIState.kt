package com.example.bluetoothchat.presentation

import com.example.bluetoothchat.domain.chat.BluetoothDevice

data class BluetoothUIState (
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)