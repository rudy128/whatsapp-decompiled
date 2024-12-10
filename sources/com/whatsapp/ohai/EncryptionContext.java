package com.whatsapp.ohai;

import X.AnonymousClass000;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import java.util.Arrays;

public final class EncryptionContext {
    public final byte[] baseNonce;
    public final byte[] exportedSecret;
    public final byte[] sequence;
    public final byte[] symmetricKey;

    public static /* synthetic */ EncryptionContext copy$default(EncryptionContext encryptionContext, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = encryptionContext.symmetricKey;
        }
        if ((i & 2) != 0) {
            bArr2 = encryptionContext.baseNonce;
        }
        if ((i & 4) != 0) {
            bArr3 = encryptionContext.sequence;
        }
        if ((i & 8) != 0) {
            bArr4 = encryptionContext.exportedSecret;
        }
        return encryptionContext.copy(bArr, bArr2, bArr3, bArr4);
    }

    public final byte[] component1() {
        return this.symmetricKey;
    }

    public final byte[] component2() {
        return this.baseNonce;
    }

    public final byte[] component3() {
        return this.sequence;
    }

    public final byte[] component4() {
        return this.exportedSecret;
    }

    public final EncryptionContext copy(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C18070vi.A0d(bArr, 0);
        C18070vi.A0o(bArr2, bArr3, bArr4);
        return new EncryptionContext(bArr, bArr2, bArr3, bArr4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EncryptionContext) {
                EncryptionContext encryptionContext = (EncryptionContext) obj;
                if (!C18070vi.A18(this.symmetricKey, encryptionContext.symmetricKey) || !C18070vi.A18(this.baseNonce, encryptionContext.baseNonce) || !C18070vi.A18(this.sequence, encryptionContext.sequence) || !C18070vi.A18(this.exportedSecret, encryptionContext.exportedSecret)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.symmetricKey) * 31) + Arrays.hashCode(this.baseNonce)) * 31) + Arrays.hashCode(this.sequence)) * 31) + Arrays.hashCode(this.exportedSecret);
    }

    public EncryptionContext(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C18070vi.A0s(bArr, bArr2, bArr3, bArr4);
        this.symmetricKey = bArr;
        this.baseNonce = bArr2;
        this.sequence = bArr3;
        this.exportedSecret = bArr4;
    }

    public final byte[] getBaseNonce() {
        return this.baseNonce;
    }

    public final byte[] getExportedSecret() {
        return this.exportedSecret;
    }

    public final byte[] getSequence() {
        return this.sequence;
    }

    public final byte[] getSymmetricKey() {
        return this.symmetricKey;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptionContext(symmetricKey=");
        C17890vO.A1C(A10, this.symmetricKey);
        A10.append(", baseNonce=");
        C17890vO.A1C(A10, this.baseNonce);
        A10.append(", sequence=");
        C17890vO.A1C(A10, this.sequence);
        A10.append(", exportedSecret=");
        return C17900vP.A0B(Arrays.toString(this.exportedSecret), A10);
    }
}
