package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bc0  reason: case insensitive filesystem */
public final class C23147Bc0 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23147Bc0) || this.A00 != ((C23147Bc0) obj).A00) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C26293Cx2.A05(parcel, C26293Cx2.A01(parcel, this.A00));
    }

    public C23147Bc0(int i) {
        this.A00 = i;
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PresenceAction[action=");
        A10.append(this.A00);
        return C17890vO.A0c(A10, ']');
    }
}
