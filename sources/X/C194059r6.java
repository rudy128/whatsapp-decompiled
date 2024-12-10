package X;

import java.util.Arrays;

/* renamed from: X.9r6  reason: invalid class name and case insensitive filesystem */
public final class C194059r6 {
    public final int A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C18070vi.A18(cls2, cls)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.protocol.EncryptedMessage");
                C194059r6 r5 = (C194059r6) obj;
                if (this.A00 == r5.A00) {
                    byte[] bArr = this.A01;
                    byte[] bArr2 = r5.A01;
                    if (bArr != null) {
                        if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                            return false;
                        }
                    } else if (bArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (62 + this.A00) * 31;
        byte[] bArr = this.A01;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public C194059r6(byte[] bArr, int i) {
        this.A00 = i;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptedMessage{ciphertextVersion=");
        A10.append(2);
        A10.append(", ciphertextType=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
