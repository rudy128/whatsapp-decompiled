package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bba  reason: case insensitive filesystem */
public final class C23121Bba extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23121Bba)) {
            return false;
        }
        return C25332Cdd.A01(this.A00, ((C23121Bba) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(AnonymousClass8BV.A1b(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, str, 1, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23121Bba(String str) {
        this.A00 = str;
    }
}
