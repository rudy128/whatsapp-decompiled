package X;

import javax.security.auth.Destroyable;

/* renamed from: X.AlW  reason: case insensitive filesystem */
public class C21523AlW implements Destroyable {
    public boolean A00;
    public final C21520AlT A01;
    public final C21521AlU A02;

    public static C21523AlW A01(byte[] bArr) {
        if (bArr.length != 64) {
            return null;
        }
        byte[][] A06 = A8G.A06(bArr, 32, 32);
        return new C21523AlW(new C21520AlT(A06[0]), new C21521AlU(A06[1]));
    }

    public byte[] A02() {
        return A8G.A05(this.A01.A01, this.A02.A01);
    }

    public void destroy() {
        if (!this.A00) {
            this.A01.destroy();
            this.A02.destroy();
            this.A00 = true;
        }
    }

    public C21523AlW(C21520AlT alT, C21521AlU alU) {
        this.A02 = alU;
        this.A01 = alT;
    }

    public static C21523AlW A00() {
        C22562BCv bCv = C19945A0c.A00().A00;
        byte[] BLs = bCv.BLs();
        return new C21523AlW(new C21520AlT(BLs), new C21521AlU(bCv.generatePublicKey(BLs)));
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
