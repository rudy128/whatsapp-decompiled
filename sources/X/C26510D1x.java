package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1x  reason: case insensitive filesystem */
public final class C26510D1x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Intent intent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                intent = (Intent) C26300CxD.A0A(parcel, Intent.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23211Bd6(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23211Bd6[i];
    }
}
