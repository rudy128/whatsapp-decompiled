package com.facebook.wearable.applinks;

import X.C23647BnG;
import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkRegisterResponse extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkRegisterResponse.class);
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkRegisterResponse(C23647BnG bnG) {
        this.serviceUUID = bnG.serviceUUID_.A06();
    }

    public AppLinkRegisterResponse() {
    }
}
