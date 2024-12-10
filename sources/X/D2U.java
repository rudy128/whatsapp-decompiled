package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class D2U implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 3) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C26300CxD.A0A(parcel, ParcelFileDescriptor.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23055BaW(parcelFileDescriptor, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23055BaW[i];
    }
}
