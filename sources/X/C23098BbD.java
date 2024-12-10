package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbD  reason: case insensitive filesystem */
public class C23098BbD extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A06(parcel, 3, this.A02);
        C26293Cx2.A07(parcel, 4, this.A05);
        C26293Cx2.A07(parcel, 5, this.A06);
        C26293Cx2.A0A(parcel, this.A07, 6, false);
        C26293Cx2.A0A(parcel, this.A08, 7, false);
        C26293Cx2.A06(parcel, 8, this.A03);
        C26293Cx2.A06(parcel, 9, this.A04);
        C26293Cx2.A05(parcel, A012);
    }

    public C23098BbD(String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = j;
        this.A06 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i4;
        this.A04 = i5;
    }
}
