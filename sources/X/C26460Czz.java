package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czz  reason: case insensitive filesystem */
public final class C26460Czz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        C23196Bcq bcq = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bcq = (C23196Bcq) C26300CxD.A0A(parcel, C23196Bcq.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23179BcZ(bcq, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23179BcZ[i];
    }
}
