package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.D0o  reason: case insensitive filesystem */
public final class C26475D0o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        Status status = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                status = (Status) C26300CxD.A0A(parcel, Status.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23208Bd3(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23208Bd3[i];
    }
}
