package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.AiX  reason: case insensitive filesystem */
public class C21344AiX implements Comparable {
    public final byte[] A00;

    public byte[] A00() {
        return C20011A3b.A00(new byte[]{5}, this.A00);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C21344AiX)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C21344AiX) obj).A00);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.A00).compareTo(new BigInteger(((C21344AiX) obj).A00));
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C21344AiX(byte[] bArr) {
        this.A00 = bArr;
    }
}
