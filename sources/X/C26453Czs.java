package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czs  reason: case insensitive filesystem */
public final class C26453Czs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c == 3) {
                z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c != 4) {
                i3 = C26300CxD.A06(parcel, c, 5, readInt, i3);
            } else {
                C26300CxD.A0K(parcel, readInt, 4);
                i2 = parcel.readInt();
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23087Bb2(i, i2, i3, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23087Bb2[i];
    }
}
