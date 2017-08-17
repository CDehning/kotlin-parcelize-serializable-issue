package de.cdehning.parcelize_serializable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class ParcelizeMe(val currency: Currency) : Parcelable