package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bc3  reason: case insensitive filesystem */
public class C23150Bc3 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final D41 A00;
    public final C24365C0a A01;

    public boolean equals(Object obj) {
        if (obj instanceof C23150Bc3) {
            C23150Bc3 bc3 = (C23150Bc3) obj;
            if (!this.A01.equals(bc3.A01) || !this.A00.equals(bc3.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A00, C17890vO.A1a(this.A01), 1);
    }

    public final String toString() {
        D41 d41 = this.A00;
        String valueOf = String.valueOf(this.A01);
        String valueOf2 = String.valueOf(d41);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyCredentialParameters{\n type=");
        A10.append(valueOf);
        A10.append(", \n algorithm=");
        A10.append(valueOf2);
        return AnonymousClass000.A0y("\n }", A10);
    }

    public C23150Bc3(String str, int i) {
        C18210vx.A00(str);
        try {
            this.A01 = C24365C0a.A00(str);
            C18210vx.A00(Integer.valueOf(i));
            try {
                this.A00 = D41.A00(i);
            } catch (C1Y e) {
                throw new IllegalArgumentException(e);
            }
        } catch (C24381C1a e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A01.toString(), 2, false);
        int BMk = this.A00.A00.BMk();
        if (Integer.valueOf(BMk) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(BMk);
        }
        C26293Cx2.A05(parcel, A002);
    }
}
