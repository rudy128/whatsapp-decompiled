package X;

/* renamed from: X.A5o  reason: case insensitive filesystem */
public abstract class C20065A5o {
    public static C21344AiX A01(byte[] bArr) {
        byte b = bArr[0] & 255;
        if (b == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new C21344AiX(bArr2);
        }
        throw new AnonymousClass1P8(AnonymousClass001.A1I("Bad key type: ", AnonymousClass000.A10(), b));
    }

    public static C21344AiX A00(DSQ dsq) {
        return A01(dsq.A06());
    }

    public static C185259cI A02() {
        C22562BCv bCv = C19945A0c.A00().A00;
        byte[] BLs = bCv.BLs();
        return new C185259cI(new AnonymousClass9ZN(BLs), new C21344AiX(bCv.generatePublicKey(BLs)));
    }

    public static byte[] A03(AnonymousClass9ZN r3, C21344AiX aiX) {
        return C19945A0c.A00().A02(aiX.A00, r3.A00);
    }
}
