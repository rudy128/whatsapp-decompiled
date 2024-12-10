package com.facebook.wearable.applinks;

import X.C23650BnJ;
import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceIdentityResponse extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkDeviceIdentityResponse.class);
    @SafeParcelable.Field(2)
    public byte[] devicePublicKey;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityResponse(C23650BnJ bnJ) {
        this.serviceUUID = bnJ.serviceUUID_.A06();
        this.devicePublicKey = bnJ.devicePublicKey_.A06();
    }

    public AppLinkDeviceIdentityResponse() {
    }
}
