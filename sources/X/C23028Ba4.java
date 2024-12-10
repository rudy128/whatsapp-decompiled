package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Ba4  reason: case insensitive filesystem */
public final class C23028Ba4 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final PendingIntent A00;

    public C23028Ba4(PendingIntent pendingIntent) {
        C18210vx.A00(pendingIntent);
        this.A00 = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A00, 1, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
