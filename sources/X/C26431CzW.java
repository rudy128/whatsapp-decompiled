package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzW  reason: case insensitive filesystem */
public final class C26431CzW implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) C26300CxD.A0A(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23113BbS(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23113BbS[i];
    }
}
