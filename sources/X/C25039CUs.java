package X;

/* renamed from: X.CUs  reason: case insensitive filesystem */
public abstract class C25039CUs {
    public static final C25039CUs A00 = new C23564Bls(new C25805CmI("base16()", "0123456789ABCDEF".toCharArray()));
    public static final C25039CUs A01 = new C23565Blt(new C25805CmI("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final C25039CUs A02 = new C23565Blt(new C25805CmI("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
    public static final C25039CUs A03;
    public static final C25039CUs A04;

    public void A00(Appendable appendable, byte[] bArr, int i) {
        C23565Blt blt = (C23565Blt) this;
        if (blt instanceof C23563Blr) {
            C199610h.A04(appendable);
            C199610h.A03(0, i, bArr.length);
            int i2 = 0;
            for (int i3 = i; i3 >= 3; i3 -= 3) {
                int i4 = i2 + 1;
                int i5 = (bArr[i2] & 255) << 16;
                int i6 = i4 + 1;
                i2 = i6 + 1;
                byte A09 = BE7.A09(bArr, i4, i5) | (bArr[i6] & 255);
                char[] cArr = blt.A00.A07;
                BE6.A1G(appendable, cArr, A09 >>> 18);
                BE6.A1G(appendable, cArr, (A09 >>> 12) & 63);
                BE6.A1G(appendable, cArr, (A09 >>> 6) & 63);
                BE6.A1G(appendable, cArr, A09 & 63);
            }
            if (i2 < i) {
                blt.A02(appendable, bArr, i2, i - i2);
            }
        } else if (blt instanceof C23564Bls) {
            C23564Bls bls = (C23564Bls) blt;
            C199610h.A04(appendable);
            C199610h.A03(0, i, bArr.length);
            for (int i7 = 0; i7 < i; i7++) {
                byte b = bArr[i7] & 255;
                char[] cArr2 = bls.A00;
                BE6.A1G(appendable, cArr2, b);
                BE6.A1G(appendable, cArr2, b | 256);
            }
        } else {
            C199610h.A04(appendable);
            C199610h.A03(0, i, bArr.length);
            int i8 = 0;
            while (i8 < i) {
                int i9 = blt.A00.A01;
                blt.A02(appendable, bArr, i8, BE6.A09(i, i8, i9));
                i8 += i9;
            }
        }
    }

    static {
        C25805CmI cmI = new C25805CmI("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        C23565Blt blt = new C23565Blt(cmI, '=');
        C199610h.A07(AnonymousClass000.A1T(cmI.A07.length, 64));
        A03 = blt;
        C25805CmI cmI2 = new C25805CmI("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        C23565Blt blt2 = new C23565Blt(cmI2, '=');
        C199610h.A07(AnonymousClass000.A1T(cmI2.A07.length, 64));
        A04 = blt2;
    }
}
