package com.facebook.wearable.applinks;

import X.D3C;
import X.DYP;
import android.os.ParcelUuid;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkingParameters extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkingParameters.class);
    @SafeParcelable.Field(3)
    public byte[] devicePublicKey;
    @SafeParcelable.Field(2)
    public byte[] linkedAppPrivateKey;
    @SafeParcelable.Field(1)
    public ParcelUuid serviceUUID;

    public AppLinkingParameters(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        this.serviceUUID = parcelUuid;
        this.linkedAppPrivateKey = bArr;
        this.devicePublicKey = bArr2;
    }

    public AppLinkingParameters() {
    }
}
