package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BbU  reason: case insensitive filesystem */
public class C23115BbU extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C23115BbU) || this.A00 != ((C23115BbU) obj).A00) {
            return false;
        }
        return true;
    }

    public C23115BbU(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1N(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
