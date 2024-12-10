package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Bbz  reason: case insensitive filesystem */
public final class C23146Bbz extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23146Bbz) || this.A00 != ((C23146Bbz) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = "DeviceType";
        AnonymousClass000.A1M(A1b, this.A00);
        return String.format(locale, "DataElement<type: %s, value: %d>", A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C26293Cx2.A05(parcel, C26293Cx2.A01(parcel, this.A00));
    }

    public C23146Bbz(int i) {
        this.A00 = i;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 22);
        AnonymousClass000.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
