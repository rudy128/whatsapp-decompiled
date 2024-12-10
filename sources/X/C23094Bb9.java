package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb9  reason: case insensitive filesystem */
public class C23094Bb9 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C23097BbC A00;
    public C23097BbC A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A06);
        C26293Cx2.A0A(parcel, this.A02, 3, A0L);
        C26293Cx2.A0A(parcel, this.A03, 4, A0L);
        C26293Cx2.A0A(parcel, this.A04, 5, A0L);
        C26293Cx2.A0A(parcel, this.A05, 6, A0L);
        C26293Cx2.A09(parcel, this.A01, 7, i, A0L);
        C26293Cx2.A09(parcel, this.A00, 8, i, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
