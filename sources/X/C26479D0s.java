package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0s  reason: case insensitive filesystem */
public final class C26479D0s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        while (parcel.dataPosition() < A02) {
            C26300CxD.A0I(parcel, parcel.readInt());
        }
        C26300CxD.A0H(parcel, A02);
        return new Object();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23108BbN[i];
    }
}
