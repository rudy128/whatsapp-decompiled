package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcB  reason: case insensitive filesystem */
public final class C23155BcB extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (obj instanceof C23155BcB) {
            C23155BcB bcB = (C23155BcB) obj;
            if (!Arrays.equals(this.A00, bcB.A00) || !Arrays.equals(this.A01, bcB.A01) || !Arrays.equals(this.A02, bcB.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        Integer A0a;
        Integer A0a2;
        byte[] bArr = this.A00;
        Object[] A1a = AnonymousClass8BR.A1a();
        Integer num = null;
        if (bArr == null) {
            A0a = null;
        } else {
            A0a = BE8.A0a(bArr);
        }
        A1a[0] = A0a;
        byte[] bArr2 = this.A01;
        if (bArr2 == null) {
            A0a2 = null;
        } else {
            A0a2 = BE8.A0a(bArr2);
        }
        A1a[1] = A0a2;
        byte[] bArr3 = this.A02;
        if (bArr3 != null) {
            num = BE8.A0a(bArr3);
        }
        A1a[2] = num;
        return String.format("BluetoothConnectivityInfo:<bluetoothMacAddress hash: %s, bluetoothUuid hash: %s, actions hash: %s>", A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        byte[] bArr4 = null;
        if (bArr3 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr3.clone();
        }
        C26293Cx2.A0D(parcel, bArr, 1, false);
        byte[] bArr5 = this.A01;
        if (bArr5 == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr5.clone();
        }
        C26293Cx2.A0D(parcel, bArr2, 2, false);
        byte[] bArr6 = this.A02;
        if (bArr6 != null) {
            bArr4 = (byte[]) bArr6.clone();
        }
        C26293Cx2.A0D(parcel, bArr4, 3, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23155BcB(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A00 = bArr;
        this.A01 = bArr2;
        this.A02 = bArr3;
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, Arrays.hashCode(this.A00));
        AnonymousClass000.A1M(A1a, Arrays.hashCode(this.A01));
        AnonymousClass3Ma.A1S(A1a, Arrays.hashCode(this.A02));
        return Arrays.hashCode(A1a);
    }
}
