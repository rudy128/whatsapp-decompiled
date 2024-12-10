package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1i  reason: case insensitive filesystem */
public final class C26495D1i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c != 2) {
                bArr3 = C26300CxD.A0P(parcel, bArr3, c, 3, readInt);
            } else {
                bArr2 = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23155BcB(bArr, bArr2, bArr3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23155BcB[i];
    }
}
