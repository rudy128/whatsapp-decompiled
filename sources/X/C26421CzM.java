package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzM  reason: case insensitive filesystem */
public final class C26421CzM implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c != 3) {
                z2 = C26300CxD.A0M(parcel, c, 4, readInt, z2);
            } else {
                j = C26300CxD.A07(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23080Bav(i, j, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23080Bav[i];
    }
}
