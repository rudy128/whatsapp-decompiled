package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaO  reason: case insensitive filesystem */
public class C23047BaO extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 3, false);
        C26293Cx2.A05(parcel, A002);
    }
}
