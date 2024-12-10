package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.BaW  reason: case insensitive filesystem */
public final class C23055BaW extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final ParcelFileDescriptor A01;

    public C23055BaW(ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.A00 = i;
        this.A01 = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        DJ0.A0F(parcel, this.A01, i, A002);
    }
}
