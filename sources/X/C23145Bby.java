package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: X.Bby  reason: case insensitive filesystem */
public final class C23145Bby extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23145Bby)) {
            return false;
        }
        String str = this.A00;
        String str2 = ((C23145Bby) obj).A00;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = "CastId";
        A1b[1] = this.A00;
        return String.format(locale, "DataElement<type: %s, Id: %s>", A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, str, 1, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23145Bby(String str) {
        C18210vx.A07(BE8.A1U(str.length(), 32), "Cast id should be at most 32 characters.");
        this.A00 = str;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 17);
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }
}
