package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bcm  reason: case insensitive filesystem */
public final class C23192Bcm extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C23193Bcn A00;
    public byte[] A01;
    public boolean A02;
    public int[] A03;
    public int[] A04;
    public C23205Bcz[] A05;
    public String[] A06;
    public byte[][] A07;
    public final C23322BfA A08;

    public C23192Bcm(C23322BfA bfA, C23193Bcn bcn) {
        this.A00 = bcn;
        this.A08 = bfA;
        this.A03 = null;
        this.A06 = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A02 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23192Bcm) {
                C23192Bcm bcm = (C23192Bcm) obj;
                if (!C25332Cdd.A01(this.A00, bcm.A00) || !Arrays.equals(this.A01, bcm.A01) || !Arrays.equals(this.A03, bcm.A03) || !Arrays.equals(this.A06, bcm.A06) || !C25332Cdd.A01(this.A08, bcm.A08) || !Arrays.equals(this.A04, bcm.A04) || !Arrays.deepEquals(this.A07, bcm.A07) || !Arrays.equals(this.A05, bcm.A05) || this.A02 != bcm.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A06;
        objArr[4] = this.A08;
        objArr[5] = null;
        objArr[6] = null;
        objArr[7] = this.A04;
        objArr[8] = this.A07;
        objArr[9] = this.A05;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A02), objArr, 10);
    }

    public final String toString() {
        String str;
        StringBuilder A0u = BE6.A0u("LogEventParcelable[");
        A0u.append(this.A00);
        A0u.append(", LogEventBytes: ");
        byte[] bArr = this.A01;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        A0u.append(str);
        A0u.append(", TestCodes: ");
        A0u.append(Arrays.toString(this.A03));
        A0u.append(", MendelPackages: ");
        BE6.A1L(A0u, this.A06);
        A0u.append(", LogEvent: ");
        A0u.append(this.A08);
        AnonymousClass000.A1G(A0u, ", ExtensionProducer: ");
        AnonymousClass000.A1G(A0u, ", VeProducer: ");
        A0u.append(", ExperimentIDs: ");
        A0u.append(Arrays.toString(this.A04));
        A0u.append(", ExperimentTokens: ");
        BE6.A1L(A0u, this.A07);
        A0u.append(", ExperimentTokensParcelables: ");
        BE6.A1L(A0u, this.A05);
        A0u.append(", AddPhenotypeExperimentTokens: ");
        A0u.append(this.A02);
        return AnonymousClass000.A0z(A0u);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A01, 3, DJ0.A0J(parcel, this.A00, i));
        C26293Cx2.A0E(parcel, this.A03, 4);
        C26293Cx2.A0G(parcel, this.A06, 5);
        C26293Cx2.A0E(parcel, this.A04, 6);
        C26293Cx2.A0H(parcel, this.A07, 7);
        C26293Cx2.A08(parcel, 8, this.A02);
        C26293Cx2.A0F(parcel, this.A05, 9, i);
        C26293Cx2.A05(parcel, A002);
    }

    public C23192Bcm(C23193Bcn bcn, byte[] bArr, int[] iArr, int[] iArr2, C23205Bcz[] bczArr, String[] strArr, byte[][] bArr2, boolean z) {
        this.A00 = bcn;
        this.A01 = bArr;
        this.A03 = iArr;
        this.A06 = strArr;
        this.A08 = null;
        this.A04 = iArr2;
        this.A07 = bArr2;
        this.A05 = bczArr;
        this.A02 = z;
    }
}
