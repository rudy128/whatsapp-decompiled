package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcE  reason: case insensitive filesystem */
public class C23158BcE extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final DSS A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (obj instanceof C23158BcE) {
            C23158BcE bcE = (C23158BcE) obj;
            if (!C25332Cdd.A01(this.A00, bcE.A00) || !C25332Cdd.A01(this.A01, bcE.A01) || !C25332Cdd.A01(this.A02, bcE.A02) || !C25332Cdd.A01(this.A03, bcE.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 4);
        A1b[1] = this.A01;
        A1b[2] = this.A02;
        return AnonymousClass000.A0P(this.A03, A1b, 3);
    }

    public final String toString() {
        String A002 = C19630ye.A00(this.A00.A04());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyCredentialUserEntity{\n id=");
        A10.append(A002);
        A10.append(", \n name='");
        A10.append(this.A01);
        A10.append("', \n icon='");
        A10.append(this.A02);
        A10.append("', \n displayName='");
        A10.append(this.A03);
        return AnonymousClass000.A0y("'}", A10);
    }

    public C23158BcE(String str, String str2, String str3, byte[] bArr) {
        C23362Bfo A09 = DJ0.A09(bArr);
        C18210vx.A00(A09);
        this.A00 = A09;
        C18210vx.A00(str);
        this.A01 = str;
        this.A02 = str2;
        C18210vx.A00(str3);
        this.A03 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A00.A04(), 2, false);
        C26293Cx2.A0A(parcel, this.A01, 3, false);
        C26293Cx2.A0A(parcel, this.A02, 4, false);
        C26293Cx2.A0A(parcel, this.A03, 5, false);
        C26293Cx2.A05(parcel, A002);
    }
}
