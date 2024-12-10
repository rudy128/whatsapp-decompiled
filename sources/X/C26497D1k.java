package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1k  reason: case insensitive filesystem */
public final class C26497D1k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 2) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c == 3) {
                bArr2 = C26300CxD.A0O(parcel, readInt);
            } else if (c != 4) {
                i = C26300CxD.A06(parcel, c, 5, readInt, i);
            } else {
                bArr3 = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23166BcM(str, bArr, bArr2, bArr3, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23166BcM[i];
    }
}
