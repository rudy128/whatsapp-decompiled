package com.whatsapp.ohai;

import X.AnonymousClass000;
import X.C17900vP;
import X.C18070vi;
import java.util.Arrays;

public final class PublicKeyConfig {
    public final short aeadId;
    public final short kdfId;
    public final short kemId;
    public final short publicKeyId;
    public final byte[] receiverPublicKey;

    public PublicKeyConfig(short s, short s2, short s3, short s4, byte[] bArr) {
        C18070vi.A0d(bArr, 5);
        this.publicKeyId = s;
        this.kemId = s2;
        this.kdfId = s3;
        this.aeadId = s4;
        this.receiverPublicKey = bArr;
    }

    public static /* synthetic */ PublicKeyConfig copy$default(PublicKeyConfig publicKeyConfig, short s, short s2, short s3, short s4, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            s = publicKeyConfig.publicKeyId;
        }
        if ((i & 2) != 0) {
            s2 = publicKeyConfig.kemId;
        }
        if ((i & 4) != 0) {
            s3 = publicKeyConfig.kdfId;
        }
        if ((i & 8) != 0) {
            s4 = publicKeyConfig.aeadId;
        }
        if ((i & 16) != 0) {
            bArr = publicKeyConfig.receiverPublicKey;
        }
        return publicKeyConfig.copy(s, s2, s3, s4, bArr);
    }

    public final short component1() {
        return this.publicKeyId;
    }

    public final short component2() {
        return this.kemId;
    }

    public final short component3() {
        return this.kdfId;
    }

    public final short component4() {
        return this.aeadId;
    }

    public final byte[] component5() {
        return this.receiverPublicKey;
    }

    public final PublicKeyConfig copy(short s, short s2, short s3, short s4, byte[] bArr) {
        C18070vi.A0d(bArr, 4);
        return new PublicKeyConfig(s, s2, s3, s4, bArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PublicKeyConfig) {
                PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
                if (!(this.publicKeyId == publicKeyConfig.publicKeyId && this.kemId == publicKeyConfig.kemId && this.kdfId == publicKeyConfig.kdfId && this.aeadId == publicKeyConfig.aeadId && C18070vi.A18(this.receiverPublicKey, publicKeyConfig.receiverPublicKey))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.publicKeyId * 31) + this.kemId) * 31) + this.kdfId) * 31) + this.aeadId) * 31) + Arrays.hashCode(this.receiverPublicKey);
    }

    public final short getAeadId() {
        return this.aeadId;
    }

    public final short getKdfId() {
        return this.kdfId;
    }

    public final short getKemId() {
        return this.kemId;
    }

    public final short getPublicKeyId() {
        return this.publicKeyId;
    }

    public final byte[] getReceiverPublicKey() {
        return this.receiverPublicKey;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyConfig(publicKeyId=");
        A10.append(this.publicKeyId);
        A10.append(", kemId=");
        A10.append(this.kemId);
        A10.append(", kdfId=");
        A10.append(this.kdfId);
        A10.append(", aeadId=");
        A10.append(this.aeadId);
        A10.append(", receiverPublicKey=");
        return C17900vP.A0B(Arrays.toString(this.receiverPublicKey), A10);
    }
}
