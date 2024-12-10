package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1Z implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Ba7] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            str = C26300CxD.A0E(parcel, str, (char) readInt, 2, readInt);
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        C18210vx.A02(str, "json must not be null");
        obj.A00 = str;
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23031Ba7[i];
    }
}
