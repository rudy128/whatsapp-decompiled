package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Bbf  reason: case insensitive filesystem */
public class C23126Bbf extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj instanceof C23126Bbf) {
            C23126Bbf bbf = (C23126Bbf) obj;
            if (!C25332Cdd.A01(this.A00, bbf.A00) || !C25332Cdd.A01(this.A01, bbf.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A01, C17890vO.A1a(this.A00), 1);
    }

    public C23126Bbf(String str, String str2) {
        C18210vx.A02(str, "Account identifier cannot be null");
        String trim = str.trim();
        C18210vx.A05(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        C18210vx.A03(str2);
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A01, 2, DJ0.A0K(parcel, this.A00));
        C26293Cx2.A05(parcel, A002);
    }
}
