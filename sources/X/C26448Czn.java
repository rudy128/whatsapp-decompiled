package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czn  reason: case insensitive filesystem */
public final class C26448Czn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = C26300CxD.A0E(parcel, str, c, 2, readInt);
            } else {
                i = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23149Bc2(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23149Bc2[i];
    }
}
