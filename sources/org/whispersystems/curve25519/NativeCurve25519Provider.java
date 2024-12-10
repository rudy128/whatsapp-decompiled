package org.whispersystems.curve25519;

import X.C21577AmR;
import X.C22562BCv;
import X.C56312hG;

public class NativeCurve25519Provider implements C22562BCv {
    public C56312hG A00 = new Object();

    private native boolean smokeCheck(int i);

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public byte[] BLs() {
        byte[] bArr = new byte[32];
        this.A00.A00(bArr);
        return generatePrivateKey(bArr);
    }

    public byte[] BXp() {
        byte[] bArr = new byte[64];
        this.A00.A00(bArr);
        return bArr;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2hG, java.lang.Object] */
    public NativeCurve25519Provider() {
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e) {
            throw new C21577AmR(e);
        }
    }
}
