package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcT  reason: case insensitive filesystem */
public class C23173BcT extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C0Z A00;
    public final Boolean A01;
    public final C24367C0c A02;
    public final C0V A03;

    public C24367C0c A00() {
        C24367C0c c0c = this.A02;
        if (c0c != null) {
            return c0c;
        }
        Boolean bool = this.A01;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return C24367C0c.RESIDENT_KEY_REQUIRED;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23173BcT) {
            C23173BcT bcT = (C23173BcT) obj;
            if (!C25332Cdd.A01(this.A00, bcT.A00) || !C25332Cdd.A01(this.A01, bcT.A01) || !C25332Cdd.A01(this.A03, bcT.A03) || !C25332Cdd.A01(A00(), bcT.A00())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 4);
        A1b[1] = this.A01;
        A1b[2] = this.A03;
        return AnonymousClass000.A0P(A00(), A1b, 3);
    }

    public final String toString() {
        C24367C0c c0c = this.A02;
        C0V c0v = this.A03;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(c0v);
        String valueOf3 = String.valueOf(c0c);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AuthenticatorSelectionCriteria{\n attachment=");
        A10.append(valueOf);
        A10.append(", \n requireResidentKey=");
        A10.append(this.A01);
        A10.append(", \n requireUserVerification=");
        A10.append(valueOf2);
        A10.append(", \n residentKeyRequirement=");
        A10.append(valueOf3);
        return AnonymousClass000.A0y("\n }", A10);
    }

    public C23173BcT(Boolean bool, String str, String str2, String str3) {
        C0Z c0z;
        C0V c0v;
        C24367C0c c0c = null;
        if (str == null) {
            c0z = null;
        } else {
            try {
                c0z = C0Z.A00(str);
            } catch (C1W | C24382C1b | C1d e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = c0z;
        this.A01 = bool;
        if (str2 == null) {
            c0v = null;
        } else {
            C0V[] values = C0V.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                c0v = values[i];
                if (!str2.equals(c0v.zze)) {
                    i++;
                }
            }
            throw new C1d(str2);
        }
        this.A03 = c0v;
        this.A02 = str3 != null ? C24367C0c.A00(str3) : c0c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, C17900vP.A08(this.A00));
        Boolean bool = this.A01;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C26293Cx2.A0A(parcel, C17900vP.A08(this.A03), 4, A0L);
        C26293Cx2.A0A(parcel, C17900vP.A08(A00()), 5, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
