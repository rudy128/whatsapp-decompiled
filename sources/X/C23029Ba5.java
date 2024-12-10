package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Ba5  reason: case insensitive filesystem */
public final class C23029Ba5 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Intent A00;

    public C23029Ba5(Intent intent) {
        this.A00 = intent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A00, 1, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
