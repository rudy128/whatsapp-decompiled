package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0X implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C23362Bfo A01;
        int A02 = C26300CxD.A02(parcel);
        C23362Bfo bfo = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                bArr2 = C26300CxD.A0P(parcel, bArr2, c, 2, readInt);
            } else {
                bArr = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        if (bArr == null) {
            A01 = null;
        } else {
            A01 = DSS.A01(bArr, bArr.length);
        }
        if (bArr2 != null) {
            bfo = DSS.A01(bArr2, bArr2.length);
        }
        return new C23127Bbg(A01, bfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23127Bbg[i];
    }
}
