package com.facebook.wearable.applinks;

import X.C23651BnK;
import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkInfoRequest extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkLinkInfoRequest.class);
    @SafeParcelable.Field(2)
    public int linkType;
    @SafeParcelable.Field(3)
    public int requestType;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkLinkInfoRequest(C23651BnK bnK) {
        this.serviceUUID = bnK.serviceUUID_.A06();
        this.linkType = bnK.linkType_;
        this.requestType = bnK.requestType_;
    }

    public AppLinkLinkInfoRequest() {
    }
}
