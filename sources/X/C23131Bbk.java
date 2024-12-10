package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.Bbk  reason: case insensitive filesystem */
public class C23131Bbk extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23126Bbf A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj instanceof C23131Bbk) {
            C23131Bbk bbk = (C23131Bbk) obj;
            if (!C25332Cdd.A01(this.A01, bbk.A01) || !C25332Cdd.A01(this.A02, bbk.A02) || this.A00 != bbk.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A02, C17890vO.A1a(this.A01), 1);
    }

    public C23131Bbk(C23126Bbf bbf, String str, int i) {
        C18210vx.A00(bbf);
        this.A01 = bbf;
        this.A02 = str;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A02, 2, DJ0.A0I(parcel, this.A01, i));
        C26293Cx2.A06(parcel, 3, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
