package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0C implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C23362Bfo A01;
        C23362Bfo A012;
        int A02 = C26300CxD.A02(parcel);
        C23362Bfo bfo = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = C26300CxD.A0O(parcel, readInt);
            } else if (c == 2) {
                bArr2 = C26300CxD.A0O(parcel, readInt);
            } else if (c != 3) {
                i = C26300CxD.A05(parcel, c, readInt, i);
            } else {
                bArr3 = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        if (bArr == null) {
            A01 = null;
        } else {
            A01 = DSS.A01(bArr, bArr.length);
        }
        if (bArr2 == null) {
            A012 = null;
        } else {
            A012 = DSS.A01(bArr2, bArr2.length);
        }
        if (bArr3 != null) {
            bfo = DSS.A01(bArr3, bArr3.length);
        }
        return new C23159BcF(A01, A012, bfo, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23159BcF[i];
    }
}
