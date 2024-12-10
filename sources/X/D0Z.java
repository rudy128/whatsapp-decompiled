package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0Z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c == 3) {
                bArr2 = C26300CxD.A0O(parcel, readInt);
            } else if (c == 4) {
                bArr3 = C26300CxD.A0O(parcel, readInt);
            } else if (c != 5) {
                bArr5 = C26300CxD.A0P(parcel, bArr5, c, 6, readInt);
            } else {
                bArr4 = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23230Bdg(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23230Bdg[i];
    }
}
