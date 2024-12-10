package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzT  reason: case insensitive filesystem */
public final class C26428CzT implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        byte[] bArr = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c != 2) {
                str = C26300CxD.A0E(parcel, str, c, 3, readInt);
            } else {
                bArr = C26300CxD.A0O(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23130Bbj(bArr, str, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23130Bbj[i];
    }
}
