package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D2h  reason: case insensitive filesystem */
public final class C26520D2h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 4) {
                str2 = C26300CxD.A0E(parcel, str2, c, 5, readInt);
            } else {
                bArr = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23107BbM(str, str2, bArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23107BbM[i];
    }
}
