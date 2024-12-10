package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1s  reason: case insensitive filesystem */
public final class C26505D1s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                i = C26300CxD.A05(parcel, c, readInt, i);
            } else {
                bArr = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23073Bao(str, bArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23073Bao[i];
    }
}
