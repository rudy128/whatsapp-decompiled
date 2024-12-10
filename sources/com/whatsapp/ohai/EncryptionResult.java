package com.whatsapp.ohai;

import X.AnonymousClass000;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import java.util.Arrays;

public final class EncryptionResult {
    public final byte[] cipherText;
    public final EncryptionContext encryptionContext;
    public final byte[] keyEncapsulation;

    public static /* synthetic */ EncryptionResult copy$default(EncryptionResult encryptionResult, EncryptionContext encryptionContext2, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            encryptionContext2 = encryptionResult.encryptionContext;
        }
        if ((i & 2) != 0) {
            bArr = encryptionResult.keyEncapsulation;
        }
        if ((i & 4) != 0) {
            bArr2 = encryptionResult.cipherText;
        }
        return encryptionResult.copy(encryptionContext2, bArr, bArr2);
    }

    public final EncryptionContext component1() {
        return this.encryptionContext;
    }

    public final byte[] component2() {
        return this.keyEncapsulation;
    }

    public final byte[] component3() {
        return this.cipherText;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EncryptionResult) {
                EncryptionResult encryptionResult = (EncryptionResult) obj;
                if (!C18070vi.A18(this.encryptionContext, encryptionResult.encryptionContext) || !C18070vi.A18(this.keyEncapsulation, encryptionResult.keyEncapsulation) || !C18070vi.A18(this.cipherText, encryptionResult.cipherText)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.encryptionContext) + Arrays.hashCode(this.keyEncapsulation)) * 31) + Arrays.hashCode(this.cipherText);
    }

    public EncryptionResult(EncryptionContext encryptionContext2, byte[] bArr, byte[] bArr2) {
        C18070vi.A0o(encryptionContext2, bArr, bArr2);
        this.encryptionContext = encryptionContext2;
        this.keyEncapsulation = bArr;
        this.cipherText = bArr2;
    }

    public final EncryptionResult copy(EncryptionContext encryptionContext2, byte[] bArr, byte[] bArr2) {
        C18070vi.A0n(encryptionContext2, bArr, bArr2);
        return new EncryptionResult(encryptionContext2, bArr, bArr2);
    }

    public final byte[] getCipherText() {
        return this.cipherText;
    }

    public final EncryptionContext getEncryptionContext() {
        return this.encryptionContext;
    }

    public final byte[] getKeyEncapsulation() {
        return this.keyEncapsulation;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptionResult(encryptionContext=");
        A10.append(this.encryptionContext);
        A10.append(", keyEncapsulation=");
        C17890vO.A1C(A10, this.keyEncapsulation);
        A10.append(", cipherText=");
        return C17900vP.A0B(Arrays.toString(this.cipherText), A10);
    }
}
