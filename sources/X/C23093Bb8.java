package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb8  reason: case insensitive filesystem */
public final class C23093Bb8 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A06(parcel, 3, this.A02);
        C26293Cx2.A06(parcel, 4, this.A03);
        C26293Cx2.A08(parcel, 5, this.A04);
        C26293Cx2.A08(parcel, 6, this.A05);
        float f = this.A00;
        BE7.A0z(7, parcel);
        parcel.writeFloat(f);
        C26293Cx2.A05(parcel, A002);
    }
}
