package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcn  reason: case insensitive filesystem */
public final class C23193Bcn extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C23193Bcn(C24371C0l c0l, String str, int i) {
        C18210vx.A00(str);
        this.A04 = str;
        this.A03 = i;
        this.A00 = -1;
        this.A01 = "VISION";
        this.A05 = null;
        this.A06 = null;
        this.A07 = true;
        this.A08 = false;
        this.A02 = c0l.value;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23193Bcn) {
                C23193Bcn bcn = (C23193Bcn) obj;
                if (!(C25332Cdd.A01(this.A04, bcn.A04) && this.A03 == bcn.A03 && this.A00 == bcn.A00 && C25332Cdd.A01(this.A01, bcn.A01) && C25332Cdd.A01(this.A05, bcn.A05) && C25332Cdd.A01(this.A06, bcn.A06) && this.A07 == bcn.A07 && this.A08 == bcn.A08 && this.A02 == bcn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A04;
        AnonymousClass000.A1M(objArr, this.A03);
        AnonymousClass3Ma.A1S(objArr, this.A00);
        objArr[3] = this.A01;
        objArr[4] = this.A05;
        objArr[5] = this.A06;
        objArr[6] = Boolean.valueOf(this.A07);
        objArr[7] = Boolean.valueOf(this.A08);
        return AnonymousClass000.A0P(Integer.valueOf(this.A02), objArr, 8);
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlayLoggerContext[");
        A10.append("package=");
        A10.append(this.A04);
        A10.append(',');
        A10.append("packageVersionCode=");
        A10.append(this.A03);
        A10.append(',');
        A10.append("logSource=");
        A10.append(this.A00);
        A10.append(',');
        A10.append("logSourceName=");
        A10.append(this.A01);
        A10.append(',');
        A10.append("uploadAccount=");
        A10.append(this.A05);
        A10.append(',');
        A10.append("loggingId=");
        A10.append(this.A06);
        A10.append(',');
        A10.append("logAndroidId=");
        A10.append(this.A07);
        A10.append(',');
        A10.append("isAnonymous=");
        A10.append(this.A08);
        A10.append(',');
        A10.append("qosTier=");
        A10.append(this.A02);
        return AnonymousClass000.A0z(A10);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A04);
        C26293Cx2.A06(parcel, 3, this.A03);
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A0A(parcel, this.A05, 5, A0L);
        C26293Cx2.A0A(parcel, this.A06, 6, A0L);
        C26293Cx2.A08(parcel, 7, this.A07);
        C26293Cx2.A0A(parcel, this.A01, 8, A0L);
        C26293Cx2.A08(parcel, 9, this.A08);
        C26293Cx2.A06(parcel, 10, this.A02);
        C26293Cx2.A05(parcel, A002);
    }

    public C23193Bcn(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A01 = str4;
        this.A08 = z2;
        this.A02 = i3;
    }
}
