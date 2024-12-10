package com.google.android.gms.location;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;
import X.BE8;
import X.C17890vO;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationRequest extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public float A00 = 0.0f;
    public int A01 = 102;
    public int A02 = Integer.MAX_VALUE;
    public long A03 = 3600000;
    public long A04 = 600000;
    public long A05 = Long.MAX_VALUE;
    public long A06 = 0;
    public boolean A07 = false;
    public boolean A08 = false;

    public void A00(long j) {
        if (j >= 0) {
            this.A03 = j;
            if (!this.A07) {
                this.A04 = (long) (((double) j) / 6.0d);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k(C17890vO.A0a("invalid interval: ", BE6.A0t(38), j));
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.A01 == locationRequest.A01) {
                long j = this.A03;
                long j2 = locationRequest.A03;
                if (j == j2 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A05 == locationRequest.A05 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                    long j3 = this.A06;
                    if (j3 >= j) {
                        j = j3;
                    }
                    long j4 = locationRequest.A06;
                    if (j4 >= j2) {
                        j2 = j4;
                    }
                    if (j == j2 && this.A08 == locationRequest.A08) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, this.A01);
        C17890vO.A1M(A1a, this.A03);
        BE8.A1K(A1a, this.A00);
        C17890vO.A1O(A1a, this.A06);
        return Arrays.hashCode(A1a);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Request[");
        int i = this.A01;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        A10.append(str);
        if (i != 105) {
            A10.append(" requested=");
            A10.append(this.A03);
            A10.append("ms");
        }
        A10.append(" fastest=");
        A10.append(this.A04);
        A10.append("ms");
        long j = this.A06;
        if (j > this.A03) {
            A10.append(" maxWait=");
            A10.append(j);
            A10.append("ms");
        }
        float f = this.A00;
        if (f > 0.0f) {
            A10.append(" smallestDisplacement=");
            A10.append(f);
            A10.append("m");
        }
        long j2 = this.A05;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A10.append(" expireIn=");
            A10.append(j2 - elapsedRealtime);
            A10.append("ms");
        }
        int i2 = this.A02;
        if (i2 != Integer.MAX_VALUE) {
            A10.append(" num=");
            A10.append(i2);
        }
        return C17890vO.A0c(A10, ']');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A01);
        C26293Cx2.A07(parcel, 2, this.A03);
        C26293Cx2.A07(parcel, 3, this.A04);
        C26293Cx2.A08(parcel, 4, this.A07);
        C26293Cx2.A07(parcel, 5, this.A05);
        C26293Cx2.A06(parcel, 6, this.A02);
        float f = this.A00;
        BE7.A0z(7, parcel);
        parcel.writeFloat(f);
        C26293Cx2.A07(parcel, 8, this.A06);
        C26293Cx2.A08(parcel, 9, this.A08);
        C26293Cx2.A05(parcel, A002);
    }
}
