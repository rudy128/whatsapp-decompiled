package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czi  reason: case insensitive filesystem */
public final class C26443Czi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                intent = (Intent) C26300CxD.A0A(parcel, Intent.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23029Ba5(intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23029Ba5[i];
    }
}
