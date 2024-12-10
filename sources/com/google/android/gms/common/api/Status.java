package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.BE6;
import X.C23203Bcx;
import X.C24600CAw;
import X.C25332Cdd;
import X.C26293Cx2;
import X.CYH;
import X.DJ0;
import X.E5A;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Status extends DJ0 implements E5A, ReflectedParcelable {
    public static final Status A04 = new Status(16, (String) null);
    public static final Status A05 = new Status(18, (String) null);
    public static final Status A06 = new Status(8, (String) null);
    public static final Status A07 = new Status(14, (String) null);
    public static final Status A08 = new Status(0, (String) null);
    public static final Status A09 = new Status(-1, (String) null);
    public static final Status A0A = new Status(15, (String) null);
    public static final Status A0B = new Status(17, (String) null);
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final PendingIntent A01;
    public final C23203Bcx A02;
    public final String A03;

    public Status(int i, String str) {
        this((PendingIntent) null, (C23203Bcx) null, str, i);
    }

    public Status BZg() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.A00 != status.A00 || !C25332Cdd.A01(this.A03, status.A03) || !C25332Cdd.A01(this.A01, status.A01) || !C25332Cdd.A01(this.A02, status.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        CYH cyh = new CYH(this);
        String str = this.A03;
        if (str == null) {
            str = C24600CAw.A00(this.A00);
        }
        cyh.A00(str, "statusCode");
        cyh.A00(this.A01, "resolution");
        return cyh.toString();
    }

    public int hashCode() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        A1a[1] = this.A03;
        A1a[2] = this.A01;
        return AnonymousClass000.A0P(this.A02, A1a, 3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        boolean A0L = DJ0.A0L(parcel, this.A03);
        C26293Cx2.A09(parcel, this.A01, 3, i, A0L);
        C26293Cx2.A09(parcel, this.A02, 4, i, A0L);
        C26293Cx2.A05(parcel, A002);
    }

    public Status(PendingIntent pendingIntent, C23203Bcx bcx, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = pendingIntent;
        this.A02 = bcx;
    }
}
