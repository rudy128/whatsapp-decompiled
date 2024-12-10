package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1d  reason: case insensitive filesystem */
public final class C26490D1d implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.BcH] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                z = C26300CxD.A0M(parcel, c, 4, readInt, z);
            } else {
                i3 = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = i2;
        obj.A02 = i3;
        obj.A03 = z;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23161BcH[i];
    }
}
