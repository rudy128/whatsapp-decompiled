package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Ba8  reason: case insensitive filesystem */
public final class C23032Ba8 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C23032Ba8(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        DJ0.A0G(parcel, this.A00, C26293Cx2.A00(parcel));
    }
}
