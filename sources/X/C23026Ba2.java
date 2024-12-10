package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: X.Ba2  reason: case insensitive filesystem */
public final class C23026Ba2 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public Bundle A00;
    public Map A01;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A03(this.A00, parcel, 2);
        C26293Cx2.A05(parcel, A002);
    }
}
