package com.google.android.gms.maps.model;

import X.AnonymousClass8BU;
import X.BE6;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLng extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final double A00;
    public final double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LatLng) {
                LatLng latLng = (LatLng) obj;
                if (!(Double.doubleToLongBits(this.A00) == Double.doubleToLongBits(latLng.A00) && Double.doubleToLongBits(this.A01) == Double.doubleToLongBits(latLng.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        long doubleToLongBits2 = Double.doubleToLongBits(this.A01);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d = this.A00;
        double d2 = this.A01;
        StringBuilder A0t = BE6.A0t(60);
        A0t.append("lat/lng: (");
        A0t.append(d);
        BE6.A1K(A0t);
        A0t.append(d2);
        return AnonymousClass8BU.A0q(A0t);
    }

    public LatLng(double d, double d2) {
        this.A01 = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d : d2;
        this.A00 = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        double d = this.A00;
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        double d2 = this.A01;
        parcel.writeInt(524291);
        parcel.writeDouble(d2);
        C26293Cx2.A05(parcel, A002);
    }
}
