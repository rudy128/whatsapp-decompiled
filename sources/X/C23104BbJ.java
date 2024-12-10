package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbJ  reason: case insensitive filesystem */
public class C23104BbJ extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public C23094Bb9 A02;
    public C23095BbA A03;
    public C23101BbG A04;
    public C23085Bb0 A05;
    public C23046BaN A06;
    public C23047BaO A07;
    public C23048BaP A08;
    public C23049BaQ A09;
    public C23075Baq A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A0A(parcel, this.A0C, 3, false);
        C26293Cx2.A0A(parcel, this.A0B, 4, false);
        C26293Cx2.A06(parcel, 5, this.A01);
        C26293Cx2.A0F(parcel, this.A0F, 6, i);
        C26293Cx2.A09(parcel, this.A05, 7, i, false);
        C26293Cx2.A09(parcel, this.A07, 8, i, false);
        C26293Cx2.A09(parcel, this.A08, 9, i, false);
        C26293Cx2.A09(parcel, this.A0A, 10, i, false);
        C26293Cx2.A09(parcel, this.A09, 11, i, false);
        C26293Cx2.A09(parcel, this.A06, 12, i, false);
        C26293Cx2.A09(parcel, this.A02, 13, i, false);
        C26293Cx2.A09(parcel, this.A03, 14, i, false);
        C26293Cx2.A09(parcel, this.A04, 15, i, false);
        C26293Cx2.A0D(parcel, this.A0E, 16, false);
        C26293Cx2.A08(parcel, 17, this.A0D);
        C26293Cx2.A05(parcel, A002);
    }
}
