package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BbA  reason: case insensitive filesystem */
public class C23095BbA extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C23096BbB A00;
    public String A01;
    public String A02;
    public C23045BaM[] A03;
    public C23085Bb0[] A04;
    public C23047BaO[] A05;
    public String[] A06;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A00, i);
        C26293Cx2.A0A(parcel, this.A01, 3, A0J);
        C26293Cx2.A0A(parcel, this.A02, 4, A0J);
        C26293Cx2.A0F(parcel, this.A05, 5, i);
        C26293Cx2.A0F(parcel, this.A04, 6, i);
        C26293Cx2.A0G(parcel, this.A06, 7);
        C26293Cx2.A0F(parcel, this.A03, 8, i);
        C26293Cx2.A05(parcel, A002);
    }
}
