package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABV implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.ADK] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        boolean A01 = A3Y.A01(parcel);
        ? obj = new Object();
        obj.A00 = A0y;
        obj.A01 = A01;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADK[i];
    }
}
