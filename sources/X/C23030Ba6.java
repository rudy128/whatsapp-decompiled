package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Ba6  reason: case insensitive filesystem */
public final class C23030Ba6 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C23030Ba6(String str) {
        C18210vx.A00(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, 1);
        DJ0.A0G(parcel, this.A00, A002);
    }
}
