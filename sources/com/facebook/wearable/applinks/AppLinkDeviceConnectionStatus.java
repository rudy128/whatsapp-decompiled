package com.facebook.wearable.applinks;

import X.D3B;
import android.os.Parcel;
import android.os.Parcelable;

public enum AppLinkDeviceConnectionStatus implements Parcelable {
    CONNECTED(0),
    CONNECTING(1),
    DISCONNECTED(2),
    UNPAIRED(3);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int value;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = D3B.A00(48);
    }

    public int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    AppLinkDeviceConnectionStatus(int i) {
        this.value = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
