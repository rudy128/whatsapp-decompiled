package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbG  reason: case insensitive filesystem */
public class C23101BbG extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A05);
        C26293Cx2.A0A(parcel, this.A07, 3, A0L);
        C26293Cx2.A0A(parcel, this.A0D, 4, A0L);
        C26293Cx2.A0A(parcel, this.A0B, 5, A0L);
        C26293Cx2.A0A(parcel, this.A08, 6, A0L);
        C26293Cx2.A0A(parcel, this.A02, 7, A0L);
        C26293Cx2.A0A(parcel, this.A00, 8, A0L);
        C26293Cx2.A0A(parcel, this.A01, 9, A0L);
        C26293Cx2.A0A(parcel, this.A03, 10, A0L);
        C26293Cx2.A0A(parcel, this.A0C, 11, A0L);
        C26293Cx2.A0A(parcel, this.A09, 12, A0L);
        C26293Cx2.A0A(parcel, this.A06, 13, A0L);
        C26293Cx2.A0A(parcel, this.A04, 14, A0L);
        C26293Cx2.A0A(parcel, this.A0A, 15, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
