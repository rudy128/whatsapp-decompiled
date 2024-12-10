package com.facebook.wearable.applinks;

import X.D36;
import android.os.Parcel;
import android.os.Parcelable;

public enum AppLinkDeviceMountState implements Parcelable {
    MOUNTED(0),
    UNMOUNTED(1);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int value;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new D36(0);
    }

    public int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    AppLinkDeviceMountState(int i) {
        this.value = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
