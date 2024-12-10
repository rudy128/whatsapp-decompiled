package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0e  reason: case insensitive filesystem */
public final class C26465D0e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = C26300CxD.A07(parcel, readInt);
            } else if (c == 2) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c != 3) {
                bArr3 = C26300CxD.A0P(parcel, bArr3, c, 4, readInt);
            } else {
                bArr2 = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23133Bbm(bArr, bArr2, bArr3, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23133Bbm[i];
    }
}
