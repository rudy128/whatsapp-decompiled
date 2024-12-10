package com.facebook.wearable.applinks;

import X.C23638Bn7;
import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceIdentityRequest extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkDeviceIdentityRequest.class);
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityRequest(C23638Bn7 bn7) {
        this.serviceUUID = bn7.serviceUUID_.A06();
    }

    public AppLinkDeviceIdentityRequest() {
    }
}
