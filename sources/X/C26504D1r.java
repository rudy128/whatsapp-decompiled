package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1r  reason: case insensitive filesystem */
public final class C26504D1r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            str = C26300CxD.A0E(parcel, str, (char) readInt, 2, readInt);
        }
        C26300CxD.A0H(parcel, A02);
        return new C23032Ba8(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23032Ba8[i];
    }
}
