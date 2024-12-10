package com.google.android.gms.wearable.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;
import X.BEA;
import X.C18210vx;
import X.C26293Cx2;
import X.DJ0;
import X.E2K;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;

@KeepName
public class DataItemAssetParcelable extends DJ0 implements ReflectedParcelable, E2K {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DataItemAssetParcelable[@");
        BE7.A10(hashCode(), A10);
        String str = this.A00;
        if (str == null) {
            str = ",noid";
        } else {
            BE6.A1K(A10);
        }
        A10.append(str);
        A10.append(", key=");
        return BEA.A0m(this.A01, A10);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A01, 3, DJ0.A0L(parcel, this.A00));
        C26293Cx2.A05(parcel, A002);
    }

    public DataItemAssetParcelable(E2K e2k) {
        DataItemAssetParcelable dataItemAssetParcelable = (DataItemAssetParcelable) e2k;
        String str = dataItemAssetParcelable.A00;
        C18210vx.A00(str);
        this.A00 = str;
        String str2 = dataItemAssetParcelable.A01;
        C18210vx.A00(str2);
        this.A01 = str2;
    }
}
