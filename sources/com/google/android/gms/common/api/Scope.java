package com.google.android.gms.common.api;

import X.C18210vx;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;

    public String toString() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        DJ0.A0G(parcel, this.A01, C26293Cx2.A01(parcel, this.A00));
    }

    public Scope(int i, String str) {
        C18210vx.A05(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }
}
