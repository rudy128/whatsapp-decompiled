package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb0  reason: case insensitive filesystem */
public class C23085Bb0 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 3, false);
        C26293Cx2.A0A(parcel, this.A03, 4, false);
        C26293Cx2.A0A(parcel, this.A02, 5, false);
        C26293Cx2.A05(parcel, A002);
    }
}
