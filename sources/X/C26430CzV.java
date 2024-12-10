package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzV  reason: case insensitive filesystem */
public final class C26430CzV implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        C23126Bbf bbf = null;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bbf = (C23126Bbf) C26300CxD.A0A(parcel, C23126Bbf.CREATOR, readInt);
            } else if (c != 2) {
                i = C26300CxD.A06(parcel, c, 3, readInt, i);
            } else {
                str = C26300CxD.A0D(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23131Bbk(bbf, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23131Bbk[i];
    }
}
