package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbC  reason: case insensitive filesystem */
public class C23097BbC extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;
    public boolean A07;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A05);
        C26293Cx2.A06(parcel, 3, this.A03);
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A06(parcel, 5, this.A01);
        C26293Cx2.A06(parcel, 6, this.A02);
        C26293Cx2.A06(parcel, 7, this.A04);
        C26293Cx2.A08(parcel, 8, this.A07);
        C26293Cx2.A0A(parcel, this.A06, 9, false);
        C26293Cx2.A05(parcel, A002);
    }
}
