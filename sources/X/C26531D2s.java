package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2s  reason: case insensitive filesystem */
public final class C26531D2s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                b = (byte) C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                str = C26300CxD.A0E(parcel, str, c, 4, readInt);
            } else {
                b2 = (byte) C26300CxD.A03(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23156BcC(str, b, b2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23156BcC[i];
    }
}
