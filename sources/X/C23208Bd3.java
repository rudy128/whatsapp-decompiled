package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Bd3  reason: case insensitive filesystem */
public final class C23208Bd3 extends DJ0 implements E5A {
    public static final C23208Bd3 A01 = new C23208Bd3(Status.A08);
    public static final Parcelable.Creator CREATOR = new Object();
    public final Status A00;

    public final Status BZg() {
        return this.A00;
    }

    public C23208Bd3(Status status) {
        this.A00 = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A00, 1, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
