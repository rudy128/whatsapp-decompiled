package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D09 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            z = C26300CxD.A0N(parcel, z);
        }
        C26300CxD.A0H(parcel, A02);
        return new C23119BbY(z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23119BbY[i];
    }
}
