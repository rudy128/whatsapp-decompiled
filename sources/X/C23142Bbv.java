package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Bbv  reason: case insensitive filesystem */
public final class C23142Bbv extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Uri A00;
    public final C23204Bcy A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (obj instanceof C23142Bbv) {
            C23142Bbv bbv = (C23142Bbv) obj;
            if (!C25332Cdd.A01(this.A02, bbv.A02) || !C25332Cdd.A01(this.A03, bbv.A03) || !C25332Cdd.A01(this.A04, bbv.A04) || !C25332Cdd.A01(this.A05, bbv.A05) || !C25332Cdd.A01(this.A00, bbv.A00) || !C25332Cdd.A01(this.A06, bbv.A06) || !C25332Cdd.A01(this.A07, bbv.A07) || !C25332Cdd.A01(this.A08, bbv.A08) || !C25332Cdd.A01(this.A01, bbv.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A02, 9);
        A1b[1] = this.A03;
        A1b[2] = this.A04;
        A1b[3] = this.A05;
        A1b[4] = this.A00;
        A1b[5] = this.A06;
        A1b[6] = this.A07;
        A1b[7] = this.A08;
        return AnonymousClass000.A0P(this.A01, A1b, 8);
    }

    public C23142Bbv(Uri uri, C23204Bcy bcy, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C18210vx.A00(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = bcy;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A02);
        C26293Cx2.A0A(parcel, this.A03, 2, A0K);
        C26293Cx2.A0A(parcel, this.A04, 3, A0K);
        C26293Cx2.A0A(parcel, this.A05, 4, A0K);
        C26293Cx2.A09(parcel, this.A00, 5, i, A0K);
        C26293Cx2.A0A(parcel, this.A06, 6, A0K);
        C26293Cx2.A0A(parcel, this.A07, 7, A0K);
        C26293Cx2.A0A(parcel, this.A08, 8, A0K);
        C26293Cx2.A09(parcel, this.A01, 9, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }
}
