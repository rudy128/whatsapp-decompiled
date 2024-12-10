package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0Y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23362Bfo bfo = null;
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                bArr = C26300CxD.A0P(parcel, bArr, c, 2, readInt);
            } else {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            }
        }
        C26300CxD.A0H(parcel, A02);
        if (bArr != null) {
            bfo = DSS.A01(bArr, bArr.length);
        }
        return new C23172BcS(bfo, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23172BcS[i];
    }
}
