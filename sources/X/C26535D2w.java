package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2w  reason: case insensitive filesystem */
public class C26535D2w implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ba2, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bundle = C26300CxD.A08(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = bundle;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23026Ba2[i];
    }
}
