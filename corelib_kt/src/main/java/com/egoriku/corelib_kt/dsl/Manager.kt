package com.egoriku.corelib_kt.dsl

/**
 * Copyright (C) 2018 egorikftp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.ActivityManager
import android.app.AlarmManager
import android.app.NotificationManager
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
import android.hardware.camera2.CameraManager
import android.media.AudioManager
import android.net.ConnectivityManager
import android.os.BatteryManager
import android.os.Build
import android.os.Vibrator
import android.support.annotation.RequiresApi
import android.telephony.TelephonyManager
import android.view.inputmethod.InputMethodManager

inline val Context.connectivityManager
    get() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

inline val Context.alarmManager
    get() = getSystemService(Context.ALARM_SERVICE) as AlarmManager

inline val Context.telephonyManager
    get() = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

inline val Context.activityManager
    get() = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

inline val Context.notificationManager
    get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

inline val Context.appWidgetManager
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    get() = getSystemService(Context.APPWIDGET_SERVICE) as AppWidgetManager

inline val Context.inputMethodManager
    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

inline val Context.clipboardManager
    get() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

inline val Context.bluetoothManager
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    get() = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager

inline val Context.audioManager
    get() = getSystemService(Context.AUDIO_SERVICE) as AudioManager

inline val Context.batteryManager
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    get() = getSystemService(Context.BATTERY_SERVICE) as BatteryManager

inline val Context.cameraManager
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    get() = getSystemService(Context.CAMERA_SERVICE) as CameraManager

inline val Context.vibrator
    get() = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
