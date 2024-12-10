package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABv  reason: case insensitive filesystem */
public final class C20211ABv implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.ADS, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean A02 = A3Y.A02(parcel);
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        String readString = parcel.readString();
        ? obj = new Object();
        obj.A03 = A02;
        obj.A00 = readLong;
        obj.A01 = readLong2;
        obj.A02 = readString;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADS[i];
    }
}
