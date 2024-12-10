package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BbR  reason: case insensitive filesystem */
public class C23112BbR extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C23112BbR)) {
            return false;
        }
        return DJ0.A0H(((C23112BbR) obj).A00, Integer.valueOf(this.A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C26293Cx2.A05(parcel, C26293Cx2.A01(parcel, this.A00));
    }

    public C23112BbR(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }
}
