package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2p  reason: case insensitive filesystem */
public final class C26528D2p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 2) {
                bArr = C26300CxD.A0P(parcel, bArr, c, 3, readInt);
            } else {
                i2 = C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23078Bat(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23078Bat[i];
    }
}
