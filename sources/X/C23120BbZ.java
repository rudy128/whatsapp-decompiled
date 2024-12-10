package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BbZ  reason: case insensitive filesystem */
public final class C23120BbZ extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23120BbZ)) {
            return false;
        }
        return this.A00.equals(((C23120BbZ) obj).A00);
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

    public C23120BbZ(String str) {
        C18210vx.A00(str);
        this.A00 = str;
    }
}
