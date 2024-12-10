package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bck  reason: case insensitive filesystem */
public final class C23190Bck extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public byte[] A05;
    public byte[] A06;
    public C23171BcR A07;
    public C23166BcM A08;
    public byte[] A09;
    public final int A0A;
    public final int A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23190Bck) {
                C23190Bck bck = (C23190Bck) obj;
                if (C25332Cdd.A01(this.A00, bck.A00) && C25332Cdd.A01(this.A01, bck.A01) && C25332Cdd.A01(this.A02, bck.A02) && DJ0.A0M(Boolean.valueOf(this.A03), bck.A03) && Arrays.equals(this.A09, bck.A09) && Arrays.equals(this.A05, bck.A05) && Arrays.equals(this.A06, bck.A06) && DJ0.A0M(Boolean.valueOf(this.A04), bck.A04)) {
                    if (DJ0.A0H(bck.A0B, Integer.valueOf(this.A0B)) && C25332Cdd.A01(this.A07, bck.A07) && C25332Cdd.A01(this.A08, bck.A08)) {
                        if (DJ0.A0H(bck.A0A, Integer.valueOf(this.A0A))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[12];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        BE8.A1P(objArr, this.A03);
        AnonymousClass3Ma.A1T(objArr, Arrays.hashCode(this.A09));
        AnonymousClass3Ma.A1U(objArr, Arrays.hashCode(this.A05));
        C17890vO.A1H(objArr, Arrays.hashCode(this.A06));
        objArr[7] = Boolean.valueOf(this.A04);
        objArr[8] = Integer.valueOf(this.A0B);
        objArr[9] = this.A07;
        objArr[10] = this.A08;
        return AnonymousClass000.A0P(Integer.valueOf(this.A0A), objArr, 11);
    }

    public C23190Bck(C23171BcR bcR, C23166BcM bcM, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = z;
        this.A09 = bArr;
        this.A05 = bArr2;
        this.A06 = bArr3;
        this.A04 = z2;
        this.A0B = i;
        this.A07 = bcR;
        this.A08 = bcM;
        this.A0A = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 2, A0K);
        C26293Cx2.A0A(parcel, this.A02, 3, A0K);
        C26293Cx2.A08(parcel, 4, this.A03);
        C26293Cx2.A0D(parcel, this.A09, 5, A0K);
        C26293Cx2.A0D(parcel, this.A05, 6, A0K);
        C26293Cx2.A0D(parcel, this.A06, 7, A0K);
        C26293Cx2.A08(parcel, 8, this.A04);
        C26293Cx2.A06(parcel, 9, this.A0B);
        C26293Cx2.A09(parcel, this.A07, 10, i, A0K);
        C26293Cx2.A09(parcel, this.A08, 11, i, A0K);
        C26293Cx2.A06(parcel, 12, this.A0A);
        C26293Cx2.A05(parcel, A002);
    }

    public C23190Bck() {
        this.A0B = 0;
        this.A0A = 0;
    }
}
