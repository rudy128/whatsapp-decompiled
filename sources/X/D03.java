package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class D03 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
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
                str = C26300CxD.A0E(parcel, str, c, 4, readInt);
            } else {
                pendingIntent = (PendingIntent) C26300CxD.A0A(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23203Bcx(pendingIntent, str, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23203Bcx[i];
    }
}
