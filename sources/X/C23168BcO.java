package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BcO  reason: case insensitive filesystem */
public final class C23168BcO extends DJ0 {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public String A01;
    public boolean A02;
    public final LocationRequest A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (obj instanceof C23168BcO) {
            C23168BcO bcO = (C23168BcO) obj;
            if (!C25332Cdd.A01(this.A03, bcO.A03) || !C25332Cdd.A01(this.A06, bcO.A06) || !C25332Cdd.A01(this.A04, bcO.A04) || this.A07 != bcO.A07 || this.A08 != bcO.A08 || this.A09 != bcO.A09 || !C25332Cdd.A01(this.A05, bcO.A05) || this.A0A != bcO.A0A || this.A02 != bcO.A02 || !C25332Cdd.A01(this.A01, bcO.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public C23168BcO(LocationRequest locationRequest, String str, String str2, String str3, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = locationRequest;
        this.A06 = list;
        this.A04 = str;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A05 = str2;
        this.A0A = z4;
        this.A02 = z5;
        this.A01 = str3;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A03);
        String str = this.A04;
        if (str != null) {
            A10.append(" tag=");
            A10.append(str);
        }
        String str2 = this.A05;
        if (str2 != null) {
            A10.append(" moduleId=");
            A10.append(str2);
        }
        String str3 = this.A01;
        if (str3 != null) {
            A10.append(" contextAttributionTag=");
            A10.append(str3);
        }
        A10.append(" hideAppOps=");
        A10.append(this.A07);
        A10.append(" clients=");
        A10.append(this.A06);
        A10.append(" forceCoarseLocation=");
        A10.append(this.A08);
        if (this.A09) {
            A10.append(" exemptFromBackgroundThrottle");
        }
        if (this.A0A) {
            A10.append(" locationSettingsIgnored");
        }
        if (this.A02) {
            A10.append(" inaccurateLocationsDelayed");
        }
        return A10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0I = DJ0.A0I(parcel, this.A03, i);
        C26293Cx2.A0C(parcel, this.A06, 5, A0I);
        C26293Cx2.A0A(parcel, this.A04, 6, A0I);
        C26293Cx2.A08(parcel, 7, this.A07);
        C26293Cx2.A08(parcel, 8, this.A08);
        C26293Cx2.A08(parcel, 9, this.A09);
        C26293Cx2.A0A(parcel, this.A05, 10, A0I);
        C26293Cx2.A08(parcel, 11, this.A0A);
        C26293Cx2.A08(parcel, 12, this.A02);
        C26293Cx2.A0A(parcel, this.A01, 13, A0I);
        C26293Cx2.A07(parcel, 14, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
