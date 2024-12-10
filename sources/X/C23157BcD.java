package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.BcD  reason: case insensitive filesystem */
public class C23157BcD extends DJ0 {
    public static final C23341BfT A03;
    public static final Parcelable.Creator CREATOR = new Object();
    public final C24365C0a A00;
    public final DSS A01;
    public final List A02;

    public C23157BcD(String str, List list, byte[] bArr) {
        C23362Bfo A012 = DSS.A01(bArr, bArr.length);
        C18210vx.A00(str);
        try {
            this.A00 = C24365C0a.A00(str);
            C18210vx.A00(A012);
            this.A01 = A012;
            this.A02 = list;
        } catch (C24381C1a e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        Object[] objArr = new Object[2];
        AnonymousClass001.A1Q(CHE.A00, CHE.A01, objArr);
        A03 = C23341BfT.A03(objArr, 2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23157BcD) {
            C23157BcD bcD = (C23157BcD) obj;
            if (this.A00.equals(bcD.A00) && C25332Cdd.A01(this.A01, bcD.A01)) {
                List list = this.A02;
                List list2 = bcD.A02;
                if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 3);
        A1b[1] = this.A01;
        return AnonymousClass000.A0P(this.A02, A1b, 2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        String A002 = C19630ye.A00(this.A01.A04());
        String valueOf2 = String.valueOf(this.A02);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyCredentialDescriptor{\n type=");
        A10.append(valueOf);
        A10.append(", \n id=");
        A10.append(A002);
        A10.append(", \n transports=");
        return BEA.A0n(valueOf2, A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A00.toString());
        C26293Cx2.A0D(parcel, this.A01.A04(), 3, A0L);
        C26293Cx2.A0C(parcel, this.A02, 4, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
