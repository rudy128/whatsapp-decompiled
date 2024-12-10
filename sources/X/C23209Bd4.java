package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Bd4  reason: case insensitive filesystem */
public final class C23209Bd4 extends DJ0 implements E5A {
    public static final Parcelable.Creator CREATOR = new Object();
    public final Status A00;
    public final C23092Bb7 A01;

    public Status BZg() {
        return this.A00;
    }

    public C23209Bd4(Status status, C23092Bb7 bb7) {
        this.A00 = status;
        this.A01 = bb7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A01, 2, i, DJ0.A0I(parcel, this.A00, i));
        C26293Cx2.A05(parcel, A002);
    }
}
