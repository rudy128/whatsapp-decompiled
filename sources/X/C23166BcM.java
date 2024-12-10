package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcM  reason: case insensitive filesystem */
public final class C23166BcM extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte[] A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;
    public final byte[] A04;

    public final boolean equals(Object obj) {
        if (obj instanceof C23166BcM) {
            C23166BcM bcM = (C23166BcM) obj;
            if (!C25332Cdd.A01(this.A02, bcM.A02) || !Arrays.equals(this.A03, bcM.A03) || !Arrays.equals(this.A04, bcM.A04) || !Arrays.equals(this.A00, bcM.A00) || this.A01 != bcM.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A02, 5);
        AnonymousClass000.A1M(A1b, Arrays.hashCode(this.A03));
        AnonymousClass3Ma.A1S(A1b, Arrays.hashCode(this.A04));
        C17890vO.A1G(A1b, Arrays.hashCode(this.A00));
        AnonymousClass3Ma.A1T(A1b, this.A01);
        return Arrays.hashCode(A1b);
    }

    public final String toString() {
        String arrays;
        String str;
        Object[] A1b = AnonymousClass000.A1b(this.A02, 4);
        byte[] bArr = this.A03;
        String str2 = null;
        if (bArr == null) {
            arrays = null;
        } else {
            arrays = Arrays.toString(bArr);
        }
        A1b[1] = arrays;
        byte[] bArr2 = this.A00;
        if (bArr2 != null) {
            str2 = Arrays.toString(bArr2);
        }
        A1b[2] = str2;
        int i = this.A01;
        if (i == 0) {
            str = "UNKNOWN";
        } else if (i == 1) {
            str = "Main";
        } else if (i != 2) {
            str = "OTHER";
        } else {
            str = "Secondary";
        }
        A1b[3] = str;
        return String.format("ConnectionsDevice:<endpointId: %s, endpointInfo: %s, connectivityBytes: %s, instanceType : %s>", A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        String str = this.A02;
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, str);
        byte[] bArr2 = this.A03;
        byte[] bArr3 = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        C26293Cx2.A0D(parcel, bArr, 2, A0K);
        byte[] bArr4 = this.A04;
        if (bArr4 != null) {
            bArr3 = (byte[]) bArr4.clone();
        }
        C26293Cx2.A0D(parcel, bArr3, 3, A0K);
        C26293Cx2.A0D(parcel, this.A00, 4, A0K);
        C26293Cx2.A06(parcel, 5, this.A01);
        C26293Cx2.A05(parcel, A002);
    }

    public C23166BcM(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.A02 = str;
        this.A03 = bArr;
        this.A04 = bArr2;
        this.A00 = bArr3;
        this.A01 = i;
    }
}
