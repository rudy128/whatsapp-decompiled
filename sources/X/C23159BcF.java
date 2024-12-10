package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcF  reason: case insensitive filesystem */
public final class C23159BcF extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final DSS A00;
    public final DSS A01;
    public final DSS A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C23159BcF) {
            C23159BcF bcF = (C23159BcF) obj;
            if (!C25332Cdd.A01(this.A00, bcF.A00) || !C25332Cdd.A01(this.A01, bcF.A01) || !C25332Cdd.A01(this.A02, bcF.A02) || this.A03 != bcF.A03) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 4);
        A1b[1] = this.A01;
        A1b[2] = this.A02;
        C17890vO.A1G(A1b, this.A03);
        return Arrays.hashCode(A1b);
    }

    public final String toString() {
        String A002 = C19630ye.A00(DJ0.A0N(this.A00));
        String A003 = C19630ye.A00(DJ0.A0N(this.A01));
        String A004 = C19630ye.A00(DJ0.A0N(this.A02));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HmacSecretExtension{coseKeyAgreement=");
        A10.append(A002);
        A10.append(", saltEnc=");
        A10.append(A003);
        A10.append(", saltAuth=");
        A10.append(A004);
        A10.append(", getPinUvAuthProtocol=");
        A10.append(this.A03);
        return AnonymousClass000.A0y("}", A10);
    }

    public C23159BcF(DSS dss, DSS dss2, DSS dss3, int i) {
        this.A00 = dss;
        this.A01 = dss2;
        this.A02 = dss3;
        this.A03 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, DJ0.A0N(this.A00), 1, false);
        C26293Cx2.A0D(parcel, DJ0.A0N(this.A01), 2, false);
        C26293Cx2.A0D(parcel, DJ0.A0N(this.A02), 3, false);
        C26293Cx2.A06(parcel, 4, this.A03);
        C26293Cx2.A05(parcel, A002);
    }
}
