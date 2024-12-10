package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.Ban  reason: case insensitive filesystem */
public final class C23072Ban extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    @Deprecated
    public final ClientAppContext A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A09(parcel, this.A02, 2, i, false);
        C26293Cx2.A06(parcel, 3, this.A01);
        C26293Cx2.A05(parcel, A012);
    }

    public C23072Ban(ClientAppContext clientAppContext, int i, int i2) {
        this.A00 = i;
        this.A02 = clientAppContext;
        this.A01 = i2;
    }
}
