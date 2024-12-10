package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bc9  reason: case insensitive filesystem */
public class C23153Bc9 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj instanceof C23153Bc9) {
            C23153Bc9 bc9 = (C23153Bc9) obj;
            if (!C25332Cdd.A01(this.A00, bc9.A00) || !C25332Cdd.A01(this.A01, bc9.A01) || !C25332Cdd.A01(this.A02, bc9.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 3);
        A1b[1] = this.A01;
        return AnonymousClass000.A0P(this.A02, A1b, 2);
    }

    public C23153Bc9(String str, String str2, String str3) {
        C18210vx.A00(str);
        this.A00 = str;
        C18210vx.A00(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyCredentialRpEntity{\n id='");
        A10.append(this.A00);
        A10.append("', \n name='");
        A10.append(this.A01);
        A10.append("', \n icon='");
        A10.append(this.A02);
        return AnonymousClass000.A0y("'}", A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 3, A0L);
        C26293Cx2.A0A(parcel, this.A02, 4, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
