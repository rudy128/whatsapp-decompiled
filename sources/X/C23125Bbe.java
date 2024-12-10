package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Bbe  reason: case insensitive filesystem */
public final class C23125Bbe extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23125Bbe) {
                C23125Bbe bbe = (C23125Bbe) obj;
                if (this.A01 != bbe.A01 || !C25332Cdd.A01(this.A00, bbe.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C23125Bbe(boolean z, String str) {
        if (z) {
            C18210vx.A00(str);
        }
        this.A01 = z;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1N(A1b, this.A01);
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A01);
        DJ0.A0G(parcel, this.A00, A002);
    }
}
