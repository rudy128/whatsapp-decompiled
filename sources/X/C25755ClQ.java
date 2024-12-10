package X;

/* renamed from: X.ClQ  reason: case insensitive filesystem */
public abstract class C25755ClQ {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final int hashCode() {
        byte[] bArr = ((C23357Bfj) this).zza;
        int length = bArr.length;
        if (length * 8 < 32) {
            byte b = bArr[0] & 255;
            for (int i = 1; i < length; i++) {
                b |= (bArr[i] & 255) << (i * 8);
            }
            return b;
        } else if (length >= 4) {
            byte b2 = bArr[0] & 255;
            byte b3 = bArr[1] & 255;
            byte b4 = bArr[2] & 255;
            return ((bArr[3] & 255) << 24) | b2 | (b3 << 8) | (b4 << 16);
        } else {
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, length, 0);
            throw AnonymousClass000.A0n(CBB.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", objArr));
        }
    }

    public final String toString() {
        StringBuilder A0t = BE6.A0t(r5 + r5);
        for (byte b : ((C23357Bfj) this).zza) {
            char[] cArr = A00;
            A0t.append(cArr[(b >> 4) & 15]);
            A0t.append(cArr[b & 15]);
        }
        return A0t.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25755ClQ) {
            byte[] bArr = ((C23357Bfj) this).zza;
            int length = bArr.length;
            int i = length * 8;
            byte[] bArr2 = ((C23357Bfj) ((C25755ClQ) obj)).zza;
            int length2 = bArr2.length;
            if (i == length2 * 8 && length == length2) {
                boolean z = true;
                for (int i2 = 0; i2 < length; i2++) {
                    z &= AnonymousClass000.A1T(bArr[i2], bArr2[i2]);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }
}
