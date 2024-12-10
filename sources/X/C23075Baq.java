package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Baq  reason: case insensitive filesystem */
public class C23075Baq extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public String A02;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A01, 3, DJ0.A0L(parcel, this.A02));
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
