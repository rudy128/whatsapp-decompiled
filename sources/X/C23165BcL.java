package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcL  reason: case insensitive filesystem */
public final class C23165BcL extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public final int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, Arrays.hashCode(this.A00));
        AnonymousClass000.A1M(objArr, Arrays.hashCode(this.A01));
        AnonymousClass3Ma.A1S(objArr, Arrays.hashCode(this.A02));
        C17890vO.A1G(objArr, Arrays.hashCode(this.A03));
        AnonymousClass3Ma.A1T(objArr, Arrays.hashCode(this.A04));
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        Integer A0a;
        Integer A0a2;
        Integer A0a3;
        Object[] objArr = new Object[5];
        byte[] bArr = this.A00;
        Integer num = null;
        if (bArr == null || bArr.length != 6) {
            str = null;
        } else {
            StringBuilder A0t = BE6.A0t(18);
            int i = 0;
            do {
                byte b = bArr[i];
                if (A0t.length() > 0) {
                    A0t.append(':');
                }
                Object[] objArr2 = new Object[1];
                BE6.A1S(objArr2, b, 0);
                A0t.append(String.format("%02x", objArr2));
                i++;
            } while (i < 6);
            str = A0t.toString();
            int i2 = 0;
            while (true) {
                int length = str.length();
                if (i2 >= length) {
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt < 'a' || charAt > 'z') {
                    i2++;
                } else {
                    char[] charArray = str.toCharArray();
                    while (i2 < length) {
                        char c = charArray[i2];
                        if (c >= 'a' && c <= 'z') {
                            charArray[i2] = (char) (c ^ ' ');
                        }
                        i2++;
                    }
                    str = String.valueOf(charArray);
                }
            }
        }
        objArr[0] = str;
        byte[] bArr2 = this.A01;
        if (bArr2 == null) {
            A0a = null;
        } else {
            A0a = BE8.A0a(bArr2);
        }
        objArr[1] = A0a;
        byte[] bArr3 = this.A02;
        if (bArr3 == null) {
            A0a2 = null;
        } else {
            A0a2 = BE8.A0a(bArr3);
        }
        objArr[2] = A0a2;
        byte[] bArr4 = this.A03;
        if (bArr4 == null) {
            A0a3 = null;
        } else {
            A0a3 = BE8.A0a(bArr4);
        }
        objArr[3] = A0a3;
        byte[] bArr5 = this.A04;
        if (bArr5 != null) {
            num = BE8.A0a(bArr5);
        }
        objArr[4] = num;
        return String.format("BleConnectivityInfo:<bleMacAddress hash: %s, bleGattCharacteristic hash: %s, actions hash: %s, psm hash: %s, deviceToken hash : %s>", objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23165BcL) {
            C23165BcL bcL = (C23165BcL) obj;
            if (!Arrays.equals(this.A00, bcL.A00) || !Arrays.equals(this.A01, bcL.A01) || !Arrays.equals(this.A02, bcL.A02) || !Arrays.equals(this.A03, bcL.A03) || !Arrays.equals(this.A04, bcL.A04)) {
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
        byte[] bArr4;
        byte[] bArr5 = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        byte[] bArr6 = null;
        if (bArr5 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr5.clone();
        }
        C26293Cx2.A0D(parcel, bArr, 1, false);
        byte[] bArr7 = this.A01;
        if (bArr7 == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr7.clone();
        }
        C26293Cx2.A0D(parcel, bArr2, 2, false);
        byte[] bArr8 = this.A02;
        if (bArr8 == null) {
            bArr3 = null;
        } else {
            bArr3 = (byte[]) bArr8.clone();
        }
        C26293Cx2.A0D(parcel, bArr3, 3, false);
        byte[] bArr9 = this.A03;
        if (bArr9 == null) {
            bArr4 = null;
        } else {
            bArr4 = (byte[]) bArr9.clone();
        }
        C26293Cx2.A0D(parcel, bArr4, 4, false);
        byte[] bArr10 = this.A04;
        if (bArr10 != null) {
            bArr6 = (byte[]) bArr10.clone();
        }
        C26293Cx2.A0D(parcel, bArr6, 5, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23165BcL(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.A00 = bArr;
        this.A01 = bArr2;
        this.A02 = bArr3;
        this.A03 = bArr4;
        this.A04 = bArr5;
    }
}
