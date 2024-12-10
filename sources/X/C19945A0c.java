package X;

/* renamed from: X.A0c  reason: case insensitive filesystem */
public class C19945A0c {
    public final C22562BCv A00;

    public static C19945A0c A00() {
        try {
            return new C19945A0c((C22562BCv) Class.forName(AnonymousClass001.A1H("org.whispersystems.curve25519.", "OpportunisticCurve25519Provider", AnonymousClass000.A10())).newInstance());
        } catch (InstantiationException e) {
            throw new C21577AmR(e);
        } catch (IllegalAccessException e2) {
            throw new C21577AmR(e2);
        } catch (ClassNotFoundException e3) {
            throw new C21577AmR(e3);
        }
    }

    public boolean A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw AnonymousClass000.A0k("Invalid public key!");
        } else if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        } else {
            return this.A00.verifySignature(bArr, bArr2, bArr3);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw AnonymousClass000.A0k("Keys must not be null!");
        } else if (bArr.length == 32 && bArr2.length == 32) {
            return this.A00.calculateAgreement(bArr2, bArr);
        } else {
            throw AnonymousClass000.A0k("Keys must be 32 bytes!");
        }
    }

    public C19945A0c(C22562BCv bCv) {
        this.A00 = bCv;
    }
}
