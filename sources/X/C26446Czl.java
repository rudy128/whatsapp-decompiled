package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Czl  reason: case insensitive filesystem */
public final class C26446Czl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C23203Bcx bcx = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c == 2) {
                str = C26300CxD.A0D(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) C26300CxD.A0A(parcel, PendingIntent.CREATOR, readInt);
            } else if (c != 4) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bcx = (C23203Bcx) C26300CxD.A0A(parcel, C23203Bcx.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new Status(pendingIntent, bcx, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
