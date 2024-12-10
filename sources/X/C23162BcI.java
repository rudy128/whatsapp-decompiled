package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcI  reason: case insensitive filesystem */
public final class C23162BcI extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C23162BcI) {
            C23162BcI bcI = (C23162BcI) obj;
            if (!Arrays.equals(this.A00, bcI.A00) || !Arrays.equals(this.A01, bcI.A01) || !Arrays.equals(this.A02, bcI.A02) || !Arrays.equals(this.A03, bcI.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        byte[] bArr5 = null;
        if (bArr4 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr4.clone();
        }
        C26293Cx2.A0D(parcel, bArr, 1, false);
        byte[] bArr6 = this.A01;
        if (bArr6 == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr6.clone();
        }
        C26293Cx2.A0D(parcel, bArr2, 2, false);
        byte[] bArr7 = this.A02;
        if (bArr7 == null) {
            bArr3 = null;
        } else {
            bArr3 = (byte[]) bArr7.clone();
        }
        C26293Cx2.A0D(parcel, bArr3, 3, false);
        byte[] bArr8 = this.A03;
        if (bArr8 != null) {
            bArr5 = (byte[]) bArr8.clone();
        }
        C26293Cx2.A0D(parcel, bArr5, 4, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23162BcI(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A00 = bArr;
        this.A01 = bArr2;
        this.A02 = bArr3;
        this.A03 = bArr4;
    }

    public final int hashCode() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, Arrays.hashCode(this.A00));
        AnonymousClass000.A1M(A1a, Arrays.hashCode(this.A01));
        AnonymousClass3Ma.A1S(A1a, Arrays.hashCode(this.A02));
        C17890vO.A1G(A1a, Arrays.hashCode(this.A03));
        return Arrays.hashCode(A1a);
    }

    public final String toString() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, Arrays.hashCode(this.A00));
        AnonymousClass000.A1M(A1a, Arrays.hashCode(this.A01));
        AnonymousClass3Ma.A1S(A1a, Arrays.hashCode(this.A02));
        C17890vO.A1G(A1a, Arrays.hashCode(this.A03));
        return String.format("WifiLanConnectivityInfo:<wifiLanPort hash: %s>, <wifiLanIp hash: %s>, <BSSID hash: %s>, <actions hash: %s>", A1a);
    }
}
