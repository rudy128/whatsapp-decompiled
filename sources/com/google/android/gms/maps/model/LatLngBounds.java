package com.google.android.gms.maps.model;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BE8;
import X.C18210vx;
import X.C26293Cx2;
import X.CYH;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLngBounds extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final LatLng A00;
    public final LatLng A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LatLngBounds) {
                LatLngBounds latLngBounds = (LatLngBounds) obj;
                if (!this.A01.equals(latLngBounds.A01) || !this.A00.equals(latLngBounds.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean A00(LatLng latLng) {
        C18210vx.A02(latLng, "point must not be null.");
        double d = latLng.A00;
        LatLng latLng2 = this.A01;
        if (latLng2.A00 > d) {
            return false;
        }
        LatLng latLng3 = this.A00;
        if (d > latLng3.A00) {
            return false;
        }
        double d2 = latLng.A01;
        double d3 = latLng2.A01;
        double d4 = latLng3.A01;
        int i = (d3 > d2 ? 1 : (d3 == d2 ? 0 : -1));
        if (d3 <= d4) {
            if (i > 0) {
                return false;
            }
        } else if (i <= 0) {
            return true;
        }
        if (d2 <= d4) {
            return true;
        }
        return false;
    }

    public String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A01, "southwest");
        cyh.A00(this.A00, "northeast");
        return cyh.toString();
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C18210vx.A02(latLng, "southwest must not be null.");
        C18210vx.A02(latLng2, "northeast must not be null.");
        double d = latLng2.A00;
        double d2 = latLng.A00;
        boolean A1Q = AnonymousClass000.A1Q((d > d2 ? 1 : (d == d2 ? 0 : -1)));
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = Double.valueOf(d2);
        A1b[1] = Double.valueOf(d);
        if (A1Q) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        throw BE8.A0X("southern latitude exceeds northern latitude (%s > %s)", A1b);
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A00, 3, i, DJ0.A0J(parcel, this.A01, i));
        C26293Cx2.A05(parcel, A002);
    }
}
