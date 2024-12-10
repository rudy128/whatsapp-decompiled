package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb1  reason: case insensitive filesystem */
public final class C23086Bb1 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C23086Bb1(float f, float f2, int i, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A03);
        float f = this.A00;
        BE7.A0z(2, parcel);
        parcel.writeFloat(f);
        float f2 = this.A01;
        BE7.A0z(3, parcel);
        parcel.writeFloat(f2);
        C26293Cx2.A06(parcel, 4, this.A02);
        C26293Cx2.A05(parcel, A002);
    }
}
