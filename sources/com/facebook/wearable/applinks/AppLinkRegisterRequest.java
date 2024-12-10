package com.facebook.wearable.applinks;

import X.C23639Bn8;
import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkRegisterRequest extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkRegisterRequest.class);
    @SafeParcelable.Field(1)
    public byte[] appPublicKey;
    @SafeParcelable.Field(2)
    public int testAppNumber = 0;

    public AppLinkRegisterRequest(C23639Bn8 bn8) {
        this.appPublicKey = bn8.appPublicKey_.A06();
    }

    public AppLinkRegisterRequest() {
    }
}
