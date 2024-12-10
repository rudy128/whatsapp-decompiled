package com.google.android.gms.fido.common;

import X.BE7;
import X.C1V;
import X.C25467CgM;
import X.C26933DJo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    HYBRID("cable");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzc;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzc;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* access modifiers changed from: public */
    static {
        CREATOR = new Object();
    }

    public static Transport A00(String str) {
        if (str.equals("hybrid")) {
            C26933DJo.A01.A00.CTC();
            C25467CgM.A02.CTC();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.zzc)) {
                return transport;
            }
        }
        throw new C1V(String.format("Transport %s not supported", BE7.A1b(str)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzc);
    }

    /* access modifiers changed from: public */
    Transport(String str) {
        this.zzc = str;
    }
}
