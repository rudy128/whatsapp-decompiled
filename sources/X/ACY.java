package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ACY implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Abg] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean A02 = A3Y.A02(parcel);
        String readString = parcel.readString();
        boolean A01 = A3Y.A01(parcel);
        ? obj = new Object();
        obj.A01 = A02;
        obj.A00 = readString;
        obj.A02 = A01;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20926Abg[i];
    }
}
