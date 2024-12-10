package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.D2r  reason: case insensitive filesystem */
public final class C26530D2r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        long j = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 3) {
                j = C26300CxD.A07(parcel, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23077Bas.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23079Bau(arrayList, i, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23079Bau[i];
    }
}
