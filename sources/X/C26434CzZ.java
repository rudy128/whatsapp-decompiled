package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzZ  reason: case insensitive filesystem */
public final class C26434CzZ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bundle = C26300CxD.A08(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23070Bal(bundle, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23070Bal[i];
    }
}
