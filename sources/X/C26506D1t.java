package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1t  reason: case insensitive filesystem */
public final class C26506D1t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23073Bao[] baoArr = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = C26300CxD.A07(parcel, readInt);
            } else if (c == 3) {
                baoArr = (C23073Bao[]) C26300CxD.A0R(parcel, C23073Bao.CREATOR, readInt);
            } else if (c != 4) {
                z = C26300CxD.A0M(parcel, c, 5, readInt, z);
            } else {
                C26300CxD.A0K(parcel, readInt, 4);
                i = parcel.readInt();
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23084Baz(baoArr, i, j, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23084Baz[i];
    }
}
