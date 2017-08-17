package de.cdehning.parcelize_serializable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParcelWithoutSerializable(val currency: String) : Parcelable