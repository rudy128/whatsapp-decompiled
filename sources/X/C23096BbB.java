package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbB  reason: case insensitive filesystem */
public class C23096BbB extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A01);
        C26293Cx2.A0A(parcel, this.A05, 3, A0L);
        C26293Cx2.A0A(parcel, this.A04, 4, A0L);
        C26293Cx2.A0A(parcel, this.A00, 5, A0L);
        C26293Cx2.A0A(parcel, this.A03, 6, A0L);
        C26293Cx2.A0A(parcel, this.A02, 7, A0L);
        C26293Cx2.A0A(parcel, this.A06, 8, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
