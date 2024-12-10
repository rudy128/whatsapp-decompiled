package org.whispersystems.curve25519;

import X.C21577AmR;
import X.C22562BCv;

public class OpportunisticCurve25519Provider implements C22562BCv {
    public C22562BCv A00;

    public byte[] BLs() {
        return this.A00.BLs();
    }

    public byte[] BXp() {
        return this.A00.BXp();
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.A00.calculateAgreement(bArr, bArr2);
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.calculateSignature(bArr, bArr2, bArr3);
    }

    public byte[] generatePublicKey(byte[] bArr) {
        return this.A00.generatePublicKey(bArr);
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.verifySignature(bArr, bArr2, bArr3);
    }

    public OpportunisticCurve25519Provider() {
        try {
            this.A00 = new NativeCurve25519Provider();
        } catch (C21577AmR unused) {
            this.A00 = new JavaCurve25519Provider();
        }
    }
}
