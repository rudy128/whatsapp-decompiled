package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class D1S implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Status status = null;
        C23092Bb7 bb7 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C26300CxD.A0A(parcel, Status.CREATOR, readInt);
            } else if (c != 2) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bb7 = (C23092Bb7) C26300CxD.A0A(parcel, C23092Bb7.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23209Bd4(status, bb7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23209Bd4[i];
    }
}
