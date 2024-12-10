package com.facebook.wearable.applinks;

import X.C23646BnF;
import X.C24376C0v;
import X.D3C;
import X.DYP;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkAddress extends DYP {
    public static final Parcelable.Creator CREATOR = new D3C(AppLinkLinkAddress.class);
    @SafeParcelable.Field(2)
    public String address;
    @SafeParcelable.Field(1)
    public int addressType;

    public AppLinkLinkAddress(C23646BnF bnF) {
        C24376C0v c0v;
        this.address = bnF.data_.A04();
        int i = bnF.addressType_;
        if (i == 0) {
            c0v = C24376C0v.EMPTY;
        } else if (i == 1) {
            c0v = C24376C0v.IPV4;
        } else if (i == 2) {
            c0v = C24376C0v.IPV6;
        } else if (i != 3) {
            c0v = C24376C0v.UNRECOGNIZED;
        } else {
            c0v = C24376C0v.BTC;
        }
        this.addressType = c0v.BVW();
    }

    public AppLinkLinkAddress() {
    }
}
